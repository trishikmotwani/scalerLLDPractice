package org.parkinglot.parking_lot.models;

import java.time.LocalDateTime;

public class ParkingReceipt {
	private int receiptNum;
	private LocalDateTime entryDateTime;
	private LocalDateTime exitDateTime;
	private int fees;
	
	public ParkingReceipt(int receiptNum, LocalDateTime entryDateTime, LocalDateTime exitDateTime, int fees) {
		this.receiptNum = receiptNum;
		this.entryDateTime = entryDateTime;
		this.exitDateTime = exitDateTime;
		this.fees = fees;
	}

	public int getReceiptNum() {
		return receiptNum;
	}

	public void setReceiptNum(int receiptNum) {
		this.receiptNum = receiptNum;
	}

	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}

	public void setEntryDateTime(LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}

	public LocalDateTime getExitDateTime() {
		return exitDateTime;
	}

	public void setExitDateTime(LocalDateTime exitDateTime) {
		this.exitDateTime = exitDateTime;
	}

	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
