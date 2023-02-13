package scaler.casestudies.design.parkinglot.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.Ticket;

public class ParkingTicketRepository {
	
	public static long parkingTicketId = 1L;
	public Map<Long, Ticket> parkingTickets = new HashMap<Long, Ticket>();
	
	public Ticket createParkingTicket(Ticket parkingTicket) {
		parkingTickets.put(parkingTicketId, parkingTicket);
		return parkingTicket;
	}
}
