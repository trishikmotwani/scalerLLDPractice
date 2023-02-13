package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.Vehicle;

public interface PricingModel {

	public ParkingReceipt calculateParkingFeesAndReceipt(Vehicle vehicle, int ticketNo);
}
