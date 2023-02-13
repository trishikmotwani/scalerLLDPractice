package scaler.casestudies.design.parkinglot.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectricParkingSpot extends BaseModel  { // remove extends ParkingSpot
	
	private Meter meter;
	private ParkingLot parkingLot; // parkng lot is added to convert is a relation to has a for schema design
	
}
