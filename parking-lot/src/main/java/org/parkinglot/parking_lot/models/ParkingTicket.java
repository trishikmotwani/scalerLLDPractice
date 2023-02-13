package org.parkinglot.parking_lot.models;

import java.time.LocalDateTime;

public class ParkingTicket {
	private int ticketNum;
	private int spotNo;
	private LocalDateTime entryDateTime;
	
	public ParkingTicket(int ticketNum, LocalDateTime entryDateTime, int spotNo) {
		this.ticketNum = ticketNum;
		this.spotNo = spotNo;
		this.entryDateTime = entryDateTime;
	}
	public int getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	public int getSpotNo() {
		return spotNo;
	}
	public void setSpotNo(int spotNo) {
		this.spotNo = spotNo;
	}
	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}
	public void setEntryDateTime(LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}
	
	
}
