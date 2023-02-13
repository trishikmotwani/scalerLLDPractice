package scaler.casestudies.design.parkinglot;

import scaler.casestudies.design.parkinglot.controllers.ParkingLotController;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.models.ParkingLotLocations;
import scaler.casestudies.design.parkinglot.repositories.ParkingLotRepository;
import scaler.casestudies.design.parkinglot.repositories.ParkingTicketRepository;
import scaler.casestudies.design.parkinglot.services.ParkingLotServiceImpl;
import scaler.casestudies.design.parkinglot.services.TicketingServiceImpl;

public class Client {

	public static void main(String args[]) {
		ObjectRegistry.register("parkingTicketRepository", new ParkingTicketRepository());
		ObjectRegistry.register("parkingLotRepository", new ParkingLotRepository());
		
		ObjectRegistry.register("parkingLotService", new ParkingLotServiceImpl());
		ObjectRegistry.register("parkingTicketService", new TicketingServiceImpl());
		
		ObjectRegistry.register("parkingLotController", new ParkingLotController());
		
		ParkingLotController parkingLotController = (ParkingLotController) ObjectRegistry.get("parkingLotController");
		CreateParkingLotRequest createParkingLotRequest = new CreateParkingLotRequest();
		createParkingLotRequest.setNoOfFloors(2);
		createParkingLotRequest.setNoOfGates(2);
		createParkingLotRequest.setParkingLotLocation(ParkingLotLocations.Mall);
		CreateParkingLotResponse createdParkingLot = parkingLotController.createParkingLot(createParkingLotRequest);
		
		
		
		
	}
}
