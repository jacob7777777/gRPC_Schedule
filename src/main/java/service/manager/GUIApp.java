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
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


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

	//private JTextField entry3, reply3;
	
	private JTextArea reply3;
	private JTextArea reply31;
	
	
	
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
		
		JLabel labelProfessional = new JLabel("PROFESSIONAL")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(labelProfessional, appGrid);
		
		JLabel labelProfile = new JLabel("Profile")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelProfile, appGrid);
		
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JLabel labelCardNumber = new JLabel("Card Number: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(labelCardNumber, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCardNumber = new JTextField("",5);
		appGrid.gridx = 0;
		appGrid.gridy = 3;
		panel.add(entryCardNumber, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelTask = new JLabel("Task: ")	;
		appGrid.gridx = 0;
		appGrid.gridy = 4;
		panel.add(labelTask, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryTask = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 5;
		panel.add(entryTask, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		JLabel labelCapProf = new JLabel("Capacity profile")	;
		appGrid.gridx = 0;
		appGrid.gridy = 6;
		panel.add(labelCapProf, appGrid);
		
		JLabel labelCapProfMon = new JLabel("Monday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 7;
		panel.add(labelCapProfMon, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfMon = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 8;
		panel.add(entryCapProfMon, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfTue = new JLabel("Tuesday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 9;
		panel.add(labelCapProfTue, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfTue = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 10;
		panel.add(entryCapProfTue, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfWed = new JLabel("Wednesday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 11;
		panel.add(labelCapProfWed, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfWed = new JTextField();
		appGrid.gridx = 0;
		appGrid.gridy = 12;
		panel.add(entryCapProfWed, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfThu = new JLabel("Thursday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 13;
		panel.add(labelCapProfThu, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfThu = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 14;
		panel.add(entryCapProfThu, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelCapProfFri = new JLabel("Friday")	;
		appGrid.gridx = 0;
		appGrid.gridy = 15;
		panel.add(labelCapProfFri, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryCapProfFri = new JTextField("",10);
		appGrid.gridx = 0;
		appGrid.gridy = 16;
		panel.add(entryCapProfFri, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		JLabel labelStar = new JLabel("********************************************")	;
		appGrid.gridx = 0;
		appGrid.gridy = 17;
		panel.add(labelStar, appGrid);
		

		JButton button = new JButton("Introduce profile");
		button.addActionListener(this);
		appGrid.gridx = 0;
		appGrid.gridy = 18;
		panel.add(button, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));

		//reply1 = new JTextField("", 10);
		reply1 = new JTextArea(500, 500);
		reply1 .setEditable(false);
		appGrid.gridx = 0;
		appGrid.gridy = 19;
		panel.add(reply1, appGrid);
		
		//panel.setLayout(boxlayout);
		//innerPanel.setLayout(boxlayout);	
		//innerPanel2.setLayout(boxlayout2);	
		//innerPanel3.setLayout(boxlayout3);
		
		//panel.add(innerPanel);
		//panel.add(innerPanel2);
		//panel.add(innerPanel3);
		
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
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryJobNumber = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 5;
		panel.add(entryJobNumber, appGrid);
		
		JLabel labelHoursBooked = new JLabel("Hours Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 6;
		panel.add(labelHoursBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryHoursBooked = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 7;
		panel.add(entryHoursBooked, appGrid);
		
		JLabel labelDayBooked = new JLabel("Day Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 8;
		panel.add(labelDayBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryDayBooked = new JTextField();
		appGrid.gridx = 1;
		appGrid.gridy = 9;
		panel.add(entryDayBooked, appGrid);
		
		JLabel labelMonthBooked = new JLabel("Month Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 10;
		panel.add(labelMonthBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		entryMonthBooked = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 11;
		panel.add(entryMonthBooked, appGrid);
		
		JLabel labelYearBooked = new JLabel("Year Booked")	;
		appGrid.gridx = 1;
		appGrid.gridy = 12;
		panel.add(labelYearBooked, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
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

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints appGrid = new GridBagConstraints();	
		appGrid.fill = GridBagConstraints.HORIZONTAL;
		appGrid.insets = new Insets(5, 5, 5, 5);
		//BoxLayout boxlayout = new BoxLayout(innerPanel, BoxLayout.LINE_AXIS);
		//BoxLayout boxlayout2 = new BoxLayout(innerPanel2, BoxLayout.Y_AXIS);
		//BoxLayout boxlayout3 = new BoxLayout(innerPanel3, BoxLayout.Y_AXIS);
		
		JLabel labelProfile = new JLabel("PROJECT MANAGER")	;
		appGrid.gridx = 0;
		appGrid.gridy = 0;
		panel.add(labelProfile, appGrid);

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

		///////////////////////////////////////////////////
		
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
		
		JLabel labelWorkingMonth = new JLabel("Working day")	;
		appGrid.gridx = 1;
		appGrid.gridy = 8;
		panel.add(labelWorkingMonth, appGrid);
		entryWorkingMonth = new JTextField("",10);
		appGrid.gridx = 1;
		appGrid.gridy = 9;
		panel.add(entryWorkingMonth, appGrid);
		
		JLabel labelWorkingYear = new JLabel("Working day")	;
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
		
		JLabel labelProfile = new JLabel("Job confirmation")	;
		appGrid.gridx = 0;
		appGrid.gridy = 1;
		panel.add(labelProfile, appGrid);
		
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JLabel labelConfirmation = new JLabel("Confirmation:")	;
		appGrid.gridx = 0;
		appGrid.gridy = 2;
		panel.add(labelConfirmation, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JCheckBox checkBox1 = new JCheckBox("Confirmation");  
		//checkBox1.setBounds(100,100, 50,50);  
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
		
/*
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

		panel.setLayout(boxlayout);*/
		

		
		reply3 = new JTextArea(3, 50);
		reply3.setEditable(false);
		appGrid.gridx = 0;
		appGrid.gridy = 22;
		panel.add(reply3, appGrid);

		
		
		//////////////////////////////////
		//////////////////////////////////
		JLabel labelAbs = new JLabel("Absence Confirmation")	;
		appGrid.gridx = 1;
		appGrid.gridy = 1;
		panel.add(labelAbs, appGrid);
		
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
		JLabel labelAbsConfirmation = new JLabel("Confirmation: ")	;
		appGrid.gridx = 1;
		appGrid.gridy = 2;
		panel.add(labelAbsConfirmation, appGrid);
		//panel.add(Box.createRigidArea(new Dimension(10, 10)));
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


	public static void main(String[] args) {

		GUIApp gui = new GUIApp();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("GUI Application with the 3 services");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Set the panel to add buttons
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
	
		panel.add(getService1JPanel());
		panel.add(getService2JPanel());
		panel.add(getService3JPanel());


		// Set size for the frame
		frame.setSize(300,300);

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
			System.out.println("Introduce profile from the professional service to be invoked ...");
			
			/*
			 * 
			 */
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
			
			System.out.println(request);
		
			/*
			absenceRequest request1 = absenceRequest.newBuilder()
					.setCardNumber1(Integer.parseInt(entryCardNumber1.getText()))
					.setJobNumber(Integer.parseInt(entryTask.getText()))
					.setHoursBooked(Float.parseFloat(entryHoursBooked.getText()))
					.setDayBooked(Integer.parseInt(entryDayBooked.getText()))
					.setMonthBooked(Integer.parseInt(entryMonthBooked.getText()))
					.setYearBooked(Integer.parseInt(entryYearBooked.getText()))
					.build();
			*/
			
			// Create a stub, pass the channel to the stub
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			bstub.introduceProfile(request);
			//bstub.absenceEmptyAgenda(request1);
			//professional.introduceProfile(request);
			
			//profile cardNumber = profile.newBuilder().setCardNumber(Integer.parseInt(entryCardNumber.getText())).build();//OJO QUE AQUI HE METIDO UN entry1.getX
			//profile task = profile.newBuilder().setTask(entryTask.getText()).build();
			//profile capProfMon = profile.newBuilder().setCapProfMon(Float.parseFloat(entryCapProfMon.getText())).build();
			//profile capProfTue = profile.newBuilder().setCapProfTue(Float.parseFloat(entryCapProfTue.getText())).build();
			//profile capProfWed = profile.newBuilder().setCapProfWed(Float.parseFloat(entryCapProfWed.getText())).build();
			//profile capProfThu = profile.newBuilder().setCapProfThu(Float.parseFloat(entryCapProfThu.getText())).build();
			//profile capProfFri = profile.newBuilder().setCapProfFri(Float.parseFloat(entryCapProfFri.getText())).build();
			
			//absenceRequest cardNumber1 = absenceRequest.newBuilder().setCardNumber1(7).build();
			//absenceRequest jobNumber = absenceRequest.newBuilder().setJobNumber(8).build();
			//absenceRequest hoursBooked = absenceRequest.newBuilder().setHoursBooked(1).build();
			//absenceRequest dayBooked = absenceRequest.newBuilder().setDayBooked(1).build();
			//absenceRequest monthBooked = absenceRequest.newBuilder().setMonthBooked(1).build();
			//absenceRequest yearBooked = absenceRequest.newBuilder().setYearBooked(1).build();
			
			
			//retreving reply from service
			//ds.service1.ResponseMessage response = blockingStub.service1Do(request);

			// Calling the methods or rpcs from the service
			success response = bstub.introduceProfile(null);
			System.out.println(response.getMessage());
			/*
			Iterator<success> responses = bstub.absenceEmptyAgenda(null);
			while (responses.hasNext()) {
				success iteratedResponse = responses.next();
				System.out.println(iteratedResponse.getMessage());
			}*/
			
			
			reply1.setText(String.valueOf(response));
			//reply11.setText(String.valueOf(responses));
			
			
			// Shutdown the channel
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
		if (label.equals("Request Absence")){
			System.out.println("Request Absence from Professional service to be invoked ...");
			
			/*
			 * 
			 */
			//Build a channel
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			
						
			// Building and preparing message to send
			/*profile request = profile.newBuilder()
					.setCardNumber(Integer.parseInt(entryCardNumber.getText()))
					.setTask(entryTask.getText())
					.setCapProfMon(Float.parseFloat(entryCapProfMon.getText()))
					.setCapProfTue(Float.parseFloat(entryCapProfTue.getText()))
					.setCapProfWed(Float.parseFloat(entryCapProfWed.getText()))
					.setCapProfThu(Float.parseFloat(entryCapProfThu.getText()))
					.setCapProfFri(Float.parseFloat(entryCapProfFri.getText()))
					.build();
			
			System.out.println(request);
		*/
			
			absenceRequest request = absenceRequest.newBuilder()
					.setCardNumber1(Integer.parseInt(entryCardNumber1.getText()))
					.setJobNumber(Integer.parseInt(entryJobNumber.getText()))
					.setHoursBooked(Float.parseFloat(entryHoursBooked.getText()))
					.setDayBooked(Integer.parseInt(entryDayBooked.getText()))
					.setMonthBooked(Integer.parseInt(entryMonthBooked.getText()))
					.setYearBooked(Integer.parseInt(entryYearBooked.getText()))
					.build();
			
			Iterator <success> successMessages;
			
			try {
				logInfo("Message: ", )
			}
			// Create a stub, pass the channel to the stub
			professional.TimesheetsGrpc.TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(channel);
			//bstub.introduceProfile(request);
			bstub.absenceEmptyAgenda(request);
			//professional.introduceProfile(request);
			
			//profile cardNumber = profile.newBuilder().setCardNumber(Integer.parseInt(entryCardNumber.getText())).build();//OJO QUE AQUI HE METIDO UN entry1.getX
			//profile task = profile.newBuilder().setTask(entryTask.getText()).build();
			//profile capProfMon = profile.newBuilder().setCapProfMon(Float.parseFloat(entryCapProfMon.getText())).build();
			//profile capProfTue = profile.newBuilder().setCapProfTue(Float.parseFloat(entryCapProfTue.getText())).build();
			//profile capProfWed = profile.newBuilder().setCapProfWed(Float.parseFloat(entryCapProfWed.getText())).build();
			//profile capProfThu = profile.newBuilder().setCapProfThu(Float.parseFloat(entryCapProfThu.getText())).build();
			//profile capProfFri = profile.newBuilder().setCapProfFri(Float.parseFloat(entryCapProfFri.getText())).build();
			
			//absenceRequest cardNumber1 = absenceRequest.newBuilder().setCardNumber1(7).build();
			//absenceRequest jobNumber = absenceRequest.newBuilder().setJobNumber(8).build();
			//absenceRequest hoursBooked = absenceRequest.newBuilder().setHoursBooked(1).build();
			//absenceRequest dayBooked = absenceRequest.newBuilder().setDayBooked(1).build();
			//absenceRequest monthBooked = absenceRequest.newBuilder().setMonthBooked(1).build();
			//absenceRequest yearBooked = absenceRequest.newBuilder().setYearBooked(1).build();
			
			
			//retreving reply from service
			//ds.service1.ResponseMessage response = blockingStub.service1Do(request);

			// Calling the methods or rpcs from the service
			//success response = bstub.introduceProfile(null);
			//System.out.println(response.getMessage());
			
			Iterator<success> responses = bstub.absenceEmptyAgenda(null);
			while (responses.hasNext()) {
				success iteratedResponse = responses.next();
				System.out.println(iteratedResponse.getMessage());
			}
			
			
			//reply1.setText(String.valueOf(response));
			reply11.setText(String.valueOf(responses));
			
			
			// Shutdown the channel
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		
		if (label.equals("Find Task")) {
			System.out.println("service Find Task to be invoked ...");

			int port = 50052;
			String host = "localhost";
			ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
	
			
			// Build message
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
			
			System.out.println(request);
			
			/*			
			taskSpecifications projectNumber = taskSpecifications.newBuilder().setProjectNumber("test").build();
			taskSpecifications task = taskSpecifications.newBuilder().setTask("test").build();
			taskSpecifications numberHours = taskSpecifications.newBuilder().setNumberHours(1).build();
			taskSpecifications startDay = taskSpecifications.newBuilder().setStartDay(2).build();
			taskSpecifications startMonth = taskSpecifications.newBuilder().setStartMonth(3).build();
			taskSpecifications startYear = taskSpecifications.newBuilder().setStartYear(4).build();
			taskSpecifications milestoneDay = taskSpecifications.newBuilder().setMilestoneDay(5).build();
			taskSpecifications milestoneMonth = taskSpecifications.newBuilder().setMilestoneMonth(5).build();
			taskSpecifications milestoneYear = taskSpecifications.newBuilder().setMilestoneYear(5).build();
			*/
			
			/*
			taskMatch request2 = taskMatch.newBuilder().setWorkingDay(23)
					.setWorkingMonth(4)
					.setWorkingYear(2022)
					.setNumberOfHours(4)
					.setCardNumber("test")
					.build();
					
			*/

			/*
			taskMatch workingDay = taskMatch.newBuilder().setWorkingDay(23).build();
			taskMatch workingMonth = taskMatch.newBuilder().setWorkingMonth(4).build();
			taskMatch workingYear = taskMatch.newBuilder().setWorkingYear(2022).build();
			taskMatch numberOfHours = taskMatch.newBuilder().setNumberOfHours(4).build();
			taskMatch cardNumber = taskMatch.newBuilder().setCardNumber("test").build();
			*/
			
			
			
			// Create a stub, pass the channel to the stub
			FindingWorkersBlockingStub bstub = FindingWorkersGrpc.newBlockingStub(newChannel); //blocking stub for server stream
			
			//FindingWorkersStub asyncStub = FindingWorkersGrpc.newStub(newChannel); //asynchronous stub for client streaming 
			// Calling the methods or rpcs from the service
			bstub.taskFinding(request);
			Iterator<project.manager.success> responses = bstub.taskFinding(null);
			while (responses.hasNext()) {
				project.manager.success iteratedResponse = responses.next();
				System.out.println(iteratedResponse.getTask());
			}
			
			reply2.setText(String.valueOf(responses));
			//newResponse responseInt = bstub.getFirstInt(cString);
			//System.out.println("Now print our response from the getFirstInt rpc" + responseInt.getFirstInt());
			// Shutdown the channel
			
			//////////////////////////////////////////////////////
			/*
			//Client streaming
			StreamObserver<success> responseObserver = new StreamObserver<success>() {

				@Override
				public void onNext(success value) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					


					
				}};
				
			//StreamObserver so requestObserver from grpc library
				StreamObserver<taskMatch> requestObserver = asyncStub.taskRequest(null);
				requestObserver.onNext(null);
				//requestObserver.onNext(workingMonth);
				//requestObserver.onNext(workingYear);
				//requestObserver.onNext(numberOfHours);
				//requestObserver.onNext(cardNumber);
				System.out.println("Client has finished sending messages");
				requestObserver.onCompleted();
			*/
			/////////////////////////////////////////////////////
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			try {
				newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
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
		}
		
		if (label.equals("Task Request")) {
			System.out.println("service 3 to be invoked ...");
			int port = 50052;
			String host = "localhost";
			ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
			

			//FindingWorkersBlockingStub bstub = FindingWorkersGrpc.newBlockingStub(newChannel); //blocking stub for server stream
			FindingWorkersStub asyncStub = FindingWorkersGrpc.newStub(newChannel); //asynchronous stub for client streaming 
		
			//Client streaming
			
			//https://www.baeldung.com/java-grpc-streaming
			StreamObserver<success> responseObserver = new StreamObserver<success>() {

				@Override
				public void onNext(success value) {
					taskMatch request2 = taskMatch.newBuilder().setWorkingDay(23)
							.setWorkingMonth(4)
							.setWorkingYear(2022)
							.setNumberOfHours(4)
							.setCardNumber("test")
							.build();
					asyncStub.taskRequest(request2);
					
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("Error");
					
				}

				@Override
				public void onCompleted() {
					System.out.println("Completed");
					


					
				}};
				
			//StreamObserver so requestObserver from grpc library
				StreamObserver<taskMatch> requestObserver = asyncStub.taskRequest(null);
				requestObserver.onNext(null);
				reply21.setText("Message sent");
				//requestObserver.onNext(workingMonth);
				//requestObserver.onNext(workingYear);
				//requestObserver.onNext(numberOfHours);
				//requestObserver.onNext(cardNumber);
				System.out.println("Client has finished sending messages");
				requestObserver.onCompleted();
				
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			try {
				newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
		} 
		
		if (label.equals("Invoke Service 4")) {
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

