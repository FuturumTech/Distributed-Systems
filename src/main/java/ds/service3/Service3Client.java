package ds.service3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import ds.service2.Chair;
import ds.service2.ChairHeightRequest;
import ds.service2.ChairHeightResponse;
import ds.service3.Service3Grpc.Service3BlockingStub;
import ds.service3.Service3Grpc.Service3Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Service3Client {
	private static Logger logger = Logger.getLogger(Service3.class.getName());
	// variables for service discovery:
	private ServiceInfo service3Info;
	// variables for stubs:
	private static Service3BlockingStub blockingStub;
	private static Service3Stub asyncStub;

	public static void main(String[] args) throws Exception {
		Service3Client service3Client = new Service3Client();

		// discovery service:
		System.out.println("service 3 to be invoked ...");

		String service3_type = "_service3_http._tcp.local.";
		service3Client.discoverService3CleaningHeatmap(service3_type);

		String host = service3Client.service3Info.getHostAddresses()[0]; // localhost
		// String host = "localhost";
		// int port = 50051;
		int port = service3Client.service3Info.getPort(); // 50051

		/*
		 * Build a channel to connect to the server, using localhost as IP and
		 * predefined port .usePlaintext() does not provide encryption
		 */
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		System.out.println("service 2 was run, host is:" + host + " port is: " + port);
		// stubs -- generate from proto
		blockingStub = Service3Grpc.newBlockingStub(channel);

		asyncStub = Service3Grpc.newStub(channel);
		// Calling methods

		
		// Gracefully shutting down the channel:
		channel.shutdown().awaitTermination(port, TimeUnit.MILLISECONDS);

	}
	// unary rpc client
		public static void entersToToilet() {
//			String toiletCleanedDateAndTime = "12/08/2022 18:45:38";
//			int deskNumber = 4;
//			int chairHeightChange = 5;
//			Toilet.Builder chairRequest = Toilet.newBuilder().setChairHeight(chairHeightChange).setDeskNumber(deskNumber)
//					.setRoomName(roomName);
//			ChairHeightRequest.ChairOperation operation = ChairHeightRequest.ChairOperation.forNumber(1);
//
//			System.out.println("\nCALLING: chairStatusHeight(), request is:");
//			System.out.println("\troomName is: " + roomName + " deskNumber: " + deskNumber + " desiredDeskHeight: "
//					+ chairHeightChange);
//
//			// building reply and received response:
//			ChairHeightRequest req = ChairHeightRequest.newBuilder().setChair(chairRequest).setChairOperation(operation)
//					.build();
//			// System.out.println("\nREQUEST IS : "+ req);
//			ChairHeightResponse response = blockingStub.chairStatusHeight(req);
//			System.out.println("\t chairStatusHeight() run correctly");
//			System.out.println("\tresponse is: chair adjusted: " + response.getIsHeightAdjusted() + ", chair height is: "
//					+ response.getChair().getChairHeight());
//			System.out.println("END: chairStatusHeight()");
		}

	// DISCOVERY for all methods below:
		// Service 1
		private void discoverService3CleaningHeatmap(String service_type) {

			try {
				// Create a JmDNS instance
				JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
				// System.out.println("TEST : before calling jmdns.addServiceListener()" +
				// service1Info);
				jmdns.addServiceListener(service_type, new ServiceListener() {

					@Override
					public void serviceResolved(ServiceEvent event) {
						System.out.println("Service3 resolved: " + event.getInfo());

						service3Info = event.getInfo();

						int port = service3Info.getPort();

						System.out.println("resolving " + service_type + " with properties ...");
						System.out.println("\t port: " + port);
						System.out.println("\t type:" + event.getType());
						System.out.println("\t name: " + event.getName());
						System.out.println("\t description/properties: " + service3Info.getNiceTextString());
						System.out.println("\t host: " + service3Info.getHostAddresses()[0]);

					}

					@Override
					public void serviceRemoved(ServiceEvent event) {
						System.out.println("Service3 removed: " + event.getInfo());

					}

					@Override
					public void serviceAdded(ServiceEvent event) {
						System.out.println("Service3 added: " + event.getInfo());

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
