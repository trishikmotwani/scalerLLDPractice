package scaler.creational.builderpattern;

import scaler.creational.builderpattern.Car.CarTypes;

public class Builder {
	private String name;
	private CarTypes carType;
	private String color;
	private int tyresize;
	private int rpm;
	private int horsepower;
	private int groundClearance;
	private int length;
	private int height;
	
	public Builder() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CarTypes getCarType() {
		return carType;
	}
	public void setCarType(CarTypes carType) {
		this.carType = carType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTyresize() {
		return tyresize;
	}
	public void setTyresize(int tyresize) {
		this.tyresize = tyresize;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public int getGroundClearance() {
		return groundClearance;
	}
	public void setGroundClearance(int groundClearance) {
		this.groundClearance = groundClearance;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
