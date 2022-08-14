package ds.service1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import ds.service1.Service1Grpc.Service1BlockingStub;
import ds.service1.Service1Grpc.Service1Stub;
import ds.service3.Service3;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class Service1Client {
	private static Logger logger = Logger.getLogger(Service3.class.getName());
	// variables for service discovery:
	private ServiceInfo service1Info;
	// variables for stubs:
	private static Service1BlockingStub blockingStub;
	private static Service1Stub asyncStub;

	public static void main(String[] args) throws Exception {
		Service1Client service1Client = new Service1Client();

		// discovery service:
		System.out.println("service 1 to be invoked ...");

		String service1_type = "_service1_http._tcp.local.";
		service1Client.discoverService1ClimateControl(service1_type);

		String host = service1Client.service1Info.getHostAddresses()[0]; // localhost
		// String host = "localhost";
		// int port = 50051;
		int port = service1Client.service1Info.getPort(); // 50051

		/*
		 * Build a channel to connect to the server, using localhost as IP and
		 * predefined port .usePlaintext() does not provide encryption
		 */
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		System.out.println("service 1 was run, host is:" + host + " port is: " + port);
		logger.info("Channel started on jmDNS, listening on " + port + " host name: " + host);

		// stubs -- generate from proto
		blockingStub = Service1Grpc.newBlockingStub(channel);
		asyncStub = Service1Grpc.newStub(channel);

		// Calling methods
		desiredSettingHVAC();
		hVACstatus();
		roomStatus();
		// Gracefully shutting down the channel:
		// channel.shutdown().awaitTermination(port, TimeUnit.MILLISECONDS);

	}

	// unary rpc
	public static void desiredSettingHVAC() {
		String roomName = "reception";
		double desiredHumidity = 67;
		double desiredTempInCelcius = 24.4;
		System.out.println("\nCALLING: desiredSettingHVAC(), request is:");
		System.out.println("\troomName is: " + roomName + " desiredHumidity: " + desiredHumidity
				+ "desiredTempInCelcius" + desiredTempInCelcius);
		// building reply and received response:
		DesiredRoomConditions req = DesiredRoomConditions.newBuilder().setRoomName(roomName)
				.setDesiredHumidity(desiredHumidity).setDesiredTempInCelcius(desiredTempInCelcius).build();
		// implementing DEADLINE on the stub:
		try {
			Confirmation response = blockingStub.withDeadlineAfter(5, TimeUnit.SECONDS).desiredSettingHVAC(req);
			System.out.println("\t desiredSettingHVAC() run correctly");
			System.out.println("\tresponse is: " + response.getConfirmation());
			System.out.println("END: desiredSettingHVAC()");
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	}

	/**
	 * Async client-streaming example.
	 */
	// Method:
	public static void hVACstatus() {
		System.out.println("\nCALLING: HVACstatus()");
		StreamObserver<Acknowledged> responseObserver = new StreamObserver<Acknowledged>() {

			@Override
			public void onNext(Acknowledged value) {
				System.out.println("\treceiving confirmation: " + value.getAcknowledgment());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				System.out.println("END hVACstatus()");

			}

		};

		// Implementing DEADLINE on the stub:
		StreamObserver<CurrentRoomConditions> requestObserver = asyncStub.withDeadlineAfter(10, TimeUnit.SECONDS)
				.hVACstatus(responseObserver);

		try {

			requestObserver.onNext(CurrentRoomConditions.newBuilder().setRoomName("consultation room").setHumidity(89)
					.setTempInCelcius(25).build());
			requestObserver.onNext(CurrentRoomConditions.newBuilder().setRoomName("hallway").setHumidity(40)
					.setTempInCelcius(19).build());

			System.out.println("\tSENDING EMSSAGES in hVACstatus()");

			// Mark the end of requests
			requestObserver.onCompleted();

			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// unary rpc request
	public static void roomStatus() {
		String roomName = "reception";
		System.out.println("\nCALLING: desiredSettingHVAC(), request is:");
		System.out.println("\troomName is: " + roomName);
		Room req = Room.newBuilder().setRoomName(roomName).build();
		try {
			// Iterator<AdjustHVAC> responses = blockingStub.roomStatus(req);
			// Implementing DEADLINE on the stub:
			Iterator<AdjustHVAC> responses = blockingStub.withDeadlineAfter(15, TimeUnit.SECONDS).roomStatus(req);
			System.out.println("\tdesiredSettingHVAC() run correctly");

			while (responses.hasNext()) {
				AdjustHVAC temp = responses.next();
				System.out.println("\tresponse is: " + "HumidityDifference: " + temp.getHumidityDifference()
						+ ", TempDifference is:" + temp.getTempDifference());
			}
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}
		System.out.println("END: desiredSettingHVAC()");
	}

	// DISCOVERY for all methods below:
	// Service 1
	private void discoverService1ClimateControl(String service_type) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			// System.out.println("TEST : before calling jmdns.addServiceListener()" +
			// service1Info);
			jmdns.addServiceListener(service_type, new ServiceListener() {

				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Service1 resolved: " + event.getInfo());

					service1Info = event.getInfo();

					int port = service1Info.getPort();

					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:" + event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + service1Info.getNiceTextString());
					System.out.println("\t host: " + service1Info.getHostAddresses()[0]);

				}

				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Service1 removed: " + event.getInfo());

				}

				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Service1 added: " + event.getInfo());

				}
			});

			// Wait a bit
			Thread.sleep(2000);

			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
