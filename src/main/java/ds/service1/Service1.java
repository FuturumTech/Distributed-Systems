package ds.service1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service1 extends Service1ImplBase {

	private static final Logger logger = Logger.getLogger(Service1.class.getName());
	private static Service1DataBase myTempData = new Service1DataBase();

	// 1. Create and start the server
	public static void main(String[] args) throws InterruptedException, IOException {
		// Adding mock Room details to database Service 1:
		Service1DataBase myTempData = new Service1DataBase();

		Service1DataBase.RoomName temp1 = new Service1DataBase.RoomName("consultation room", 73, 22.5);
		Service1DataBase.RoomName temp2 = new Service1DataBase.RoomName("hallway", 65, 24.5);
		Service1DataBase.RoomName temp3 = new Service1DataBase.RoomName("reception", 49, 18.4);
		Service1DataBase.RoomName temp4 = new Service1DataBase.RoomName("canteen", 89, 26.5);
		myTempData.getMyRooms().add(temp1);
		myTempData.getMyRooms().add(temp2);
		myTempData.getMyRooms().add(temp3);
		myTempData.getMyRooms().add(temp4);
		// testing if added properly
		System.out.println("Room index 2 is: " + myTempData.getMyRooms().get(2).getRoomName());
		System.out.println("ArrayList size is: " + myTempData.getMyRooms().size());

		// Create and Instance of the Class to five access to the RPC methods/services
		Service1 service1 = new Service1();
		Properties prop = service1.getProperties();
		service1.registerService(prop);

		// Port where the serves is located
		int port = Integer.valueOf(prop.getProperty("service_port"));// #.50051;
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

	
	@Override
	public void desiredSettingHVAC(DesiredRoomConditions request, StreamObserver<Confirmation> responseObserver) {
		// Find out what sent by the client
		String roomName = request.getRoomName();
		String roomNameToReturn = request.getRoomName();
		double desiredHumidity = request.getDesiredHumidity();
		double desiredTempInCelcius = request.getDesiredTempInCelcius();
		System.out.println("On Server side (desiredSettingHVAC) received: \n\t" + roomName + " (room name) \n\t"
				+ desiredHumidity + "(desired humidity) \n\t" + desiredTempInCelcius + "(desired temperature)");
		try {
			Service1DataBase.RoomName roomInput = findRoom(roomName);
			// if the room name exist in the database:
			if (roomInput != null) {
				roomInput.setDesiredHumidity(desiredHumidity);
				roomInput.setDesiredTempInCelcius(desiredTempInCelcius);
				roomName = roomInput.getRoomName();
			} else {
				roomName = "not found";
			}
		} catch (NullPointerException e) {
			e.getMessage();
		}

		// Our response:
		// Firstly, we must create a builder

		// case if the room name does not exist (will be overwritten if the room exists
		Confirmation.Builder responseBuilder = Confirmation.newBuilder()
				.setConfirmation("Receiving stream of data to grp hVACstatus completed");
		// Case if the room name exist
		if (!roomName.equals("not found")) {
			responseBuilder = Confirmation.newBuilder()
					.setConfirmation("Received data to grp hVACstatus was completed for room: \""
							+ roomNameToReturn);
		} else {
			responseBuilder = Confirmation.newBuilder()
					.setConfirmation("No room was found for the name:" + roomNameToReturn);
		}
		// Send it back:
		responseObserver.onNext(responseBuilder.build());

		responseObserver.onCompleted();

	}

	// Method for client streaming - IoT device that sends stream of data
	@Override
	public StreamObserver<CurrentRoomConditions> hVACstatus(StreamObserver<Acknowledged> responseObserver) {
		// Find out what sent by the client
		return new StreamObserver<CurrentRoomConditions>() {
			String roomName;
			String roomNameToReturn;

			@Override
			public void onNext(CurrentRoomConditions value) {
				// TODO Auto-generated method stub
				roomName = value.getRoomName();
				roomNameToReturn = value.getRoomName();
				double humidity = value.getHumidity();
				double tempInCelcius = value.getTempInCelcius();
				System.out.println("On Server side (hVACstatus) received: \n\t" + roomName + " (room name) \n\t"
						+ humidity + "(humidity) \n\t" + tempInCelcius + "(temperature)");
				try {
					Service1DataBase.RoomName roomInput = findRoom(roomName);
					// if the room name exist in the database:
					if (roomInput != null) {
						roomInput.setCurrentHumidity(humidity);
						roomInput.setCurrentTempInCelcius(tempInCelcius);
						roomName = roomInput.getRoomName();
					} else {
						roomName = "not found";
					}
				} catch (NullPointerException e) {
					e.getMessage();
				}
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
				// case if the room name does not exist (will be overwritten if the room exists
				Acknowledged.Builder responseBuilder = Acknowledged.newBuilder()
						.setAcknowledgment("Receiving stream of data to grp hVACstatus completed");
				// Case if the room name exist
				if (!roomName.equals("not found")) {
					responseBuilder = Acknowledged.newBuilder()
							.setAcknowledgment("Receiving stream of data to grp hVACstatus was completed for room: \""
									+ roomNameToReturn + "\" was compelted");
				} else {
					responseBuilder = Acknowledged.newBuilder()
							.setAcknowledgment("No room was found for the name:" + roomNameToReturn);
				}

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

		try {
			Service1DataBase.RoomName roomInput = findRoom(roomName);

			// if the room name exist in the database:
			if (roomInput != null) {
				// Alternative if statement:
				// if(myTempData.getMyRooms().contains(roomName.trim().toLowerCase())) {
				double roomHumidity = roomInput.getCurrentHumidity();
				double roomTemperature = roomInput.getCurrentTempInCelcius();

				tempArray = calculateDifference(roomInput);

				// Our response:
				// Firstly, we must create a builder
				responseBuilder = AdjustHVAC.newBuilder().setHumidityDifference(tempArray[0])
						.setTempDifference(tempArray[1]).build(); // PLACEHOLDER FOR VALUE

			} else {
				// -999 App will read it that the input was incorrect
				responseBuilder = AdjustHVAC.newBuilder().setHumidityDifference(-999).setTempDifference(-999).build();
			}

			// // RETURN
			// Send it back:
			// Server streaming:
			int repeatReply = 5;
			int timeBeetweenMessages = 1000;
			for (int i = 0; i<repeatReply; i++) {
				responseObserver.onNext(responseBuilder);
				System.out.println("STREAM SENT: roomStatus() iteration:" + (i+1));
				// Wait a bit
				try {
					Thread.sleep(timeBeetweenMessages);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (NullPointerException e) {
			e.getMessage();
		}

		responseObserver.onCompleted();

	}

	// method to find room name in ArrayList for grpc roomStatus
	private static Service1DataBase.RoomName findRoom(String room) {
		// System.out.println("ArrayList size is in findRoom method is: " +
		// Service1.myTempData.getMyRooms().size());
		for (int i = 0; i < Service1.myTempData.getMyRooms().size(); i++) {
			// for(Service1DataBase.roomName roomName : myTempData.getMyRooms()) {
			if (Service1.myTempData.getMyRooms().get(i).getRoomName().equalsIgnoreCase(room.trim().toLowerCase())) {
				return Service1.myTempData.getMyRooms().get(i);
			}
		}
		return null;
	}

	// method to calculate difference in ArrayList for grpc roomStatus
	private static double[] calculateDifference(Service1DataBase.RoomName room) {
		double[] tempArray = new double[2];
		tempArray[0] = room.getCurrentHumidity() - room.getDesiredHumidity();
		tempArray[1] = room.getCurrentTempInCelcius() - room.getDesiredTempInCelcius();
		// rounding to 1 decimal:
		tempArray[0] = (Math.round(tempArray[0] * 10.0)) / 10.0;
		tempArray[1] = (Math.round(tempArray[1] * 10.0)) / 10.0;
		return tempArray;
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
				jmdns.unregisterAllServices();

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
