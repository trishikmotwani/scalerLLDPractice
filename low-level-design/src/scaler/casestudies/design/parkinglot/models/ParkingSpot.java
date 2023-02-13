package scaler.casestudies.design.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {

	private ParkingSpotStatus status;
	private VehicleTypes vehicleType;
	private int parkingSpotNumber;
	private ParkingSpotTypes spotType;
}
