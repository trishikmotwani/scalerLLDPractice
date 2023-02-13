package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.ParkingLot;
import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.VehicleTypes;

public interface ParkingService {

	public ParkingTicket parkVehicle(ParkingLot parkingLot, VehicleTypes vehicleType);
	public ParkingReceipt unparkVehicle(ParkingLot parkingLot, int ticketNo);
}
