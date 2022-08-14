package warehouse_CA.manageStock;


//package ds.examples.maths;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import warehouse_CA.manageStock.ListRequest.Operation;
import warehouse_CA.manageStock.manageStockGrpc.manageStockBlockingStub;
import warehouse_CA.manageStock.manageStockGrpc.manageStockStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ManageStockGUI {

	private static manageStockBlockingStub blockingStub;
	private static manageStockStub asyncStub;

	//private ServiceInfo mathServiceInfo;
	private ServiceInfo manageStockServiceInfo;
	
	
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextArea textResponse ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageStockGUI window = new ManageStockGUI();
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
	public ManageStockGUI() {
		
		String manageStock_service_type = "_manageStock._tcp.local.";
		discoverManageStockService(manageStock_service_type);
		
		String host = manageStockServiceInfo.getHostAddresses()[0];
		int port = manageStockServiceInfo.getPort();
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = manageStockGrpc.newBlockingStub(channel);

		asyncStub = manageStockGrpc.newStub(channel);

		
		initialize();
	}

	
	
	private void discoverManageStockService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Manage Stock Service resolved: " + event.getInfo());

					manageStockServiceInfo = event.getInfo();

					int port = manageStockServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + manageStockServiceInfo.getNiceTextString());
					System.out.println("\t host: " + manageStockServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Manage Stock Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Manage Stock Service added: " + event.getInfo());

					
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
		
		JLabel lblNewLabel_1 = new JLabel("Number 1");
		panel_service_1.add(lblNewLabel_1);
		
		textNumber1 = new JTextField();
		panel_service_1.add(textNumber1);
		textNumber1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Number 2");
		panel_service_1.add(lblNewLabel_2);
		
		textNumber2 = new JTextField();
		panel_service_1.add(textNumber2);
		textNumber2.setColumns(10);
		
		
		JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"Item1", "Item2", "Item3", "WrongItem"}));
		panel_service_1.add(comboOperation);
	
		
		JButton btnCalculate = new JButton("productConditionChecker");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int num1 = Integer.parseInt(textNumber1.getText());
				//int num2 = Integer.parseInt(textNumber2.getText());

				//int index = comboOperation.getSelectedIndex();
				//Operation operation = Operation.forNumber(index);
				
				//WarehouseStockRequest req = WarehouseStockRequest.newBuilder().setNumber1(num1).setNumber2(num2).setOperation(operation).build();
				ListRequest req = ListRequest.newBuilder().setProductConditionId("Item1").build();

				//WarehouseStockResponse response = blockingStub.stockCheck(req);
				ListResponse response = blockingStub.productConditionChecker(req);

				//textResponse.append("reply:"+ response.getResult() + " mes:"+ response.getMessage() + "\n");
				textResponse.append("reply:" + response.getProductConditionOutput());
				
				//System.out.println("res: " + response.getResult() + " mes: " + response.getMessage());
				System.out.println(response.getProductConditionOutput());

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

