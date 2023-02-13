package scaler.casestudies.designpen.pens;

import scaler.casestudies.designpen.WritingStrategy;

public abstract class Pen {
	private WritingStrategy ws;
	private String brand;
	private String cap;
	private int length;
	public abstract void write();
	
	Pen(WritingStrategy ws) {
		this.ws = ws;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the ws
	 */
	public WritingStrategy getWs() {
		return ws;
	}

	/**
	 * @param ws the ws to set
	 */
	public void setWs(WritingStrategy ws) {
		this.ws = ws;
	}
}
