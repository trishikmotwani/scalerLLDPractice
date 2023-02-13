package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.ParkingLot;
import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.VehicleTypes;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class ParkingFourWheelerService implements ParkingService {
	ParkingTicketRepository ticketRepo;
	public ParkingFourWheelerService(ParkingTicketRepository ticketRepo) {
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
