package ds.service2;

import java.io.IOException;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import ds.service2.Service2Client;
import ds.service2.Service2Grpc.Service2BlockingStub;
import ds.service2.Service2Grpc.Service2Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Service2Client {
	private static Logger logger = Logger.getLogger(Service2.class.getName());
	// variables for service discovery:
	private ServiceInfo service2Info;
	// variables for stubs:
	private static Service2BlockingStub blockingStub;
	private static Service2Stub asyncStub;

	public static void main(String[] args) throws Exception {
		Service2Client service2Client = new Service2Client();

		// discovery service:
		System.out.println("service 2 to be invoked ...");

		String service2_type = "_service2_http._tcp.local.";
		service2Client.discoverService2DeskUsage(service2_type);

		String host = service2Client.service2Info.getHostAddresses()[0]; // localhost
		// String host = "localhost";
		// int port = 50053;
		int port = service2Client.service2Info.getPort(); // 50053

		/*
		 * Build a channel to connect to the server, using localhost as IP and
		 * predefined port .usePlaintext() does not provide encryption
		 */
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		System.out.println("service 2 was run, host is:" + host + " port is: " + port);
		// stubs -- generate from proto
		blockingStub = Service2Grpc.newBlockingStub(channel);

		asyncStub = Service2Grpc.newStub(channel);
		// Calling methods

		deskStatusHeight();
		chairStatusHeight();
		// Gracefully shutting down the channel:
		channel.shutdown().awaitTermination(port, TimeUnit.MILLISECONDS);

	}

	// unary rpc
	public static void deskStatusHeight() {
		String roomName = "reception";
		int deskNumber = 4;
		int desiredDeskHeightChange = 5;
		DeskDetailsRequest.Operation operation = DeskDetailsRequest.Operation.forNumber(1);

		System.out.println("\nCALLING: deskStatusHeight(), request is:");
		System.out.println("\troomName is: " + roomName + " deskNumber: " + deskNumber + " desiredDeskHeight: "
				+ desiredDeskHeightChange);

		// building reply and received response:
		DeskDetailsRequest req = DeskDetailsRequest.newBuilder().setRoomName(roomName).setDeskNumber(deskNumber)
				.setDesiredDeskHeight(desiredDeskHeightChange).setOperation(operation).build();
		// System.out.println("\nREQUEST IS : "+ req);
		DeskAdjustedResponse response = blockingStub.deskStatusHeight(req);
		System.out.println("\t desiredSettingHVAC() run correctly");
		System.out.println("\tresponse is: desk adjusted: " + response.getIsHeightAdjusted() + " deskHeight is: "
				+ response.getDeskHeight());
		System.out.println("END: desiredSettingHVAC()");
	}

	// unary rpc client
	public static void chairStatusHeight() {
		String roomName = "reception";
		int deskNumber = 4;
		int chairHeightChange = 5;
		Chair.Builder chairRequest = Chair.newBuilder().setChairHeight(chairHeightChange).setDeskNumber(deskNumber)
				.setRoomName(roomName);
		ChairHeightRequest.ChairOperation operation = ChairHeightRequest.ChairOperation.forNumber(1);

		System.out.println("\nCALLING: chairStatusHeight(), request is:");
		System.out.println("\troomName is: " + roomName + " deskNumber: " + deskNumber + " desiredDeskHeight: "
				+ chairHeightChange);

		// building reply and received response:
		ChairHeightRequest req = ChairHeightRequest.newBuilder().setChair(chairRequest).setChairOperation(operation)
				.build();
		// System.out.println("\nREQUEST IS : "+ req);
		ChairHeightResponse response = blockingStub.chairStatusHeight(req);
		System.out.println("\t chairStatusHeight() run correctly");
		System.out.println("\tresponse is: chair adjusted: " + response.getIsHeightAdjusted() + ", chair height is: "
				+ response.getChair().getChairHeight());
		System.out.println("END: chairStatusHeight()");
	}

	// DISCOVERY for all methods below:
	// Service 1
	private void discoverService2DeskUsage(String service_type) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			// System.out.println("TEST : before calling jmdns.addServiceListener()" +
			// service1Info);
			jmdns.addServiceListener(service_type, new ServiceListener() {

				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Service2 resolved: " + event.getInfo());

					service2Info = event.getInfo();

					int port = service2Info.getPort();

					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:" + event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + service2Info.getNiceTextString());
					System.out.println("\t host: " + service2Info.getHostAddresses()[0]);

				}

				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Service2 removed: " + event.getInfo());

				}

				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Service2 added: " + event.getInfo());

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
