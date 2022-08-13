package ds.service3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.service3.Service3Grpc.Service3ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service3 extends Service3ImplBase {

	private static final Logger logger = Logger.getLogger(Service3.class.getName());
	private static Service3DataBase myTempData = new Service3DataBase();

	public static void main(String[] args) throws InterruptedException, IOException {
		// Adding mock Room details to database Service 1:s

		Service3DataBase.Toilet temp1 = new Service3DataBase.Toilet("ground floor", 28, "11/08/2022 18:45:38");
		Service3DataBase.Toilet temp2 = new Service3DataBase.Toilet("first floor", 5, "07/08/2022 19:36:16");
		Service3DataBase.Toilet temp3 = new Service3DataBase.Toilet("second floor", 35, "12/08/2022 21:27:12");
		Service3DataBase.Toilet temp4 = new Service3DataBase.Toilet("third floor", 27, "03/08/2022 20:12:27");
		//Service3DataBase.Toilet temp5 = new Service3DataBase.Toilet("fourth floor", 45, "06/07/2022 18:23:25");
		//Service3DataBase.Toilet temp6 = new Service3DataBase.Toilet("fifth floor", 55, "07/08/2022 17:35:24");
		//Service3DataBase.Toilet temp7 = new Service3DataBase.Toilet("sixth floor", 45, "03/08/2022 19:56:52");
		myTempData.getMyToilets().add(temp1);
		myTempData.getMyToilets().add(temp2);
		myTempData.getMyToilets().add(temp3);
		myTempData.getMyToilets().add(temp4);
		//myTempData.getMyToilets().add(temp5);
		//myTempData.getMyToilets().add(temp6);
		//myTempData.getMyToilets().add(temp7);

		// gracefully shutting down
		Thread printingHook = new Thread(() -> System.out.println("In the middle of a shutdown"));
		Runtime.getRuntime().addShutdownHook(printingHook);

		// Create and Instance of the Class to five access to the RPC methods/services
		Service3 service3 = new Service3();
		Properties prop = service3.getProperties();
		service3.registerService(prop);

		// Port where the serves is located
		int port = Integer.valueOf(prop.getProperty("service_port"));// #.50053;
		try {
			// Adding the service via the class instance and starting the server here.
			Server server = ServerBuilder.forPort(port).addService(service3).build().start();
			logger.info("Server started, listening on " + port);
			// Server is waiting until explicitly terminated
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void entersToToilet(ToiletVisitsRequest request, StreamObserver<ToiletVisitsResponse> responseObserver) {

		// prepare the value to be set back
		System.out.println("receiving entersToToilet method " + request.getToilet());
		// declaring temp object from request and storing values;
		Toilet toiletRequest = request.getToilet();
		int numberOfVisits = toiletRequest.getNumberOfVisits();
		String toiletName = toiletRequest.getToiletName();
		String toiletLastEnterDateAndTime = request.getToiletLastEnterDateAndTime();
		ToiletVisitsResponse reply;
		try {
			// result of the below method may be null if not found, therefore try catch
			Service3DataBase.Toilet toiletInDataBase = findToilet(toiletName, myTempData.getMyToilets());
			// case where number of visits does not exceeds maxium allowed number 
				if (toiletInDataBase.getNumberOfVisits() + numberOfVisits <= toiletInDataBase.getMaxNumberOfVisits()) {
				// storing data from request into database:
				toiletInDataBase.setNumberOfVisits(toiletInDataBase.getNumberOfVisits() + numberOfVisits);
				toiletInDataBase.setToiletLastEnterDateAndTime(toiletLastEnterDateAndTime);
				toiletInDataBase.setNeedsCleaning(false);
				//case where number of visits does  exceeds maxium allowed number
			} else if (toiletInDataBase.getNumberOfVisits() + numberOfVisits > toiletInDataBase
					.getMaxNumberOfVisits()) {
				// storing data from request into database anyway:
				toiletInDataBase.setNumberOfVisits(toiletInDataBase.getNumberOfVisits() + numberOfVisits);
				toiletInDataBase.setToiletLastEnterDateAndTime(toiletLastEnterDateAndTime);
				toiletInDataBase.setNeedsCleaning(true);
				throw new ExceededNumberOfToiletVisitsException(toiletInDataBase.getNumberOfVisits(),
						toiletInDataBase.getMaxNumberOfVisits());
			}

			// We need to use builder to create instance of Toilet that will be passedL
			Toilet.Builder ToiletReply = Toilet.newBuilder().setNumberOfVisits(toiletInDataBase.getNumberOfVisits())
					.setToiletName(toiletInDataBase.getToiletName());
			// System.out.println("TEST Exception");
			System.out.println("Toilet object is: ");
			System.out.print(ToiletReply.toString());
			reply = ToiletVisitsResponse.newBuilder().setToilet(ToiletReply).build();
			System.out.println("entersToToilet() SUCCESS");
		} catch (ExceededNumberOfToiletVisitsException e) {
			System.out.println(e.getMessage());
			// preparing the response message, -999 means to the client that unusual path
			// reached
			// We need to use builder to create instance of Toilet that will be passedL
			Toilet.Builder ToiletReply = Toilet.newBuilder().setNumberOfVisits(-999).setToiletName("Not found");
			// System.out.println("TEST Exception");

			reply = ToiletVisitsResponse.newBuilder().setToilet(ToiletReply).build();
			System.out.println("entersToToilet() FAILURE");

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			// preparing the response message, -999 means to the client that unusual path
			// reached
			// We need to use builder to create instance of Toilet that will be passedL
			Toilet.Builder ToiletReply = Toilet.newBuilder().setNumberOfVisits(-999).setToiletName("Not found");
			// System.out.println("TEST Exception");

			reply = ToiletVisitsResponse.newBuilder().setToilet(ToiletReply).build();
			System.out.println("entersToToilet() FAILURE");

		}
		responseObserver.onNext(reply);
		responseObserver.onCompleted();

	}

	@Override
	public StreamObserver<UpdateToiletStatusRequest> updateToiletStatus(StreamObserver<UpdateToiletStatusResponse> responseObserver) {
		return new StreamObserver<UpdateToiletStatusRequest>() {

			@Override
			public void onNext(UpdateToiletStatusRequest request) {
				// prepare the value to be set back
				System.out.println("receiving updateToiletStatus method " + request.getToilet());
				// declaring temp object from request and storing values;
				Toilet toiletRequest = request.getToilet();
				int numberOfVisits = toiletRequest.getNumberOfVisits();
				String toiletName = toiletRequest.getToiletName();
				String toiletCleanedDateAndTime = request.getDate();
				UpdateToiletStatusResponse reply;
				boolean statusUpdated = false;
				try {
					// result of the below method may be null if not found, therefore try catch
					Service3DataBase.Toilet toiletInDataBase = findToilet(toiletName, myTempData.getMyToilets());
					// storing data from request into database anyway, reseting value of visits as
					// the toilet was cleaned:
					toiletInDataBase.setNumberOfVisits(0);
					toiletInDataBase.setToiletCleanedDateAndTime(toiletCleanedDateAndTime);
					toiletInDataBase.setNeedsCleaning(false);
										
					//SERVER STREAMING:
					//it will return all toilets that needs cleaning
					for(int i =0; i<myTempData.getMyToilets().size(); i++) {
						if(myTempData.getMyToilets().get(i).needsCleaning) {
							
							// We need to use builder to create instance of Toilet that will be passedL
							Toilet.Builder ToiletReply = Toilet.newBuilder()
									.setNumberOfVisits(myTempData.getMyToilets().get(i).getNumberOfVisits())
									.setToiletName(myTempData.getMyToilets().get(i).getToiletName());
							
							//Build reply:
							reply = UpdateToiletStatusResponse.newBuilder().setStatusUpdated(statusUpdated)
									.setToilet(ToiletReply)
									.setDate(myTempData.getMyToilets().get(i).getToiletCleanedDateAndTime())
									.setNeedsCleaning(myTempData.getMyToilets().get(i).getNeedsCleaning())
									.build();
							responseObserver.onNext(reply);
							System.out.println("reply is:" + reply);
							
						}
					}
					
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
					// preparing the response message, -999 means to the client that unusual path
					// reached
					// We need to use builder to create instance of Toilet that will be passedL
					Toilet.Builder ToiletReply = Toilet.newBuilder().setNumberOfVisits(-999).setToiletName("Not found");
					// System.out.println("TEST Exception");

					reply = UpdateToiletStatusResponse.newBuilder().setStatusUpdated(statusUpdated).setToilet(ToiletReply)
							.setDate("Toilet not found").build();
					System.out.println("updateToiletStatus() FAILURE");
					responseObserver.onNext(reply);
				}
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal
				
			}

			@Override
			public void onCompleted() {
				 responseObserver.onCompleted();
				
			}
			
		};
	}
	
	
//Method to find return toilet 
	private static Service3DataBase.Toilet findToilet(String roomName, ArrayList<Service3DataBase.Toilet> myArray) {
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i).getToiletName().equalsIgnoreCase(roomName.trim().toLowerCase())) {
				return myArray.get(i);
			}
		} // else the room name and desk number was not found
		return null;
	}

	// Service registration:
	// 1st -Method to get properties of the service:
	private Properties getProperties() {

		Properties prop = null;

		try (InputStream input = new FileInputStream("src/main/resources/service3.properties")) {

			prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("Service3 Cleaning Heatmap properies ...");
			System.out.println("\t service_type: " + prop.getProperty("service_type"));
			System.out.println("\t service_name: " + prop.getProperty("service_name"));
			System.out.println("\t service_description: " + prop.getProperty("service_description"));
			System.out.println("\t service_port: " + prop.getProperty("service_port"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return prop;
	}

	// 2nd is to register the service
	private void registerService(Properties prop) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			String service_type = prop.getProperty("service_type");// "_cleaning_heatmap._tcp.local.";
			String service_name = prop.getProperty("service_name");// "climate_control";
			// int service_port = 1234;
			int service_port = Integer.valueOf(prop.getProperty("service_port"));// #.50053;

			String service_description_properties = prop.getProperty("service_description");// "path=index.html";

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
					service_description_properties);
			jmdns.registerService(serviceInfo);

			System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

			// Wait a bit
			Thread.sleep(1000);

			// Unregister all services
			//jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
