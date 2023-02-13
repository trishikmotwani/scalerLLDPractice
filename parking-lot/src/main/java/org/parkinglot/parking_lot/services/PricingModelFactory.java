package org.parkinglot.parking_lot.services;

import org.parkinglot.parking_lot.models.ParkingLotLocations;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class PricingModelFactory {

	public static PricingModel createPricingModel(ParkingLotLocations parkingLotLocation) {
		
		if(parkingLotLocation == ParkingLotLocations.Mall) {
			return new MallPricingModel(ParkingTicketRepository.createInstance());
		} else if(parkingLotLocation == ParkingLotLocations.Airport) {
			return new AirportPricingModel(ParkingTicketRepository.createInstance());
		} else if(parkingLotLocation == ParkingLotLocations.Stadium) {
			return new StadiumPricingModel(ParkingTicketRepository.createInstance());
		} else {
			throw new Error("Invalid Parking Lot Location");
		}
	}
}
