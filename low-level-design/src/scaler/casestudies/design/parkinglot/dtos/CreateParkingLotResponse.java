package scaler.casestudies.design.parkinglot.dtos;

import scaler.casestudies.design.parkinglot.models.ParkingLot;

public class CreateParkingLotResponse extends BaseResponse {

	private ParkingLot parkingLot;

	/**
	 * @return the parkingLot
	 */
	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	/**
	 * @param parkingLot the parkingLot to set
	 */
	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
}
