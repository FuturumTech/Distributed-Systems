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
		// int port = 50053;
		int port = service3Client.service3Info.getPort(); // 50053

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
		entersToToilet();
		
		// Gracefully shutting down the channel:
		channel.shutdown().awaitTermination(port, TimeUnit.MILLISECONDS);

	}
	// unary rpc client
		public static void entersToToilet() {
			String toiletLastEnterDateAndTime = "15/08/2022 18:45:38";
			String toiletName = "first floor"; //ground,second, third, fourth floor will throw exception 
			int numberOfVisits = 3;
			Toilet.Builder toiletRequest = Toilet.newBuilder()
					.setToiletName(toiletName)
					.setNumberOfVisits(0); //because it the toilet was just cleaned

			System.out.println("\nCALLING: entersToToilet(), request is:");
			System.out.println("\t Toilet last enter on: " + toiletLastEnterDateAndTime + " toilet is: " + toiletRequest);

			// building reply and received response:
			ToiletVisitsRequest req = ToiletVisitsRequest.newBuilder()
					.setToiletLastEnterDateAndTime(toiletLastEnterDateAndTime)
					.setToilet(toiletRequest)
					.build();
			// System.out.println("\nREQUEST IS : "+ req);
			ToiletVisitsResponse response = blockingStub.entersToToilet(req);
			System.out.println("\t entersToToilet() run correctly");
			System.out.println("\tresponse is: toilet visit changed: " + response.getToilet());
			System.out.println("END: entersToToilet()");
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
