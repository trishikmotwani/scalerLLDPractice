package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.models.VehicleCategories;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class ParkingServiceFactory {

	public static ParkingService createParkingService(VehicleCategories vehicleCategory) {
		if(vehicleCategory == VehicleCategories.TwoWheeler) {
			return new ParkingTwoWheelerService(ParkingTicketRepository.createInstance());
		} else if(vehicleCategory == VehicleCategories.FourWheeler) {
			return new ParkingFourWheelerService(ParkingTicketRepository.createInstance());
		} else if(vehicleCategory == VehicleCategories.HeavyVehicle) {
			return new ParkingHeavyVehicleService(ParkingTicketRepository.createInstance());
		} else {
			throw new Error("Parking Service is not available for input vehicle");
		}
	}
}
