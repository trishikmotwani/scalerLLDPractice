package org.parkinglot.parking_lot.repositories;

import java.util.HashMap;
import java.util.Map;

import org.parkinglot.parking_lot.models.ParkingTicket;

public class ParkingTicketRepository {
	private static ParkingTicketRepository ticketRepo;
	private int lastTicketNumber = 0;
	private int lastReceiptNumber = 0;
	private Map<Integer,ParkingTicket> parkingTable;
	
	private ParkingTicketRepository() {
		parkingTable = new HashMap<Integer, ParkingTicket>();
	}
	public static ParkingTicketRepository createInstance() {
		if(ticketRepo == null) {
			ticketRepo = new ParkingTicketRepository();
		}
		return ticketRepo;
	}
	
	public void saveTicket(ParkingTicket ticket) {
		parkingTable.put(ticket.getTicketNum(), ticket);
	}
	public ParkingTicket getTicket(int ticketNo) {
		return parkingTable.get(ticketNo);
	}
	/**
	 * @return the lastTicketNumber
	 */
	public int getLastTicketNumber() {
		return lastTicketNumber;
	}
	/**
	 * @param lastTicketNumber the lastTicketNumber to set
	 */
	public void setLastTicketNumber(int lastTicketNumber) {
		this.lastTicketNumber = lastTicketNumber;
	}
	/**
	 * @return the lastReceiptNumber
	 */
	public int getLastReceiptNumber() {
		return lastReceiptNumber;
	}
	/**
	 * @param lastReceiptNumber the lastReceiptNumber to set
	 */
	public void setLastReceiptNumber(int lastReceiptNumber) {
		this.lastReceiptNumber = lastReceiptNumber;
	}
}
