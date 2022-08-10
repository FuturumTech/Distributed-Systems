package ds.service2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.service1.Service1;
import ds.service1.Service1DataBase;
import ds.service2.Service2DataBase;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service2 extends Service2ImplBase {
	private static final Logger logger = Logger.getLogger(Service2.class.getName());
	private static Service2DataBase myTempData = new Service2DataBase();

	public static void main(String[] args) throws InterruptedException, IOException {

		// Adding mock Room details to database Service 1:
		Service2DataBase myTempData = new Service2DataBase();

		// try catch for custom exception that validates min and max height for desk
		try {
			Service2DataBase.Desk temp1 = new Service2DataBase.Desk("consultation room", 3, 56);
			Service2DataBase.Desk temp2 = new Service2DataBase.Desk("open space", 1, 123);
			Service2DataBase.Desk temp3 = new Service2DataBase.Desk("open space", 2, 68);
			Service2DataBase.Desk temp4 = new Service2DataBase.Desk("reception", 4, 76);
			myTempData.getMyDesks().add(temp1);
			myTempData.getMyDesks().add(temp2);
			myTempData.getMyDesks().add(temp3);
			myTempData.getMyDesks().add(temp4);
		} catch (IllegalDeskHeightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// testing if added properly
		// System.out.println("Room index 2 is: " +
		// myTempData.getDesk().get(2).getRoomName());
		// System.out.println("ArrayList size is: " + myTempData.getDesk().size());

		// Create and Instance of the Class to five access to the RPC methods/services
		Service2 service2 = new Service2();
		Properties prop = service2.getProperties();
		service2.registerService(prop);

		// Port where the serves is located
		int port = Integer.valueOf(prop.getProperty("service_port"));// #.50052;
		// int port = 50052;

		try {
			// Adding the service via the class instance and starting the server here.
			Server server = ServerBuilder.forPort(port).addService(service2).build().start();

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
	public void deskStatusHeight(DeskDetailsRequest request, StreamObserver<DeskAdjustedResponse> responseObserver) {

		// prepare the value to be set back
		System.out.println(
				"receiving deskStatusHeight method " + request.getDeskNumber() + " in room: " + request.getRoomName()
						+ " to get " + request.getOperation() + " increase by: " + request.getDesiredDeskHeight());

		float value = Float.NaN;
		String msg = "ok " + request.getOperation().name() + " result ";
		// CONTINUE HERE:
		// in case the desk number in room database was not found and method returned
		// null:
		int deskHeightChangeRequest = request.getDesiredDeskHeight();
		boolean isHeightAdjusted = false;
		DeskAdjustedResponse reply;
		try {
			// result of the below method may be null if not found, therefore try catch
			Service2DataBase.Desk myDesk = findDesk(request.getRoomName(), request.getDeskNumber());
			// if client request is for increment of desk height
			if (myDesk != null && request.getOperation() == DeskDetailsRequest.Operation.DESKUP) {
				// request is an increment of desiredDeskHeiht
				int newHeightIncrement = myDesk.getDeskHeight() + deskHeightChangeRequest;
				// below method validate range of the height and throws custom exception:
				myDesk.setDeskHeight(newHeightIncrement);
				isHeightAdjusted = true;
				System.out.println("deskStatusHeight() method run correctly, new desk height is: "
						+ myDesk.getDeskHeight() + " increased by: " + deskHeightChangeRequest);
			}
			// else if client request is for decrement of desk height
			else if (myDesk != null && request.getOperation() == DeskDetailsRequest.Operation.DESKDOWN) {
				// request is an increment of desiredDeskHeiht
				int newHeightDecrement = myDesk.getDeskHeight() - deskHeightChangeRequest;
				// below method validate range of the height and throws custom exception:
				myDesk.setDeskHeight(newHeightDecrement);
				isHeightAdjusted = true;
				System.out.println("deskStatusHeight() method run correctly, new desk height is: "
						+ myDesk.getDeskHeight() + " decreased by: " + deskHeightChangeRequest);
			}
			// preparing the response message, case if the desk is found and adjusted
			// correctly
			reply = DeskAdjustedResponse.newBuilder().setDeskHeight(myDesk.getDeskHeight())
					.setIsHeightAdjusted(isHeightAdjusted).build();
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			// preparing the response message, -999 means to the client that unusual path
			// reached and boolean isHeightAdjusted will remain false
			reply = DeskAdjustedResponse.newBuilder().setDeskHeight(-999).setIsHeightAdjusted(isHeightAdjusted).build();
		} catch (IllegalDeskHeightException e) {
			System.out.println(e.getMessage());
			// preparing the response message, -999 means to the client that unusual path
			// reached and boolean isHeightAdjusted will remain false
			reply = DeskAdjustedResponse.newBuilder().setDeskHeight(-999).setIsHeightAdjusted(isHeightAdjusted).build();
		}

		responseObserver.onNext(reply);

		responseObserver.onCompleted();

	}

	// method to find desk in ArrayList for grpc deskStatusHeight
	// below option does not work:
	// private static boolean findDesk(ArrayList<Service2DataBase> deskArray, String
	// roomName, int deskNo) {
	private static Service2DataBase.Desk findDesk(String roomName, int deskNo) {
		// below option does not work:
		// for(int i=0; i<(deskArray.getMyDesks().size(); i++) {
		for (int i = 0; i < Service2.myTempData.getMyDesks().size(); i++) {
			if (Service2.myTempData.getMyDesks().get(i).getRoomName().equalsIgnoreCase(roomName)
					&& Service2.myTempData.getMyDesks().get(i).getDeskNumber() == (deskNo)) {
				return Service2.myTempData.getMyDesks().get(i);
			}
		} // else the room name and desk number was not found
		return null;
	}

	// Service registration:
	// 1st -Method to get properties of the service:
	private Properties getProperties() {

		Properties prop = null;

		try (InputStream input = new FileInputStream("src/main/resources/service2.properties")) {

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

			String service_type = prop.getProperty("service_type");// "_service2deskusage._tcp.local.";
			String service_name = prop.getProperty("service_name");// "desk_usage";
			// int service_port = 1234;
			int service_port = Integer.valueOf(prop.getProperty("service_port"));// #.50052;

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
}
