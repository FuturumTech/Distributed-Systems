package ds.service2;

import java.io.IOException;

import java.util.ArrayList;

import ds.service1.Service1;
import ds.service1.Service1DataBase;
import ds.service2.Service2DataBase;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service2 extends Service2ImplBase {

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

		Service2 service1 = new Service2();

		int port = 50052;

		Server server = ServerBuilder.forPort(port).addService(service1).build().start();

		System.out.println("Service-2 started, listening on " + port);

		server.awaitTermination();
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
			//result of the below method may be null if not found, therefore try catch
			Service2DataBase.Desk myDesk = findDesk(request.getRoomName(), request.getDeskNumber());
			//if client request is for increment of desk height
			if (myDesk != null && request.getOperation() == DeskDetailsRequest.Operation.DESKUP) {
				//request is an increment of desiredDeskHeiht
				int newHeightIncrement = myDesk.getDeskHeight() + deskHeightChangeRequest;
				//below method validate range of the height and throws custom exception:
				myDesk.setDeskHeight(newHeightIncrement);
				isHeightAdjusted = true;
			}
			//else if client request is for decrement of desk height
			else if (myDesk != null && request.getOperation() == DeskDetailsRequest.Operation.DESKDOWN) {
				//request is an increment of desiredDeskHeiht
				int newHeightDecrement = myDesk.getDeskHeight() - deskHeightChangeRequest;
				//below method validate range of the height and throws custom exception:
				myDesk.setDeskHeight(newHeightDecrement);
				isHeightAdjusted = true;
			}
			// preparing the response message, case if the desk is found and adjusted correctly
			reply = DeskAdjustedResponse.newBuilder().setDeskHeight(myDesk.getDeskHeight()).setIsHeightAdjusted(isHeightAdjusted).build();
		} catch (NullPointerException ex) {
			ex.getMessage();
			// preparing the response message, -999 means to the client that unusual path reached and boolean isHeightAdjusted will remain false
			reply = DeskAdjustedResponse.newBuilder().setDeskHeight(-999).setIsHeightAdjusted(isHeightAdjusted).build();
		} catch(IllegalDeskHeightException e) {
			e.getMessage();
			// preparing the response message, -999 means to the client that unusual path reached and boolean isHeightAdjusted will remain false
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

}
