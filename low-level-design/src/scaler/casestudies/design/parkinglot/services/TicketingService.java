package scaler.casestudies.design.parkinglot.services;

import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.dtos.GenerateParkingTicketRequest;
import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.Ticket;
import scaler.casestudies.design.parkinglot.models.Vehicle;

public interface TicketingService {

	public Ticket generateParkingTicket(Long GateId, Long parkingLotId, Vehicle vehicle);
}
