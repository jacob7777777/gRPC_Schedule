package Proffesional;

import java.io.IOException;

import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc;
import grpc.CA1.AutomatedSchedulingApp.absenceRequest;
import grpc.CA1.AutomatedSchedulingApp.profile;
import grpc.CA1.AutomatedSchedulingApp.success;
import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc.TimesheetsImplBase;
import grpc.CA1.AutomatedSchedulingApp.success.Builder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//clase 7 minuto 30. Ya hemos dado unary, Server Streaming y ahora salta a client streaming
//puedo cambiar el primero a client streaming o empezar ya con el 2 proto.
public class ProffessionalRequestServer {
	
	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ProffessionalRequestServer ourServer = new ProffessionalRequestServer();
		ourServer.start();
	}
	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new ASAServiceImpl()).build().start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	
	static class ASAServiceImpl extends TimesheetsImplBase{
		@Override
		public void introduceProfile(profile request, StreamObserver<success> responseObserver){
			
			//client message
			int cardNumber = request.getCardNumber();
			System.out.println("CardNumber is: " + cardNumber);
			String task = request.getTask();
			System.out.println("task is: " + task);
			float cap_prof_mon = request.getCapProfMon();
			System.out.println("Capacity profile for Monday is: " + cap_prof_mon);
			float cap_prof_tue = request.getCapProfTue();
			System.out.println("Capacity profile for Tuesday is: " + cap_prof_tue);
			float cap_prof_wed = request.getCapProfWed();
			System.out.println("Capacity profile for Wednesday is: " + cap_prof_wed);
			float cap_prof_thu = request.getCapProfThu();
			System.out.println("Capacity profile for Thursday is: " + cap_prof_thu);
			float cap_prof_fri = request.getCapProfFri();
			System.out.println("Capacity profile for Friday is: " + cap_prof_fri);
			Database.dbConnect dataTransfer = new Database.dbConnect();
			dataTransfer.dbProfileIntegration(cardNumber, task, cap_prof_mon, cap_prof_tue, cap_prof_wed, cap_prof_thu, cap_prof_fri);
			
			//server response
			success.Builder responseBuilder = success.newBuilder();
			responseBuilder.setMessage("Your registration has completed successfully.");//esto tengo que arreglarlo porque aunque no se grabe sale que esta registrarlo
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
		
		@Override
		public void absenceEmptyAgenda(absenceRequest request, StreamObserver<success> responseObserver){
			
			//client message
			int cardNumber = request.getCardNumber();
			System.out.println("CardNumber is: " + cardNumber);
			int jobNumber = request.getJobNumber();
			System.out.println("Job number is: " + jobNumber);
			float hoursBooked = request.getHoursBooked();
			System.out.println("Hour/s booked is/are: " + hoursBooked);
			int dayBooked = request.getDayBooked();
			System.out.println("Day booked is: " + dayBooked);
			int monthBooked = request.getMonthBooked();
			System.out.println("Month booked is: " + monthBooked);
			int yearBooked = request.getYearBooked();
			System.out.println("Year booked is: " + yearBooked);
			//dbConnect dataTransfer;
			//dataTransfer = new dbConnect();
			Database.dbConnect dataTransfer = new Database.dbConnect();
			float alreadyBookedHours = dataTransfer.dbCapacityProfileCheck(cardNumber, jobNumber, dayBooked, monthBooked, yearBooked);
			float basicTime = (float) 7.5;
			float remainingTime = basicTime - alreadyBookedHours;
			//if ((remainingTime - hoursBooked) >= 0){
				//hacer el insert en la base de datos
			//	System.out.println("Your time has successfully being registered.");
			//} else {
			//	System.out.println("Sorry you are exceeding the amount of hours availables for the day.");
			//}
			
			//dataTransfer.dbIntegration(cardNumber, task, cap_prof_mon, cap_prof_tue, cap_prof_wed, cap_prof_thu, cap_prof_fri);
			
			//server response
			success.Builder responseBuilder = success.newBuilder();
			if ((remainingTime - hoursBooked) >= 0){
				//dbConnect dataTransfer2 = new dbConnect();
				dataTransfer.dbAbsenceRegistration(cardNumber, jobNumber, hoursBooked, dayBooked, monthBooked, yearBooked);
				//System.out.println("Your time has successfully being registered.");
				responseBuilder.setMessage("Your time has successfully being registered.");
				responseObserver.onNext(responseBuilder.build());
				responseBuilder.setMessage("Your have registered " + hoursBooked + " hour/s in job " + jobNumber + " for next " + dayBooked + "-" + monthBooked + "-" + yearBooked+".");
				//responseObserver.onNext(responseBuilder.build());
				
			} else {
				//System.out.println("Sorry you are exceeding the amount of hours availables for the day.");
				responseBuilder.setMessage("Sorry you are exceeding the amount of hours availables for the day.");
				responseObserver.onNext(responseBuilder.build());
				responseBuilder.setMessage("You already have " + alreadyBookedHours + " hours already booked in this date.");
				//responseObserver.onNext(responseBuilder.build());
			}
			responseObserver.onNext(responseBuilder.build());
			//responseBuilder.setMessage("Your registration has completed successfully.");
			//responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
	}
}