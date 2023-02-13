package scaler.casestudies.design.parkinglot.services;

import scaler.casestudies.design.parkinglot.ObjectRegistry;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.dtos.GenerateParkingTicketRequest;
import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.ParkingSpot;
import scaler.casestudies.design.parkinglot.models.ParkingSpotTypes;
import scaler.casestudies.design.parkinglot.models.Ticket;
import scaler.casestudies.design.parkinglot.models.Vehicle;
import scaler.casestudies.design.parkinglot.repositories.ParkingLotRepository;
import scaler.casestudies.design.parkinglot.repositories.ParkingTicketRepository;

public class TicketingServiceImpl implements TicketingService {
	private ParkingLotRepository parkingLotRepo;
	private ParkingTicketRepository parkingTicketRepo;
	private SpotAssignmentService spotAssignmentService;
	
	public TicketingServiceImpl() {
		parkingLotRepo = (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository");
		parkingTicketRepo = (ParkingTicketRepository) ObjectRegistry.get("parkingTicketRepository");
		spotAssignmentService = (SpotAssignmentService) ObjectRegistry.get("spotAssignmentService");
	}
	
	@Override
	public Ticket generateParkingTicket(Long GateId, Long parkingLotId, Vehicle vehicle) {
		
		ParkingLot parkingLot = parkingLotRepo.getParkingLotById(parkingLotId);
		
		ParkingSpot spot = spotAssignmentService.assignParkingSpotToVehicle(parkingLot, ParkingSpotTypes.TWO_WHEELER);
		
		Ticket ticket = new Ticket();
		ticket.setParkingSpot(spot);
		ticket.setEntryGate(GateRep);
		return null;
	}
}
