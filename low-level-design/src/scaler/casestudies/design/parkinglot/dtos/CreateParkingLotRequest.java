package scaler.casestudies.design.parkinglot.dtos;

import java.util.List;
import java.util.Map;

import scaler.casestudies.design.parkinglot.models.Gate;
import scaler.casestudies.design.parkinglot.models.ParkingFloor;
import scaler.casestudies.design.parkinglot.models.ParkingLotLocations;
import scaler.casestudies.design.parkinglot.models.VehicleTypes;

public class CreateParkingLotRequest {

	private int noOfFloors;
	private int noOfGates;
	private String address;
	private ParkingLotLocations parkingLotLocation;
	
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getNoOfGates() {
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ParkingLotLocations getParkingLotLocation() {
		return parkingLotLocation;
	}
	public void setParkingLotLocation(ParkingLotLocations parkingLotLocation) {
		this.parkingLotLocation = parkingLotLocation;
	}
}
