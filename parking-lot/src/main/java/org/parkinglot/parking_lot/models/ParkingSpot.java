package org.parkinglot.parking_lot.models;

public class ParkingSpot {

	private int spotSize; // in square feets eg: 25 square feets
	private Vehicle vehicle;
	private ParkingTicket parkingTicket;
	
	public int getSpotSize() {
		return spotSize;
	}
	public void setSpotSize(int spotSize) {
		this.spotSize = spotSize;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}
	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}
	
	
}
