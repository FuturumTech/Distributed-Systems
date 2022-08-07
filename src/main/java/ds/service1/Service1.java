package ds.service1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.service1.Service1DataBase.roomName;
import ds.service1.Service1Grpc.Service1ImplBase;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service1 extends Service1ImplBase {

	private static final Logger logger = Logger.getLogger(Service1.class.getName());
	private static Service1DataBase myTempData = new Service1DataBase();
	// 1. Create and start the server
	public static void main(String[] args) throws InterruptedException, IOException {
				//Adding mock Room details to database Service 1:
				Service1DataBase myTempData = new Service1DataBase();

				Service1DataBase.roomName temp1 = new Service1DataBase.roomName("consultation room", 73, 21.8);
				Service1DataBase.roomName temp2 = new Service1DataBase.roomName("hallway", 65, 23.9);
				Service1DataBase.roomName temp3 = new Service1DataBase.roomName("reception", 49, 18);
				Service1DataBase.roomName temp4 = new Service1DataBase.roomName("canteen", 89, 26.5);
				myTempData.getMyRooms().add(temp1);
				myTempData.getMyRooms().add(temp2);
				myTempData.getMyRooms().add(temp3);
				myTempData.getMyRooms().add(temp4);
				//testing if added properly
				System.out.println("Room index 2 is: " + myTempData.getMyRooms().get(2).getRoomName());
				System.out.println("ArrayList size is: " + myTempData.getMyRooms().size());
				
			// Create and Instance of the Class to five access to the RPC methods/services
			Service1 service1 = new Service1();
			Properties prop = service1.getProperties();
			service1.registerService(prop);
			
			// Port where the serves is located
			int port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;
		try {
			// Adding the service via the class instance and starting the server here.
			Server server = ServerBuilder.forPort(port).addService(service1).build().start();

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

	// Service registration:
	// 1st -Method to get properties of the service:
	private Properties getProperties() {

		Properties prop = null;

		try (InputStream input = new FileInputStream("src/main/resources/service1.properties")) {

			prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("Service1 Climate Control properies ...");
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

			String service_type = prop.getProperty("service_type");// "service1._tcp.local.";
			String service_name = prop.getProperty("service_name");// "climate_control";
			// int service_port = 1234;
			int service_port = Integer.valueOf(prop.getProperty("service_port"));// #.50051;

			String service_description_properties = prop.getProperty("service_description");// "path=index.html";

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
					service_description_properties);
			jmdns.registerService(serviceInfo);

			System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

			// Wait a bit
			Thread.sleep(1000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void desiredSettingHVAC(DesiredRoomConditions request, StreamObserver<Confirmation> responseObserver) {
		// Find out what sent by the client
		String roomName = request.getRoomName();
		float desiredHumidity = request.getDesiredHumidity();
		float desiredTempInCelcius = request.getDesiredTempInCelcius();
		System.out.println(
				"Request received from client is: " + roomName + " " + desiredHumidity + " " + desiredTempInCelcius);

		// Our response:
		// Firstly, we must create a builder
		Confirmation.Builder responseBuilder = Confirmation.newBuilder().setConfirmation(roomName); // PLACEHOLDER FOR
																									// VALUE RETURN

		// Send it back:
		responseObserver.onNext(responseBuilder.build());

		responseObserver.onCompleted();

	}

	// Method for client streaming
	@Override
	public StreamObserver<CurrentRoomConditions> hVACstatus(StreamObserver<Acknowledged> responseObserver) {
		// Find out what sent by the client
		return new StreamObserver<CurrentRoomConditions>() {

			@Override
			public void onNext(CurrentRoomConditions value) {
				// TODO Auto-generated method stub
				String roomName = value.getRoomName();
				float humidity = value.getHumidity();
				float tempInCelcius = value.getTempInCelcius();
				System.out.println("On Server side received: " + roomName + " " + humidity + " " + tempInCelcius);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				// Our response:
				// Firstly, we must create a builder
				Acknowledged.Builder responseBuilder = Acknowledged.newBuilder().setAcknowledgment(" "); // PLACEHOLDER
																											// FOR VALUE
																											// RETURN

				// Send it back:
				responseObserver.onNext(responseBuilder.build());

				responseObserver.onCompleted();
			}
		};
	}

	@Override
	public void roomStatus(Room request, StreamObserver<AdjustHVAC> responseObserver) {
		
		// Find out what sent by the client

		AdjustHVAC responseBuilder;
		double[] tempArray = new double[2];
		String roomName = request.getRoomName();
		
		Service1DataBase.roomName roomInput = findRoom(roomName);
		System.out.println("Room result is " +  " " + roomInput.getRoomName());
		if(roomInput != null) {
		//Alternative if statement:
		//if(myTempData.getMyRooms().contains(roomName.trim().toLowerCase())) {
			double roomHumidity = roomInput.getCurrentHumidity();
			double roomTemperature = roomInput.getCurrentTempInCelcius();
			
			tempArray = calculateDifference(roomInput);
			
			// Our response:
			// Firstly, we must create a builder
			responseBuilder = AdjustHVAC.newBuilder().setHumidityDifference(tempArray[0])
					.setTempDifference(tempArray[1]).build(); // PLACEHOLDER FOR VALUE
			
		}else {
			//-999 App will read it that the input was incorrect 
			responseBuilder = AdjustHVAC.newBuilder().setHumidityDifference(-999)
					.setTempDifference(-999).build();
		}
		System.out.println("Request received from client is: " + roomName);

		// // RETURN
		// Send it back:
		//Server streaming:
		for(double d: tempArray) {
			responseObserver.onNext(responseBuilder);
		}
		
		responseObserver.onCompleted();


	}
	//method to find room name in ArrayList for grpc roomStatus
		 private static Service1DataBase.roomName findRoom(String room) {
			 System.out.println("ArrayList size is in findRoom method is: " + Service1.myTempData.getMyRooms().size());
			 for(int i=0; i<Service1.myTempData.getMyRooms().size(); i++) {
		    //for(Service1DataBase.roomName roomName : myTempData.getMyRooms()) {
		        if(Service1.myTempData.getMyRooms().get(i).getRoomName().equalsIgnoreCase(room)) {
		            return Service1.myTempData.getMyRooms().get(i);
		        }
		    }
		    return null;
		}
		//method to find room name in ArrayList for grpc roomStatus
		 private static double[] calculateDifference(Service1DataBase.roomName room) {
			 double[] tempArray = new double[2];
			 tempArray[0] = room.getCurrentHumidity() - room.getDesiredHumidity();
			 //tempArray[1] = Math.round((room.getCurrentTempInCelcius() - room.getDesiredTempInCelcius() * 100) / 100);
			 tempArray[1] = room.getCurrentTempInCelcius() - room.getDesiredTempInCelcius();
			 return tempArray;
		 }
	
//	//Extend abstract base class for our implementation
//	static class NewServerImpl extends Service1ImplBase{
//		@Override
//		public void desiredSettingHVAC(DesiredRoomConditions request, StreamObserver<Confirmation> responseObserver) {
//			//Find out what sent by the client
//			String roomName = request.getRoomName();
//			float desiredHumidity = request.getDesiredHumidity();
//			float desiredTempInCelcius = request.getDesiredTempInCelcius();
//			System.out.println("Request received from client is: " + roomName + " "+ desiredHumidity + " " + desiredTempInCelcius);
//			
//			//Our response:
//			//Firstly, we must create a builder
//			Confirmation.Builder responseBuilder = Confirmation.newBuilder().setConfirmation(roomName); //PLACEHOLDER FOR VALUE RETURN
//			
//			//Send it back:
//			responseObserver.onNext(responseBuilder.build());
//			
//			//responseObserver.onCompleted();
//		}
//	}
}
