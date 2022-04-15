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
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_timesheet WHERE card_number = " + cardNumber + " AND day_booked = " + dayBooked + " AND month_booked = " + monthBooked + " AND year_booked = " + yearBooked );
			//String sql = "INSERT INTO Professional_profile VALUES (" + cardNumber + ", '" + task + "', " + cap_prof_mon + "," + cap_prof_tue + "," + cap_prof_wed + "," + cap_prof_thu + "," + cap_prof_fri + ")";
			//myStmt.executeUpdate(sql);
			//Process the result
			
			while (myRs.next()) {
				totalHours = totalHours + (float) myRs.getFloat("hours_booked");
				//System.out.println((float) myRs.getFloat("hours_booked"));
			}
			
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
			String sql = "INSERT INTO scheduler_db.professional_timesheet (card_number, job_number, hours_booked, day_booked, month_booked, year_booked) VALUES (" + cardNumber + ", " + jobNumber + ", " + hoursBooked + "," + dayBooked + "," + monthBooked + "," + yearBooked + ")"; //WHERE card_number = " + cardNumber;
			myStmt.executeUpdate(sql);
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile");
			//Process the result
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("task")+", "+ myRs.getString("cap_prof_fri"));
			//}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dbTaskCheck(int cardNumber, String task,  float cap_prof_mon, float cap_prof_tue, float cap_prof_wed, float cap_prof_thu, float cap_prof_fri){
		/*cardNumber = this.cardNumber;
		task = this.task;
		capacityProfile = this.capacityProfile;*/
		try {
			//Get a connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scheduler_db", "root", "password");
			//Create statement
			Statement myStmt = myConn.createStatement();
			//Execute a SQL query
			//String sql = "INSERT INTO Professional_profile VALUES (" + cardNumber + ", '" + task + "', " + cap_prof_mon + "," + cap_prof_tue + "," + cap_prof_wed + "," + cap_prof_thu + "," + cap_prof_fri + ")";
			//myStmt.executeUpdate(sql);
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = " + task);
			//Process the result
			while (myRs.next()) {
				System.out.println(myRs.getInt("card_number")+", "+ myRs.getInt("day_booked")+", "+ myRs.getInt("month_booked")+", "+ myRs.getInt("year_booked"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
