package warehouse_CA.warehouseControl;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.html.Option;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import warehouse_CA.manageStock.ListRequest.Operation;
import warehouse_CA.warehouseControl.warehouseControlGrpc.warehouseControlBlockingStub;
import warehouse_CA.warehouseControl.warehouseControlGrpc.warehouseControlStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class WarehouseControlGUI {

	private static warehouseControlBlockingStub blockingStub;
	private static warehouseControlStub asyncStub;

	//private ServiceInfo mathServiceInfo;
	private ServiceInfo warehouseControlServiceInfo;
	
	
	private JFrame frame;
	//private JTextField textNumber1;
	//private JTextField textNumber2;
	private JTextArea textResponse ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarehouseControlGUI window = new WarehouseControlGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WarehouseControlGUI() {
		
		String warehouseControl_service_type = "_warehouseControl._tcp.local.";
		discoverWarehouseControlService(warehouseControl_service_type);
		
		String host = warehouseControlServiceInfo.getHostAddresses()[0];
		int port = warehouseControlServiceInfo.getPort();
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = warehouseControlGrpc.newBlockingStub(channel);

		asyncStub = warehouseControlGrpc.newStub(channel);

		
		initialize();
	}

	
	
	private void discoverWarehouseControlService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Warehouse Control Service resolved: " + event.getInfo());

					warehouseControlServiceInfo = event.getInfo();

					int port = warehouseControlServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + warehouseControlServiceInfo.getNiceTextString());
					System.out.println("\t host: " + warehouseControlServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Warehouse Control Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Warehouse Control Service added: " + event.getInfo());

					
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
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Client - Service Controller");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"505", "506", "507", "508"}));
		panel_service_1.add(comboOperation);
	
		
		JButton btnCalculate = new JButton("turnOnOffLights");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

         //-------NO IDEA HOW TO CONNECT HERE REQUEST AND RESPONSE----------------------
				
				// StreamObserver<LightRequest> requestObserver = asyncStub.turnOnOffLights(responseObserver);
				//requestObserver.onNext(LightRequest.newBuilder().setRoomId("505").build());

				//textResponse.append("reply:" + response.getOrderStatusOutput());
					
				//System.out.println(response.getOrderStatusOutput());

			}
		});
		panel_service_1.add(btnCalculate);
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
		
		
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
		
		
		
	}

}

