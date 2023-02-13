package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.ParkingLot;
import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.VehicleTypes;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class ParkingHeavyVehicleService implements ParkingService {
	ParkingTicketRepository ticketRepo;
	public ParkingHeavyVehicleService(ParkingTicketRepository ticketRepo) {
		this.ticketRepo = ticketRepo;
	}
	
	public ParkingTicket parkVehicle(ParkingLot parkingLot, VehicleTypes vehicleType) {
		// TODO Auto-generated method stub
		return null;
	}

	public ParkingReceipt unparkVehicle(ParkingLot parkingLot, int ticketNo) {
		// TODO Auto-generated method stub
		return null;
	}


}
