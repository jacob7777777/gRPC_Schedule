package professional;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ProffessionalRequestServer {
	
	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ProffessionalRequestServer ourServer = new ProffessionalRequestServer(); // Instantiate the server
		ourServer.start();
	}
	
	// prepare for receive and send requests
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		server = ServerBuilder
				.forPort(port)
				.addService(new proffessionalSchedule())
				.build()
				.start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	
	static class proffessionalSchedule extends professional.TimesheetsGrpc.TimesheetsImplBase{
		
		@Override
		public void introduceProfile(profile request, StreamObserver<success> responseObserver){
			
			// client message
			int cardNumber = request.getCardNumber();
			String task = request.getTask();
			float capProfMon = request.getCapProfMon();
			float capProfTue = request.getCapProfTue();
			float capProfWed = request.getCapProfWed();
			float capProfThu = request.getCapProfThu();
			float capProfFri = request.getCapProfFri();
			
			// instantiating database connection and transfering information
			service.manager.dbConnect dataTransfer = new service.manager.dbConnect();
			dataTransfer.dbProfileIntegration(cardNumber, task, capProfMon, capProfTue, capProfWed, capProfThu, capProfFri);
			
			// server response
			success.Builder responseBuilder = success.newBuilder();
			responseBuilder.setMessage("Your registration has completed successfully.");
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
		
		@Override
		public void absenceEmptyAgenda(absenceRequest request, StreamObserver<success> responseObserver){
			
			// client message
			int cardNumber1 = request.getCardNumber1();
			int jobNumber = request.getJobNumber();
			float hoursBooked = request.getHoursBooked();
			int dayBooked = request.getDayBooked();
			int monthBooked = request.getMonthBooked();
			int yearBooked = request.getYearBooked();

			// database connection
			service.manager.dbConnect dataTransfer = new service.manager.dbConnect();
			
			success.Builder responseBuilder = success.newBuilder();
			
			if (cardNumber1 != 0) {
			float alreadyBookedHours = dataTransfer.dbCapacityProfileCheck(cardNumber1, jobNumber, dayBooked, monthBooked, yearBooked);
			float basicTime = (float) 7.5;
			float remainingTime = basicTime - alreadyBookedHours;
			//server response
				if ((remainingTime - hoursBooked) >= 0){
					dataTransfer.dbAbsenceRegistration(cardNumber1, jobNumber, hoursBooked, dayBooked, monthBooked, yearBooked);
					responseBuilder.setMessage("Your time has successfully being registered.");
					responseObserver.onNext(responseBuilder.build());
					responseBuilder.setMessage("Your have registered " + hoursBooked + " hour/s in job " + jobNumber + " for next " + dayBooked + "-" + monthBooked + "-" + yearBooked+".");
					
				} else {
					responseBuilder.setMessage("Sorry you are exceeding the amount of hours availables for the day.");
					responseObserver.onNext(responseBuilder.build());
					responseBuilder.setMessage("You already have " + alreadyBookedHours + " hours already booked in this date.");
				}
			} else {
				responseBuilder.setMessage("Sorry your time can't be registered.");
			}
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
	}
}