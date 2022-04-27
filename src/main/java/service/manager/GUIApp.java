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
import project.manager.taskMatch;
import project.manager.taskSpecifications;
import project.manager.FindingWorkersGrpc.FindingWorkersBlockingStub;
import project.manager.FindingWorkersGrpc.FindingWorkersStub;
import email.notification.NotificationGrpc;
import email.notification.NotificationGrpc.NotificationStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class GUIApp implements ActionListener{

	//IO GUI fields
	// Professional
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
	
	//Project Manager
	private	JTextField	entryProjectNumber;
	private	JTextField	entryTask2;
	private	JTextField	entryNumberHours;
	private	JTextField	entryStartDay;
	private	JTextField	entryStartMonth;
	private	JTextField	entryStartYear;
	private	JTextField	entryMilestoneDay;
	private	JTextField	entryMilestoneMonth;
	private	JTextField	entryMilestoneYear;
	private JTextArea reply2;								
	private	JTextField	entryWorkingDay;
	private	JTextField	entryWorkingMonth;
	private	JTextField	entryWorkingYear;
	private	JTextField	entryNumberOfHours;
	private	JTextField	entryCardNumber3;
	private JTextArea reply21;
	
	//Notifications
	private JTextArea reply3;
	private JTextArea reply31;
	
	// This section offers three different panels and corresponding grids in order to build a GUI
	// Labels, entry fields, buttons and text area response compose it.
	
	// Professional client
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel(); // Create panel in order to add labels, fields an buttons
		panel.setBackground(Color.gray);

		panel.setLayout(new GridBagLayout());
		GridBagConstraints appGrid = new GridBagConstraints(); // Create the grid
		appGrid.fill = GridBagConstraints.HORIZONTAL; // Align the grid
		appGrid.insets = new Insets(5, 5, 5, 5); // Set border for the panel

		JLabel labelProfessional = new JLabel("PROFESSIONAL")	; // Create the label
		appGrid.gridx = 0; // Place the label
		appGrid.gridy = 0;
		panel.add(labelProfessional, appGrid);
		
		// Introduce profile RPC
		JLabel labelProfile = new JLabel("Profile")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelProfile, appGrid);
		
		JLabel labelCardNumber = new JLabel("Card Number: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(labelCardNumber, appGrid);
		entryCardNumber = new JTextField("",5);
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(entryCardNumber, appGrid);
		
		JLabel labelTask = new JLabel("Task: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 4;
		panel.add(labelTask, appGrid);
		entryTask = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 5;
		panel.add(entryTask, appGrid);

		JLabel labelCapProf = new JLabel("Capacity profile")	;
		appGrid.gridx = 0;
		appGrid.gridy = 6;
		panel.add(labelCapProf, appGrid);
		
		JLabel labelCapProfMon = new JLabel("Monday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 7;
		panel.add(labelCapProfMon, appGrid);
		entryCapProfMon = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 8;
		panel.add(entryCapProfMon, appGrid);
		
		JLabel labelCapProfTue = new JLabel("Tuesday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 9;
		panel.add(labelCapProfTue, appGrid);
		entryCapProfTue = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 10;
		panel.add(entryCapProfTue, appGrid);
		
		JLabel labelCapProfWed = new JLabel("Wednesday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 11;
		panel.add(labelCapProfWed, appGrid);
		entryCapProfWed = new JTextField();
		appGrid.gridx = 0;
		appGrid.gridy = 12;
		panel.add(entryCapProfWed, appGrid);
		
		JLabel labelCapProfThu = new JLabel("Thursday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 13;
		panel.add(labelCapProfThu, appGrid);
		entryCapProfThu = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 14;
		panel.add(entryCapProfThu, appGrid);
		
		JLabel labelCapProfFri = new JLabel("Friday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 15;
		panel.add(labelCapProfFri, appGrid);
		entryCapProfFri = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 16;
		panel.add(entryCapProfFri, appGrid);
		
		JLabel labelStar = new JLabel("********************************************")	;
		appGrid.gridx = 0;
		appGrid.gridy = 17;
		panel.add(labelStar, appGrid);
		
		JButton button = new JButton("Introduce profile"); // Add button
		button.addActionListener(this);
		appGrid.gridx = 0;
		appGrid.gridy = 18;
		panel.add(button, appGrid);

		reply1 = new JTextArea(500, 500); // Add reply area
		reply1.setEditable(false);
		appGrid.gridx = 0;
		appGrid.gridy = 19;
		panel.add(reply1, appGrid);
		
		//Absence Request RPC		
		JLabel labelAbsenceRequest = new JLabel("Absence Request")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;	
		panel.add(labelAbsenceRequest, appGrid);
		
		JLabel labelCardNumber1 = new JLabel("Card Number")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(labelCardNumber1, appGrid);
		entryCardNumber1 = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 3;
		panel.add(entryCardNumber1, appGrid);
		
		JLabel labelJobNumber = new JLabel("Job Number")	;
		appGrid.gridx = 1;
		appGrid.gridy = 4;
		panel.add(labelJobNumber, appGrid);
		entryJobNumber = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 5;
		panel.add(entryJobNumber, appGrid);
		
		JLabel labelHoursBooked = new JLabel("Hours Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 6;
		panel.add(labelHoursBooked, appGrid);
		entryHoursBooked = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 7;
		panel.add(entryHoursBooked, appGrid);
		
		JLabel labelDayBooked = new JLabel("Day Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 8;
		panel.add(labelDayBooked, appGrid);
		entryDayBooked = new JTextField();
		appGrid.gridx = 1;
		appGrid.gridy = 9;
		panel.add(entryDayBooked, appGrid);
		
		JLabel labelMonthBooked = new JLabel("Month Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 10;
		panel.add(labelMonthBooked, appGrid);
		entryMonthBooked = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 11;
		panel.add(entryMonthBooked, appGrid);
		
		JLabel labelYearBooked = new JLabel("Year Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 12;
		panel.add(labelYearBooked, appGrid);
		entryYearBooked = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 13;
		panel.add(entryYearBooked, appGrid);
		
		JLabel labelStar2 = new JLabel("********************************************")	;
		appGrid.gridx = 1;
		appGrid.gridy = 17;
		panel.add(labelStar2, appGrid);
		
		JButton button11 = new JButton("Request Absence");
		button11.addActionListener(this);
		appGrid.gridx = 1;
		appGrid.gridy = 18;
		panel.add(button11, appGrid);
		
		reply11 = new JTextArea(3, 50);
		reply11.setEditable(false);
		appGrid.gridx = 1;
		appGrid.gridy = 19;
		panel.add(reply11, appGrid);

		return panel;

	}
	
	// Project Manager client
	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints appGrid = new GridBagConstraints();	
		appGrid.fill = GridBagConstraints.HORIZONTAL;
		appGrid.insets = new Insets(5, 5, 5, 5);
		
		JLabel labelProfile = new JLabel("PROJECT MANAGER")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(labelProfile, appGrid);
		
		// Task Finder RPC
		JLabel labelTaskFinder = new JLabel("Task Finder")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelTaskFinder, appGrid);
		
		JLabel labelProjectNumber = new JLabel("Project Number")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(labelProjectNumber, appGrid);
		entryProjectNumber = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(entryProjectNumber, appGrid);
		
		JLabel labelTask2 = new JLabel("Task")	;
		appGrid.gridx = 0;
		appGrid.gridy = 4;
		panel.add(labelTask2, appGrid);
		entryTask2 = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 5;
		panel.add(entryTask2, appGrid);
		
		JLabel labelNumberHours = new JLabel("Number of Hours")	;
		appGrid.gridx = 0;
		appGrid.gridy = 6;
		panel.add(labelNumberHours, appGrid);
		entryNumberHours = new JTextField();
		appGrid.gridx = 0;
		appGrid.gridy = 7;
		panel.add(entryNumberHours, appGrid);
		
		JLabel labelStartDay = new JLabel("Start day")	;
		appGrid.gridx = 0;
		appGrid.gridy = 8;
		panel.add(labelStartDay, appGrid);
		entryStartDay = new JTextField();
		appGrid.gridx = 0;
		appGrid.gridy = 9;
		panel.add(entryStartDay, appGrid);
		
		JLabel labelStartMonth = new JLabel("Start month")	;
		appGrid.gridx = 0;
		appGrid.gridy = 10;
		panel.add(labelStartMonth, appGrid);
		entryStartMonth = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 11;
		panel.add(entryStartMonth, appGrid);
		
		JLabel labelStartYear = new JLabel("Start year")	;
		appGrid.gridx = 0;
		appGrid.gridy = 12;
		panel.add(labelStartYear, appGrid);
		entryStartYear = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 13;
		panel.add(entryStartYear, appGrid);
		
		JLabel labelMilestoneDay = new JLabel("Milestone day")	;
		appGrid.gridx = 0;
		appGrid.gridy = 14;
		panel.add(labelMilestoneDay, appGrid);
		entryMilestoneDay = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 15;
		panel.add(entryMilestoneDay, appGrid);
		
		JLabel labelMilestoneMonth = new JLabel("Milestone month")	;
		appGrid.gridx = 0;
		appGrid.gridy = 16;
		panel.add(labelMilestoneMonth, appGrid);
		entryMilestoneMonth = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 17;
		panel.add(entryMilestoneMonth, appGrid);
		
		JLabel labelMilestoneYear = new JLabel("Milestone year")	;
		appGrid.gridx = 0;
		appGrid.gridy = 18;
		panel.add(labelMilestoneYear, appGrid);
		entryMilestoneYear = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 19;
		panel.add(entryMilestoneYear, appGrid);
		
		JLabel labelStar = new JLabel("********************************************")	;
		appGrid.gridx = 0;
		appGrid.gridy = 20;
		panel.add(labelStar, appGrid);
		
		JButton button2 = new JButton("Find Task");
		button2.addActionListener(this);
		appGrid.gridx = 0;
		appGrid.gridy = 21;
		panel.add(button2, appGrid);
		
		reply2 = new JTextArea(3, 50);
		reply2.setEditable(false);
		appGrid.gridx = 0;
		appGrid.gridy = 22;
		panel.add(reply2, appGrid);

		//Task Request RPC
		JLabel labelTaskRequest = new JLabel("Task Request")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;
		panel.add(labelTaskRequest, appGrid);
		
		JLabel labelCardNumber3 = new JLabel("Card number")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(labelCardNumber3, appGrid);
		entryCardNumber3 = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 3;
		panel.add(entryCardNumber3, appGrid);
		
		JLabel labelNumberOfHours = new JLabel("Number of hours")	;
		appGrid.gridx = 1;
		appGrid.gridy = 4;
		panel.add(labelNumberOfHours, appGrid);
		entryNumberOfHours = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 5;
		panel.add(entryNumberOfHours, appGrid);
		
		JLabel labelWorkingDay = new JLabel("Working day")	;
		appGrid.gridx = 1;
		appGrid.gridy = 6;
		panel.add(labelWorkingDay, appGrid);
		entryWorkingDay = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 7;
		panel.add(entryWorkingDay, appGrid);
		
		JLabel labelWorkingMonth = new JLabel("Working month")	;
		appGrid.gridx = 1;
		appGrid.gridy = 8;
		panel.add(labelWorkingMonth, appGrid);
		entryWorkingMonth = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 9;
		panel.add(entryWorkingMonth, appGrid);
		
		JLabel labelWorkingYear = new JLabel("Working year")	;
		appGrid.gridx = 1;
		appGrid.gridy = 10;
		panel.add(labelWorkingYear, appGrid);
		entryWorkingYear = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 11;
		panel.add(entryWorkingYear, appGrid);
		
		JLabel labelStar2 = new JLabel("********************************************")	;
		appGrid.gridx = 1;
		appGrid.gridy = 20;
		panel.add(labelStar2, appGrid);
		
		JButton button21 = new JButton("Task Request");
		button21.addActionListener(this);
		appGrid.gridx = 1;
		appGrid.gridy = 21;
		panel.add(button21, appGrid);
		
		reply21 = new JTextArea(3, 50);
		reply21.setEditable(false);
		appGrid.gridx = 1;
		appGrid.gridy = 22;
		panel.add(reply21, appGrid);
		
		return panel;
	}

	
	// Notifications client
	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);

		panel.setLayout(new GridBagLayout());
		GridBagConstraints appGrid = new GridBagConstraints();	
		appGrid.fill = GridBagConstraints.HORIZONTAL;
		appGrid.insets = new Insets(5, 5, 5, 5);

		JLabel labelProfessional = new JLabel("EMAIL NOTIFICATIONS")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(labelProfessional, appGrid);
		
		// First Notification RPC
		JLabel labelProfile = new JLabel("Job confirmation")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelProfile, appGrid);

		JLabel labelConfirmation = new JLabel("Confirmation:")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(labelConfirmation, appGrid);
		JCheckBox checkBox1 = new JCheckBox("Confirmation");  
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(checkBox1, appGrid);
		
		JLabel labelStar = new JLabel("********************************************")	;
		appGrid.gridx = 0;
		appGrid.gridy = 20;
		panel.add(labelStar, appGrid);
		
		JButton button3 = new JButton("Send answer");
		button3.addActionListener(this);
		appGrid.gridx = 0;
		appGrid.gridy = 21;
		panel.add(button3, appGrid);
				
		reply3 = new JTextArea(3, 50);
		reply3.setEditable(false);
		appGrid.gridx = 0;
		appGrid.gridy = 22;
		panel.add(reply3, appGrid);

		// Second Notification
		JLabel labelAbs = new JLabel("Absence Confirmation")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;
		panel.add(labelAbs, appGrid);
		
		JLabel labelAbsConfirmation = new JLabel("Confirmation: ")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(labelAbsConfirmation, appGrid);
		JCheckBox checkBox2 = new JCheckBox("Confirmation");  
		checkBox2.setBounds(100,100, 50,50);  
		appGrid.gridx = 1;
		appGrid.gridy = 3;
		panel.add(checkBox2, appGrid);
		
		JLabel labelStar1 = new JLabel("********************************************")	;
		appGrid.gridx = 1;
		appGrid.gridy = 20;
		panel.add(labelStar1, appGrid);
		
		JButton button4 = new JButton("Send answer 2");
		button4.addActionListener(this);
		appGrid.gridx = 1;
		appGrid.gridy = 21;
		panel.add(button4, appGrid);
				
		reply31 = new JTextArea(3, 50);
		reply31.setEditable(false);
		appGrid.gridx = 1;
		appGrid.gridy = 22;
		panel.add(reply31, appGrid);

		return panel;
	}

	
	// This section offers an aggregated GUI view of the three different clients in a master template
	public static void main(String[] args) {
		GUIApp gui = new GUIApp(); //Build GUI
		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("GUI Application with the 3 services");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Stop running

		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS); // Set the BoxLayout to be X_AXIS: from left to right
		panel.setLayout(boxlayout);

		panel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
	
		panel.add(getService1JPanel());
		panel.add(getService2JPanel());
		panel.add(getService3JPanel());

		frame.setSize(300,300); // Set size for the frame
		frame.add(panel); // Set the window to be visible as the default to be false
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Introduce profile")) {
			System.out.println("Introduce profile from the professional service to be invoked ...");

			//Build a channel
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
					
			// Building and preparing message to send
			profile request = profile.newBuilder()
					.setCardNumber(Integer.parseInt(entryCardNumber.getText()))
					.setTask((String)(entryTask.getText()))
					.setCapProfMon(Float.parseFloat(entryCapProfMon.getText()))
					.setCapProfTue(Float.parseFloat(entryCapProfTue.getText()))
					.setCapProfWed(Float.parseFloat(entryCapProfWed.getText()))
					.setCapProfThu(Float.parseFloat(entryCapProfThu.getText()))
					.setCapProfFri(Float.parseFloat(entryCapProfFri.getText()))
					.build();
			
			// Create a stub, pass the channel to the stub
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			bstub.introduceProfile(request);

			// Calling the methods or rpcs from the service
			success response = bstub.introduceProfile(null);
			
			reply1.setText(String.valueOf(response));

			// Shutdown the channel
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		if (label.equals("Request Absence")){
			System.out.println("Request Absence from Professional service to be invoked ...");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			
			absenceRequest request = absenceRequest.newBuilder()
					.setCardNumber1(Integer.parseInt(entryCardNumber1.getText()))
					.setJobNumber(Integer.parseInt(entryJobNumber.getText()))
					.setHoursBooked(Float.parseFloat(entryHoursBooked.getText()))
					.setDayBooked(Integer.parseInt(entryDayBooked.getText()))
					.setMonthBooked(Integer.parseInt(entryMonthBooked.getText()))
					.setYearBooked(Integer.parseInt(entryYearBooked.getText()))
					.build();
			
			Iterator <success> responses;
			
			try {
				responses = bstub.absenceEmptyAgenda(request);
				while (responses.hasNext()) {
					success iteratedResponse = responses.next();
					System.out.println(iteratedResponse.getMessage());
					reply11.setText(String.valueOf(responses));
				}
			} catch (StatusRuntimeException e1) {
		        System.out.println("RPC failed" + e1.getStatus());
		    }
			
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}	
		}
		
		if (label.equals("Find Task")) {
			System.out.println("service Find Task to be invoked ...");

			int port = 50052;
			String host = "localhost";
			ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

			taskSpecifications request = taskSpecifications.newBuilder()
					.setProjectNumber(Integer.parseInt(entryProjectNumber.getText()))
					.setTask((String)(entryTask2.getText()))
					.setNumberHours(Float.parseFloat(entryNumberHours.getText()))
					.setStartDay(Integer.parseInt(entryStartDay.getText()))
					.setStartMonth(Integer.parseInt(entryStartMonth.getText()))
					.setStartYear(Integer.parseInt(entryStartYear.getText()))
					.setMilestoneDay(Integer.parseInt(entryMilestoneDay.getText()))
					.setMilestoneMonth(Integer.parseInt(entryMilestoneMonth.getText()))
					.setMilestoneYear(Integer.parseInt(entryMilestoneYear.getText()))					
					.build();

			FindingWorkersBlockingStub bstub = FindingWorkersGrpc.newBlockingStub(channel); //blocking stub for server stream
			
			bstub.taskFinding(request);
			Iterator<project.manager.success> responses = bstub.taskFinding(null);
			while (responses.hasNext()) {
				project.manager.success iteratedResponse = responses.next();
				System.out.println(iteratedResponse.getTask());
			}
			
			reply2.setText(String.valueOf(responses));

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				try {
					channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
			}

		}
		

		
		if (label.equals("Task Request")){
			System.out.println("service Task Request to be invoked ...");
			int port = 50052;
			String host = "localhost";
			ManagedChannel channel1 = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
			
			//Client streaming
			StreamObserver<success> responseObserver = new StreamObserver<success>() {
				
				@Override
				public void onNext(success value) {
					taskMatch request2 = taskMatch.newBuilder()
							.setWorkingDay(Integer.parseInt(entryWorkingDay.getText()))
							.setWorkingMonth(Integer.parseInt(entryWorkingMonth.getText()))
							.setWorkingYear(Integer.parseInt(entryWorkingYear.getText()))
							.setNumberOfHours(Float.parseFloat(entryNumberOfHours.getText()))
							.setCardNumber(Integer.parseInt(entryCardNumber3.getText()))
							.build();
				}
				@Override
				public void onError(Throwable t) {
					System.out.println("Error");
					
				}
				@Override
				public void onCompleted() {
					System.out.println("Completed");	
				}};
				
				FindingWorkersStub asyncStub = FindingWorkersGrpc.newStub(channel1); //asynchronous stub for client streaming 
				StreamObserver<project.manager.taskMatch> requestObserver = asyncStub.taskRequest(null);
		
			    try {
			        reply21.setText("Message sent");
			        requestObserver.onNext(null);
			    } catch (RuntimeException e0) {
			        requestObserver.onError(e0);
			        throw e0;
			    }
			    System.out.println("Client has finished sending messages");
			    reply21.setText("Client has finished sending messages");
			    requestObserver.onCompleted();
			}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

		if (label.equals("Send answer")) {

		if (label.equals("Send answer 2")) {
			System.out.println("service Send answer 2 to be invoked ...");

		}
			
		}

	}


}

