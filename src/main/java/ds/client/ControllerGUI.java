package ds.client;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ds.service1.CurrentRoomConditions;
import ds.service1.Service1Grpc;
import ds.service2.Service2Grpc;
import ds.service3.Service3Grpc;
import ds.service4.Service4Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class ControllerGUI implements ActionListener {

	// variable for JPanel:
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	private JTextField entry4, reply4;
	// variable for service discovery:
	private ServiceInfo service1Info, service2Info, service3Info, service4Info;

	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("", 10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("", 10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2.setEditable(false);
		panel.add(reply2);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("", 10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3.setEditable(false);
		panel.add(reply3);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService4JPanel() {

		JPanel panel = new JPanel();

		// using BoxLayout
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		// create new label and add it to the panel
		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		// Input textbox and addin it to the panel
		entry4 = new JTextField("", 10);
		panel.add(entry4);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 4");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply4 = new JTextField("", 10);
		reply4.setEditable(false);
		panel.add(reply4);

		panel.setLayout(boxlayout);

		return panel;

	}

	// Starting the GIU application:
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControllerGUI gui = new ControllerGUI();
					gui.build();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	// Method to build the application:
	private void build() {
		// creating a frame and setting title bar
		JFrame frame = new JFrame("Service Controller Sample");
		// set default window close (X) operation, channel is also closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel form frames panels and buttons
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		// Adding panel to the frame
		panel.add(getService1JPanel());
		panel.add(getService2JPanel());
		panel.add(getService3JPanel());
		panel.add(getService4JPanel());

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();

		if (label.equals("Invoke Service 1")) {
			//discovery service:
			System.out.println("service 1 to be invoked ...");
			
			String service1_type = "_service1climate_control._tcp.local.";
			discoverService1ClimateControl(service1_type);
			
			String host = service1Info.getHostAddresses()[0]; // localhost
			int port = service1Info.getPort(); //50051
			/*
			 * Build a channel to connect to the server, using localhost as IP and
			 * predefined port .usePlaintext() does not provide encryption
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

			// creating a stub - local representation of our service/object
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);
			Service1Grpc.Service1Stub asyncStub = Service1Grpc.newStub(channel);

			// building message to send
			// Method 1 - unary
			ds.service1.Room request = ds.service1.Room.newBuilder()
					.setRoomName(entry1.getText()).build();
			
			// retreving reply from service
			//ds.service1.AdjustHVAC response = asyncStub.RoomStatus(request);
			//ds.service1.ResponseMessage response = blockingStub.RoomStatus(request);

			//reply1.setText(String.valueOf(response.getAdjustHVAC()));

			// to shutdown the channel
			// channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);

			// Method 2 - client streaming
			// For incoming messages we have to implement a StreamObserver to pass back to
			// grpc to use it on client behalf
//				StreamObserver<CurrentRoomConditions> responseObserver = new StreamObserver<CurrentRoomConditions>() {
//	
//					@Override
//					public void onNext(CurrentRoomConditions value) {
//						// TODO Auto-generated method stub
//						System.out.println("Client streaming is: " + value.getRoomName() + value.getHumidity()
//								+ value.getTempInCelcius());
//					}
//	
//					@Override
//					public void onError(Throwable t) {
//						// TODO Auto-generated method stub
//	
//					}
//	
//					@Override
//					public void onCompleted() {
//						// TODO Auto-generated method stub
//	
//					}
//	
//				};
			// grpc library returns a stream observer to us: requestObserver
			// we can use that for outgoing messages
			// StreamObserver<CurrentRoomConditions> requestObserver = new StreamObserver;
			// StreamObserver<CurrentRoomConditions> requestObserver =
			// THIS BELOW DOES NOT WORK
			// StreamObserver<CurrentRoomConditions> requestObserver =
			// asyncStub.sendStringClientStreaming(responseObserver);

			// Build a message -while loop possible
			// THIS BELOW DOES NOT WORK
			// requestObserver.onNext(ds.service1.CurrentRoomConditions.newBuilder().setCurrentRoomConditions(entry1.getText().build());
			// THIS BELOW DOES NOT WORK
			// requestObserver.onCompleted();
			// Time for server come back because of using async stud
			// Thread.sleep(5000);

			// channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);

//			//in case the GUI is closed on exit (X) and channel is closed as a result:
//			try {
//				channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
//			} catch(InterruptedException exec) {
//				exec.printStackTrace();
//			}

		} else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			// preparing message to send
			ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText(entry2.getText())
					.build();

			// retreving reply from service
			ds.service2.ResponseMessage response = blockingStub.service2Do(request);

			reply2.setText(String.valueOf(response.getLength()));

		} else if (label.equals("Invoke Service 3")) {
			System.out.println("service 3 to be invoked ...");

			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

			// preparing message to send
			ds.service3.RequestMessage request = ds.service3.RequestMessage.newBuilder().setText(entry3.getText())
					.build();

			// retreving reply from service
			ds.service3.ResponseMessage response = blockingStub.service3Do(request);

			// display the reply received
			reply3.setText(String.valueOf(response.getLength()));

			// shutdown the channel
			channel.shutdown();

		} else if (label.equals("Invoke Service 4")) {
			System.out.println("service 4 to be invoked ...");

			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
			Service4Grpc.Service4BlockingStub blockingStub = Service4Grpc.newBlockingStub(channel);

			// preparing message to send
			ds.service4.RequestMessage request = ds.service4.RequestMessage.newBuilder().setText(entry4.getText())
					.build();

			// retreving reply from service
			ds.service4.ResponseMessage response = blockingStub.service4Do(request);

			reply4.setText(String.valueOf(response.getLength()));

		} else {

		}

	}

	private void discoverService1ClimateControl(String service_type) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

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
