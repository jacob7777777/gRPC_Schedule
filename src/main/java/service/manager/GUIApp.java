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
	private JTextField entryCardNumber;
	private JTextField entryTask;
	private JTextField entryCapProfMon;
	private JTextField entryCapProfTue;
	private JTextField entryCapProfWed;
	private JTextField entryCapProfThu;
	private JTextField entryCapProfFri;
	private JTextArea reply1;
	
	private JTextField entryCardNumber1;
	private JTextField entryJobNumber;
	private JTextField entryHoursBooked;
	private JTextField entryDayBooked;
	private JTextField entryMonthBooked;
	private JTextField entryYearBooked;
	private JTextArea reply11;
	
	
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	
	
	
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
		
		JLabel labelProfile = new JLabel("Profile")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(labelProfile, appGrid);
		
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JLabel labelCardNumber = new JLabel("Card Number: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelCardNumber, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCardNumber = new JTextField("",5);
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(entryCardNumber, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelTask = new JLabel("Task: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(labelTask, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryTask = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 4;
		panel.add(entryTask, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		JLabel labelCapProf = new JLabel("Capacity profile")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;
		panel.add(labelCapProf, appGrid);
		
		JLabel labelCapProfMon = new JLabel("Monday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(labelCapProfMon, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfMon = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 2;
		panel.add(entryCapProfMon, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfTue = new JLabel("Tuesday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 3;
		panel.add(labelCapProfTue, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfTue = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 3;
		panel.add(entryCapProfTue, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfWed = new JLabel("Wednesday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 4;
		panel.add(labelCapProfWed, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfWed = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 4;
		panel.add(entryCapProfWed, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfThu = new JLabel("Thursday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 5;
		panel.add(labelCapProfThu, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfThu = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 5;
		panel.add(entryCapProfThu, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfFri = new JLabel("Friday")	;
		appGrid.gridx = 1;
		appGrid.gridy = 6;
		panel.add(labelCapProfFri, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfFri = new JTextField("",10);
		appGrid.gridx = 2;
		appGrid.gridy = 6;
		panel.add(entryCapProfFri, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		

		JButton button = new JButton("Introduce profile");
		button.addActionListener(this);
		appGrid.gridx = 1;
		appGrid.gridy = 8;
		panel.add(button, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		//reply1 = new JTextField("", 10);
		reply1 = new JTextArea(3, 20);
		reply1 .setEditable(false);
		appGrid.gridx = 2;
		appGrid.gridy = 8;
		panel.add(reply1, appGrid);
		
		//panel.setLayout(boxlayout);
		//innerPanel.setLayout(boxlayout);	
		//innerPanel2.setLayout(boxlayout2);	
		//innerPanel3.setLayout(boxlayout3);
		
		//panel.add(innerPanel);
		//panel.add(innerPanel2);
		//panel.add(innerPanel3);
		
		JLabel labelAbsenceRequest = new JLabel("Absence Request")	;
		appGrid.gridx = 3;
		appGrid.gridy = 0;	
		panel.add(labelAbsenceRequest, appGrid);
		
		JLabel labelCardNumber1 = new JLabel("Card Number")	;
		appGrid.gridx = 3;
		appGrid.gridy = 1;
		panel.add(labelCardNumber1, appGrid);
		entryCardNumber1 = new JTextField("",10);
		appGrid.gridx = 3;
		appGrid.gridy = 2;
		panel.add(entryCardNumber1, appGrid);
		
		JLabel labelJobNumber = new JLabel("Job Number")	;
		appGrid.gridx = 3;
		appGrid.gridy = 3;
		panel.add(labelJobNumber, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryJobNumber = new JTextField("",10);
		appGrid.gridx = 3;
		appGrid.gridy = 4;
		panel.add(entryJobNumber, appGrid);
		
		JLabel labelHoursBooked = new JLabel("Hours Booked")	;
		appGrid.gridx = 4;
		appGrid.gridy = 1;
		panel.add(labelHoursBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryHoursBooked = new JTextField("",10);
		appGrid.gridx = 5;
		appGrid.gridy = 1;
		panel.add(entryHoursBooked, appGrid);
		
		JLabel labelDayBooked = new JLabel("Day Booked")	;
		appGrid.gridx = 4;
		appGrid.gridy = 2;
		panel.add(labelDayBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryDayBooked = new JTextField("",10);
		appGrid.gridx = 5;
		appGrid.gridy = 2;
		panel.add(entryDayBooked, appGrid);
		
		JLabel labelMonthBooked = new JLabel("Month Booked")	;
		appGrid.gridx = 4;
		appGrid.gridy = 3;
		panel.add(labelMonthBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryMonthBooked = new JTextField("",10);
		appGrid.gridx = 5;
		appGrid.gridy = 3;
		panel.add(entryMonthBooked, appGrid);
		
		JLabel labelYearBooked = new JLabel("Year Booked")	;
		appGrid.gridx = 4;
		appGrid.gridy = 4;
		panel.add(labelYearBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryYearBooked = new JTextField("",10);
		appGrid.gridx = 5;
		appGrid.gridy = 4;
		panel.add(entryYearBooked, appGrid);
		
		JButton button2 = new JButton("Request Abscence");
		button.addActionListener(this);
		appGrid.gridx = 4;
		appGrid.gridy = 8;
		panel.add(button2, appGrid);
		
		reply11 = new JTextArea(3, 20);
		reply11.setEditable(false);
		appGrid.gridx = 5;
		appGrid.gridy = 8;
		panel.add(reply11, appGrid);

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
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
	
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

		if (label.equals("Introduce profile")) {
			System.out.println("service 1 to be invoked ...");
			
			/*
			 * 
			 */
			//Build a channel
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			
						
			// Building and preparing message to send
			profile request = profile.newBuilder()
					.setCardNumber(Integer.parseInt(entryCardNumber.getText()))
					.setTask(entryTask.getText())
					.setCapProfMon(Float.parseFloat(entryCapProfMon.getText()))
					.setCapProfTue(Float.parseFloat(entryCapProfTue.getText()))
					.setCapProfWed(Float.parseFloat(entryCapProfWed.getText()))
					.setCapProfThu(Float.parseFloat(entryCapProfThu.getText()))
					.setCapProfFri(Float.parseFloat(entryCapProfFri.getText()))
					.build();
			
			System.out.println(request);
			
			// Create a stub, pass the channel to the stub
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			bstub.introduceProfile(request);
			//professional.introduceProfile(request);
			
			//profile cardNumber = profile.newBuilder().setCardNumber(Integer.parseInt(entryCardNumber.getText())).build();//OJO QUE AQUI HE METIDO UN entry1.getX
			//profile task = profile.newBuilder().setTask(entryTask.getText()).build();
			//profile capProfMon = profile.newBuilder().setCapProfMon(Float.parseFloat(entryCapProfMon.getText())).build();
			//profile capProfTue = profile.newBuilder().setCapProfTue(Float.parseFloat(entryCapProfTue.getText())).build();
			//profile capProfWed = profile.newBuilder().setCapProfWed(Float.parseFloat(entryCapProfWed.getText())).build();
			//profile capProfThu = profile.newBuilder().setCapProfThu(Float.parseFloat(entryCapProfThu.getText())).build();
			//profile capProfFri = profile.newBuilder().setCapProfFri(Float.parseFloat(entryCapProfFri.getText())).build();
			
			absenceRequest cardNumber1 = absenceRequest.newBuilder().setCardNumber1(7).build();
			absenceRequest jobNumber = absenceRequest.newBuilder().setJobNumber(8).build();
			absenceRequest hoursBooked = absenceRequest.newBuilder().setHoursBooked(1).build();
			absenceRequest dayBooked = absenceRequest.newBuilder().setDayBooked(1).build();
			absenceRequest monthBooked = absenceRequest.newBuilder().setMonthBooked(1).build();
			absenceRequest yearBooked = absenceRequest.newBuilder().setYearBooked(1).build();
			
			
			//retreving reply from service
			//ds.service1.ResponseMessage response = blockingStub.service1Do(request);

			// Calling the methods or rpcs from the service
			success response = bstub.introduceProfile(null);
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

