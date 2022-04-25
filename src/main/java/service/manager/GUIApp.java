package service.manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import professional.TimesheetsGrpc;
import professional.absenceRequest;
import professional.profile;
import professional.success;
import project.manager.FindingWorkersGrpc;
import email.notification.NotificationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class GUIApp implements ActionListener{


	//private JTextField entry1, reply1;
	private JTextField entry1;
	private JTextField entry12;
	private JTextField entry13;
	private JTextField entry14;
	private JTextField entry15;
	private JTextField entry16;
	private JTextField entry17;
	
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	
	private JTextArea reply1;
	
	//https://www.youtube.com/watch?v=ohNqQagkDDY
	//https://stackoverflow.com/questions/7858752/in-java-how-do-you-add-a-jpanel-to-another-jpanel
	//https://www.youtube.com/watch?v=Kl3klve_rmQ
	//https://www.youtube.com/watch?v=dvzAuq-YDpM
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		//JPanel innerPanel = new JPanel();
		//JPanel innerPanel2 = new JPanel();
		//JPanel innerPanel3 = new JPanel();
		
		
		//BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints appGrid = new GridBagConstraints();	
		appGrid.fill = GridBagConstraints.HORIZONTAL;
		appGrid.insets = new Insets(5, 5, 5, 5);
		//BoxLayout boxlayout = new BoxLayout(innerPanel, BoxLayout.LINE_AXIS);
		//BoxLayout boxlayout2 = new BoxLayout(innerPanel2, BoxLayout.Y_AXIS);
		//BoxLayout boxlayout3 = new BoxLayout(innerPanel3, BoxLayout.Y_AXIS);
		
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JLabel label = new JLabel("Card Number: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(label, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry1 = new JTextField("",5);
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(entry1, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel label1 = new JLabel("Task: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(label1, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry12 = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(entry12, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		JLabel CapProf = new JLabel("Capacity profile")	;
		appGrid.gridx = 1;
		appGrid.gridy = 0;
		panel.add(CapProf, appGrid);
		
		JLabel CapProfMon = new JLabel("Monday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;
		panel.add(CapProfMon, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry13 = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 1;
		panel.add(entry13, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel CapProfTue = new JLabel("Tuesday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(CapProfTue, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry14 = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 2;
		panel.add(entry14, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel CapProfWed = new JLabel("Wednesday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 3;
		panel.add(CapProfWed, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry15 = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 3;
		panel.add(entry15, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel CapProfThu = new JLabel("Thursday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 4;
		panel.add(CapProfThu, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry16 = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 4;
		panel.add(entry16, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel CapProfFri = new JLabel("Friday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 5;
		panel.add(CapProfFri, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entry17 = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 5;
		panel.add(entry17, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		

		JButton button = new JButton("Introduce profile");
		button.addActionListener(this);
		appGrid.gridx = 1;
		appGrid.gridy = 7;
		panel.add(button, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		//reply1 = new JTextField("", 10);
		reply1 = new JTextArea(3, 20);
		reply1 .setEditable(false);
		appGrid.gridx = 2;
		appGrid.gridy = 7;
		panel.add(reply1, appGrid);
		
		//panel.setLayout(boxlayout);
		//innerPanel.setLayout(boxlayout);	
		//innerPanel2.setLayout(boxlayout2);	
		//innerPanel3.setLayout(boxlayout3);
		
		//panel.add(innerPanel);
		//panel.add(innerPanel2);
		//panel.add(innerPanel3);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}


	public static void main(String[] args) {

		GUIApp gui = new GUIApp();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("GUI Application with the 3 services");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() );
		panel.add( getService2JPanel() );
		panel.add( getService3JPanel() );


		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");

		
			/*
			 * 
			 */
			//Build a channel
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			// Building and preparing message to send
			profile cardNumber = profile.newBuilder().setCardNumber(entry1.getX()).build();//OJO QUE AQUI HE METIDO UN entry1.getX
			profile task = profile.newBuilder().setTask("test").build();
			profile capProfMon = profile.newBuilder().setCapProfMon(1).build();
			profile capProfTue = profile.newBuilder().setCapProfTue(2).build();
			profile capProfWed = profile.newBuilder().setCapProfWed(3).build();
			profile capProfThu = profile.newBuilder().setCapProfThu(4).build();
			profile capProfFri = profile.newBuilder().setCapProfFri(5).build();
			
			absenceRequest cardNumber1 = absenceRequest.newBuilder().setCardNumber(7).build();
			absenceRequest jobNumber = absenceRequest.newBuilder().setJobNumber(8).build();
			absenceRequest hoursBooked = absenceRequest.newBuilder().setHoursBooked(1).build();
			absenceRequest dayBooked = absenceRequest.newBuilder().setDayBooked(1).build();
			absenceRequest monthBooked = absenceRequest.newBuilder().setMonthBooked(1).build();
			absenceRequest yearBooked = absenceRequest.newBuilder().setYearBooked(1).build();
			
			// Create a stub, pass the channel to the stub
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			
			//retreving reply from service
			//ds.service1.ResponseMessage response = blockingStub.service1Do(request);

			// Calling the methods or rpcs from the service
			success response = bstub.introduceProfile(cardNumber);
			System.out.println(response.getMessage());
			Iterator<success> responses = bstub.absenceEmptyAgenda(null);
			while (responses.hasNext()) {
				success iteratedResponse = responses.next();
				System.out.println(iteratedResponse.getMessage());
			}
			
			
			reply1.setText( String.valueOf( response) );
			
			// Shutdown the channel
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		
			/*
			 * 
			 
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText(entry2.getText()).build();

			//retreving reply from service
			ds.service2.ResponseMessage response = blockingStub.service2Do(request);

			reply2.setText( String.valueOf( response.getLength()) );
			*/
		}else if (label.equals("Invoke Service 3")) {
			System.out.println("service 3 to be invoked ...");

		
			/*
			 * 
			 
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service3.RequestMessage request = ds.service3.RequestMessage.newBuilder().setText(entry3.getText()).build();

			//retreving reply from service
			ds.service3.ResponseMessage response = blockingStub.service3Do(request);

			reply3.setText( String.valueOf( response.getLength()) );
			*/
		}else if (label.equals("Invoke Service 4")) {
			System.out.println("service 4 to be invoked ...");

		
			/*
			 * 
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
			Service4Grpc.Service4BlockingStub blockingStub = Service4Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service4.RequestMessage request = ds.service4.RequestMessage.newBuilder().setText(entry4.getText()).build();

			//retreving reply from service
			ds.service4.ResponseMessage response = blockingStub.service4Do(request);

			reply4.setText( String.valueOf( response.getLength()) );
		 */
		}else{
			
		}

	}


}

