package scaler.casestudies.design.parkinglot.services;

import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.ParkingSpot;
import scaler.casestudies.design.parkinglot.models.ParkingSpotTypes;

public interface SpotAssignmentService {

	public ParkingSpot assignParkingSpotToVehicle(ParkingLot parkingLot, ParkingSpotTypes spotType);
}
