package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnect{

	/*
	private static String cardNumber;
	private static String task;
	private static   float capacityProfile;

	public dbConnect(String cardNumber, String task, float capacityProfile) {
		cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;
		
	}
*/
	private int cardNumberTaskCheck;
	private float numberOfHoursTaskCheck;
	private float capProfMon;
	private float capProfTue;
	private float capProfWed;
	private float capProfThur;
	private float capProfFri;
	//public String task;
	
	public void dbProfileIntegration(int cardNumber, String task,  float cap_prof_mon, float cap_prof_tue, float cap_prof_wed, float cap_prof_thu, float cap_prof_fri){
		/*cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;*/
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt = myConn.createStatement();
			//Execute a SQL query
			String sql = "INSERT INTO Professional_profile VALUES (" + cardNumber + ", '" + task + "', " + cap_prof_mon + "," + cap_prof_tue + "," + cap_prof_wed + "," + cap_prof_thu + "," + cap_prof_fri + ")";
			myStmt.executeUpdate(sql);
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile");
			//Process the result
			while (myRs.next()) {
				System.out.println(myRs.getString("task")+", "+ myRs.getString("cap_prof_fri"));
			}
			myRs.close();
			myStmt.close();
			myConn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public float dbCapacityProfileCheck(int cardNumber, int jobNumber, int dayBooked, int monthBooked, int yearBooked){
		/*cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;*/
		float totalHours = 0;
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt = myConn.createStatement();
			//Execute a SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_timesheet WHERE card_number = " + cardNumber + " AND date_booked = '" + yearBooked + "-" + monthBooked + "-" + dayBooked + "'");
			//String sql = "INSERT INTO Professional_profile VALUES (" + cardNumber + ", '" + task + "', " + cap_prof_mon + "," + cap_prof_tue + "," + cap_prof_wed + "," + cap_prof_thu + "," + cap_prof_fri + ")";
			//myStmt.executeUpdate(sql);
			//Process the result
			
			while (myRs.next()) {
				totalHours = totalHours + (float) myRs.getFloat("hours_booked");
				//System.out.println((float) myRs.getFloat("hours_booked"));
			}
			
			myRs.close();
			myStmt.close();
			myConn.close();
			
			//return totalHours;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return totalHours;
	}
	
	public void dbAbsenceRegistration(int cardNumber, int jobNumber, float hoursBooked, int dayBooked, int monthBooked, int yearBooked){
		/*cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;*/
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt = myConn.createStatement();
			//Execute a SQL query
			String sql = "INSERT INTO scheduler_db.professional_timesheet (card_number, job_number, hours_booked, date_booked) VALUES (" + cardNumber + ", " + jobNumber + ", " + hoursBooked + ", '" + yearBooked + "-" + monthBooked + "-" + dayBooked + "')"; //WHERE card_number = " + cardNumber;
			myStmt.executeUpdate(sql);
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile");
			//Process the result
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("task")+", "+ myRs.getString("cap_prof_fri"));
			//}
			myStmt.close();
			myConn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dbTaskCheck(String task){
		//System.out.println("Entering dbTaskCheck");
		//System.out.println(task);
		//System.out.println(dateCheck);
		//System.out.println(weekDay);
		//task = this.task;
		/*cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;*/
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt0 = myConn.createStatement();
			//Execute a SQL query
			//String sql = "INSERT INTO Professional_profile VALUES (" + cardNumber + ", '" + task + "', " + cap_prof_mon + "," + cap_prof_tue + "," + cap_prof_wed + "," + cap_prof_thu + "," + cap_prof_fri + ")";
			//myStmt.executeUpdate(sql);
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = " + task);
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = '" + task + "' AND date_booked BETWEEN CAST('" + today + "' AS DATE) AND CAST('" + deadline +"' AS DATE);");
			ResultSet myRs0 = myStmt0.executeQuery("SELECT * FROM scheduler_db.professional_profile WHERE task = '" + task + "'");
			while (myRs0.next()) {
				//if(myRs.wasNull()) {
					setCardNumberTaskCheck(myRs0.getInt("card_number"));
					setCapProfMon(myRs0.getFloat("cap_prof_mon"));
					setCapProfTue(myRs0.getFloat("cap_prof_tue"));
					setCapProfWed(myRs0.getFloat("cap_prof_wed"));
					setCapProfThur(myRs0.getFloat("cap_prof_thu"));
					setCapProfFri(myRs0.getFloat("cap_prof_fri"));
						
					//System.out.println(myRs0.getInt("card_number"));
					//System.out.println("Inside dbTaskCheck while loop");
					
					//setCardNumberTaskCheck(99);
					//setNumberOfHoursTaskCheck(99);	
					//System.out.println("Sorry no professional for this task"); 
				//}
			}
			myRs0.close();
			myStmt0.close();
			myConn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Salta la excepcion");
		}
		}
		
	public void dbHoursCheck(String task, String dateCheck, int weekDay){
		//System.out.println("Entering dbHoursCheck");
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt1 = myConn.createStatement();
			ResultSet myRs1 = myStmt1.executeQuery("SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = '" + task + "' AND DATE(date_booked) = '" + dateCheck + "';");
			
			if(myRs1.next() == true) {
			//"this.thisRow"
				while (myRs1.next()) {
					//System.out.println("While loop entering");
					//System.out.println(myRs1.getFloat("hours_booked"));
					//if(myRs1.getFloat("hours_booked") != 0.0) {
						
						if(weekDay == 1) {
							setCardNumberTaskCheck(myRs1.getInt("card_number"));
							setNumberOfHoursTaskCheck(myRs1.getFloat("cap_prof_mon") - myRs1.getFloat("hours_booked"));
						} else if (weekDay == 2) {
							setCardNumberTaskCheck(myRs1.getInt("card_number"));
							setNumberOfHoursTaskCheck(myRs1.getFloat("cap_prof_tue") - myRs1.getFloat("hours_booked"));
						} else if (weekDay == 3) {
							setCardNumberTaskCheck(myRs1.getInt("card_number"));
							setNumberOfHoursTaskCheck(myRs1.getFloat("cap_prof_wed") - myRs1.getFloat("hours_booked"));
						} else if (weekDay == 4) {
							setCardNumberTaskCheck(myRs1.getInt("card_number"));
							setNumberOfHoursTaskCheck(myRs1.getFloat("cap_prof_thu") - myRs1.getFloat("hours_booked"));
						} else {
							setCardNumberTaskCheck(myRs1.getInt("card_number"));
							setNumberOfHoursTaskCheck(myRs1.getFloat("cap_prof_fri") - myRs1.getFloat("hours_booked"));				
						}
					myRs1.close();
					myStmt1.close();
					myConn.close();
					}	
				} else {
					//System.out.println("entering frustrating loop");
					dbTaskCheck(task);
					if(weekDay == 1) {
						//dbTaskCheck(task);
						//setCardNumberTaskCheck(myRs1.getInt("card_number"));
						setNumberOfHoursTaskCheck(capProfMon);
					} else if (weekDay == 2) {
						//setCardNumberTaskCheck(myRs1.getInt("card_number"));
						setNumberOfHoursTaskCheck(capProfTue);
					} else if (weekDay == 3) {
						//setCardNumberTaskCheck(myRs1.getInt("card_number"));
						setNumberOfHoursTaskCheck(capProfWed);
					} else if (weekDay == 4) {
						//setCardNumberTaskCheck(myRs1.getInt("card_number"));
						setNumberOfHoursTaskCheck(capProfThur);
					} else {
						//setCardNumberTaskCheck(myRs1.getInt("card_number"));
						setNumberOfHoursTaskCheck(capProfFri);				
					}	
				}
			
			//System.out.println("End of dbHoursCheck");
			//myRs1.close();
			//myStmt1.close();
			//myConn.close();
			//ResultSet myRs1 = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = '" + task + "' AND DATE(date_booked) = '" + date_check + "';");
			//SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = "Producer" AND DATE(date_booked) = '2010-10-10';
			//Process the result
			/*while (myRs.next()) {
				System.out.println(myRs.getInt("card_number")+", "+ myRs.getFloat("hours_booked"));
			}*/
		}
		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Salta la excepcion");
		}
	}

	public int getCardNumberTaskCheck() {
		return cardNumberTaskCheck;
	}

	public void setCardNumberTaskCheck(int cardNumberTaskCheck) {
		this.cardNumberTaskCheck = cardNumberTaskCheck;
	}

	public float getNumberOfHoursTaskCheck() {
		return numberOfHoursTaskCheck;
	}

	public void setNumberOfHoursTaskCheck(float numberOfHoursTaskCheck) {
		this.numberOfHoursTaskCheck = numberOfHoursTaskCheck;
	}


	public void setCapProfMon(float capProfMon) {
		this.capProfMon = capProfMon;
	}



	public void setCapProfTue(float capProfTue) {
		this.capProfTue = capProfTue;
	}



	public void setCapProfWed(float capProfWed) {
		this.capProfWed = capProfWed;
	}



	public void setCapProfThur(float capProfThur) {
		this.capProfThur = capProfThur;
	}



	public void setCapProfFri(float capProfFri) {
		this.capProfFri = capProfFri;
	}
	
	
	
	
}
