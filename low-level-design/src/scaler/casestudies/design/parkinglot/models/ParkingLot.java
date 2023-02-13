package scaler.casestudies.design.parkinglot.models;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLot {

	private List<ParkingFloor> parkingFloors;
	private List<Gate> gates;
	private String address;
	private ParkingLotLocations parkingLotLocation;
	private Map<VehicleTypes, Integer> basePrices;
	private Map<VehicleTypes, Integer> multiplierPrices;
	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}
	
}
