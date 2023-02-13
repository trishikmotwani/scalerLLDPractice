package scaler.casestudies.design.parkinglot.dtos;

import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.Ticket;

public class GenerateParkingTicketResponse extends BaseResponse {

	private Ticket parkingTicket;

	/**
	 * @return the parkingTicket
	 */
	public Ticket getParkingTicket() {
		return parkingTicket;
	}

	/**
	 * @param parkingTicket the parkingTicket to set
	 */
	public void setParkingTicket(Ticket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}

	
}
