package ProjectManager;


import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.stream.Stream;

import Proffesional.ProffessionalRequestServer;
import ProjectManager.FindingWorkersGrpc.FindingWorkersImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



public class ProjectManagerServer {
	
	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ProjectManagerServer ourServer = new ProjectManagerServer();
		ourServer.start();
	}
	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new projectManagerSchedule()).build().start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	

	private static int calendar(int year, int month, int day) {
	        //LocalDate localDate = LocalDate.of(2022, 4, 10);
	        LocalDate localDate = LocalDate.of(year, month, day);
	        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	        //System.out.println("Day of week in number:"+dayOfWeek.getValue());
	        //System.out.println("Day of week in text:"+dayOfWeek.toString()); 
	        return dayOfWeek.getValue();
	}
	
	//esto esta copiado del otro lado, tengo que adaptarlo
	
	static class projectManagerSchedule extends FindingWorkersImplBase{
		@Override
		public void taskFinding(TaskSpecifications request, StreamObserver<TaskMatch> responseObserver){
			
			//client message
			try {
			//String projectNumber = request.getProjectNumber();
			//System.out.println("Project Number is: " + projectNumber);
			String task = request.getTask();
			//System.out.println(task);
			//System.out.println("Task is: " + task);
			float numberHours = request.getNumberHours();
			//System.out.println("Number of hours required are: " + numberHours);
			int startDay = (int) request.getStartDay();
			int startMonth = (int) request.getStartMonth();
			int startYear = (int) request.getStartYear();
			//LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
			int milestoneDay = (int) request.getMilestoneDay();
			int milestoneMonth = (int) request.getMilestoneMonth();
			int milestoneYear = (int) request.getMilestoneYear();
			//LocalDate deadline = LocalDate.of(milestoneYear, milestoneMonth, milestoneDay);
			//System.out.println("The milestone date is: " + dayMilestone + "-" + monthMilestone + "-" + yearMilestone);
			//LocalDate today = LocalDate.now();
			LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
			LocalDate deadline = LocalDate.of(milestoneYear, milestoneMonth, milestoneDay);
			LocalDate today = LocalDate.now();
			
			//server response
			TaskMatch.Builder responseBuilder = TaskMatch.newBuilder();
				if (startDate.isAfter(deadline)){
					responseBuilder.setCardNumber("Please enter valid period.");
				} else if (today.isAfter(startDate)){
					responseBuilder.setCardNumber("Today is " + today + " but start date is " + startDate + ".");
				} else {
					Stream<LocalDate> projectPeriod = startDate.datesUntil(deadline);//I receive a Stream of all the dates between today and the deadline
					Object[] projectPeriodDates = projectPeriod.toArray();
					float numberHoursCounter = numberHours;
					//while (numberHoursCounter > 0) {
					for (int i = 0; i < projectPeriodDates.length; i++) {
						LocalDate projectPeriodDate = (LocalDate) projectPeriodDates[i];
						//System.out.print("fufifi");
						System.out.print("For " + projectPeriodDate);
						//System.out.println("Ms1 Employee with card number " + dataTransfer.getCardNumberTaskCheck() + " has " + dataTransfer.getNumberOfHoursTaskCheck() + " hours availables on the " + projectPeriodDate);
						int day = projectPeriodDate.getDayOfMonth();//to change from LocalDate data type to int values and know what day of the week it is.
						int month = projectPeriodDate.getMonthValue();
						int year = projectPeriodDate.getYear();
						int weekDay = calendar(year, month, day);
						System.out.println(" week day is " + weekDay);
						//Database.dbConnect dataTransfer = new Database.dbConnect();
						//dataTransfer.dbTaskCheck(task);
						//dataTransfer.dbHoursCheck(task, String.valueOf(projectPeriodDate), weekDay);
						if(weekDay == 1 || weekDay == 2 || weekDay == 3 || weekDay == 4 || weekDay == 5) {
							
								Database.dbConnect dataTransfer = new Database.dbConnect();
								dataTransfer.dbTaskCheck(task);
								//System.out.println("Back to server while loop");
								//System.out.println(task);
								//System.out.println(dataTransfer.getCardNumberTaskCheck());
								//System.out.println(dataTransfer.getNumberOfHoursTaskCheck());
								//System.out.println(projectPeriodDates[i]);
								//System.out.println(weekDay);
								//System.out.println(dataTransfer.task);
								if(dataTransfer.getCardNumberTaskCheck() == 0) {
									numberHoursCounter = 0;
									responseBuilder.setCardNumber("Sorry no professional for this task");
									System.out.println("Task not found");
									responseObserver.onNext(responseBuilder.build());
									//break;
									i = projectPeriodDates.length-1;
									//break;
								} else {
									//System.out.println("Entering else loop");
									dataTransfer.dbHoursCheck(task, String.valueOf(projectPeriodDate), weekDay);
									//numberHoursCounter = numberHoursCounter - dataTransfer.getNumberOfHoursTaskCheck();
									//System.out.println(numberHoursCounter);
									//System.out.println("Back to else loop");
									//System.out.println(dataTransfer.getNumberOfHoursTaskCheck());
									responseBuilder.setCardNumber("Employee with card number " + dataTransfer.getCardNumberTaskCheck() + " has " + dataTransfer.getNumberOfHoursTaskCheck() + " hours availables. ");
									System.out.println("Employee with card number " + dataTransfer.getCardNumberTaskCheck() + " has " + dataTransfer.getNumberOfHoursTaskCheck() + " hours availables on the " + projectPeriodDate);
									responseObserver.onNext(responseBuilder.build());
									numberHoursCounter = numberHoursCounter - dataTransfer.getNumberOfHoursTaskCheck();
									boolean taskCovered = numberHoursCounter < 0; 
									System.out.println("So far enough capacity to cover the task: " + taskCovered);
								}
							//}
							
						} 
						
						
						// System.out.println(projectPeriodDates[i]);
						//System.out.println(day);
						//System.out.println(month);
						// System.out.println(year);
						// System.out.println(weekDay);
						responseBuilder.setCardNumber("Have a good day");
					}
					//int weekDay = calendar(startYear, startMonth, startDay);
					//Database.dbConnect dataTransfer = new Database.dbConnect();
					//responseBuilder.setCardNumber("Day is: "+ weekDay);
				}
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
				
			} catch (Exception e) {
				TaskMatch.Builder responseBuilder = TaskMatch.newBuilder();
				responseBuilder.setCardNumber("Please enter valid values.");
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
			}
			
			/*
			//server response
			TaskMatch.Builder responseBuilder = TaskMatch.newBuilder();
			if ((startMonth > 12) || (milestoneMonth > 12) || 
					((startMonth == 2) && (startDay > 29)) || ((milestoneMonth == 2) && (milestoneDay > 29)) || 
					(((startMonth == 4 ) || (startMonth == 6) || (startMonth == 9) || (startMonth == 11)) && (startDay > 30))||
					(((milestoneMonth == 4 ) || (milestoneMonth == 6) || (milestoneMonth == 9) || (milestoneMonth == 11)) && (milestoneMonth > 30))||
					(((startMonth == 1 ) || (startMonth == 3) || (startMonth == 5) || (startMonth == 7) || (startMonth == 8) || (startMonth == 10) || (startMonth == 12)) && (startDay > 31))||
					(((milestoneMonth == 1 ) || (milestoneMonth == 3) || (milestoneMonth == 5) || (milestoneMonth == 7) || (milestoneMonth == 8) || (milestoneMonth == 10) || (milestoneMonth == 12)) && (milestoneMonth > 31))){
				responseBuilder.setCardNumber("Please enter valid dates.");
			}
			
		
			if (startDate.isAfter(deadline) || today.isAfter(startDate)){
				responseBuilder.setCardNumber("Please enter valid period.");
			} else {
				Stream<LocalDate> projectPeriod = startDate.datesUntil(deadline);//I receive a Stream of all the dates between today and the deadline
				Object[] projectPeriodDates = projectPeriod.toArray();
				for (int i = 0; i < projectPeriodDates.length; i++) {
					System.out.println(projectPeriodDates[i]);
				}
				int weekDay = calendar(startYear, startMonth, startDay);
				Database.dbConnect dataTransfer = new Database.dbConnect();
				responseBuilder.setCardNumber("Day is: "+ weekDay);
			}
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
			}
			*/
			
			
			
			
			
			
			//dbConnect dataTransfer = new dbConnect();
			//dataTransfer.dbProfileIntegration(cardNumber, task, cap_prof_mon, cap_prof_tue, cap_prof_wed, cap_prof_thu, cap_prof_fri);
			//Database.dbConnect dataTransfer = new Database.dbConnect();
			
			/*-------------------------------
			//server response
			TaskMatch.Builder responseBuilder = TaskMatch.newBuilder();
			if (weekDay == 7 | weekDay == 6) {
				responseBuilder.setCardNumber("Sorry set a deadline in a working day");
			} else {
				Database.dbConnect dataTransfer = new Database.dbConnect();
				//LocalDate today = LocalDate.now();//esto se puede modificar --> especificar esto en el stream de salida
				//LocalDate deadline = LocalDate.of(yearMilestone, monthMilestone, dayMilestone);
				Stream<LocalDate> projectPeriod = today.datesUntil(deadline);//I receive a Stream of all the dates between today and the deadline
				Object[] projectPeriodDates = projectPeriod.toArray();
				//String[] projectPeriodDates = projectPeriod.toString();
				for (int i = 0; i < projectPeriodDates.length; i++) {
					System.out.println(projectPeriodDates[i]);
				}
				System.out.println("-----------");
				System.out.println(projectPeriodDates[0]);
				System.out.println(projectPeriodDates[1]);
				System.out.println(projectPeriodDates[2]);
				
				System.out.println(projectPeriodDates);
				
				//String test = Arrays.toString(projectPeriodDates);
				//System.out.println(test);
				//System.out.println(Arrays.toString(projectPeriodDates));
				//System.out.println(Arrays.toDate(test));
				//System.out.println(Arrays(test[1]));
				//projectPeriod.forEach(System.out::println);//puedo hacer un Stream de un Stream
				
				
				//test[] stringArray = projectPeriod.toArray(test[]::new)//https://stackoverflow.com/questions/23079003/how-to-convert-a-java-8-stream-to-an-array
				//System.out.println(stringArray);
				
				
				
				//String []test = (String)projectPeriod;
				//projectPeriod.replace("-", ",");
				//java.time.LocalDate.now();
				
				responseBuilder.setCardNumber("Day is: "+ weekDay);
			}*/
			//esto tengo que arreglarlo porque aunque no se grabe sale que esta registrarlo
			
		}
		
	}}

