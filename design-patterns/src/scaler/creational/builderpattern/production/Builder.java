//package scaler.creational.builderpattern.production;
//
//import scaler.creational.builderpattern.production.Car.CarTypes;
//
//public class Builder {
//	private String name;
//	private CarTypes carType;
//	private String color;
//	private int tyresize;
//	private int rpm;
//	private int horsepower;
//	private int groundClearance;
//	private int length;
//	private int height;
//	
//	public Builder() {
//		
//	}
//	
//	public Car build() {
//		// validation should go here now 
//		return new Car(this);
//	}
//	public String getName() {
//		return name;
//	}
//	public Builder setName(String name) {
//		this.name = name;
//		return this;
//	}
//	public CarTypes getCarType() {
//		return carType;
//	}
//	public Builder setCarType(CarTypes carType) {
//		this.carType = carType;
//		return this;
//	}
//	public String getColor() {
//		return color;
//	}
//	public Builder setColor(String color) {
//		this.color = color;
//		return this;
//	}
//	public int getTyresize() {
//		return tyresize;
//	}
//	public Builder setTyresize(int tyresize) {
//		this.tyresize = tyresize;
//		return this;
//	}
//	public int getRpm() {
//		return rpm;
//	}
//	public Builder setRpm(int rpm) {
//		this.rpm = rpm;
//		return this;
//	}
//	public int getHorsepower() {
//		return horsepower;
//	}
//	public Builder setHorsepower(int horsepower) {
//		this.horsepower = horsepower;
//		return this;
//	}
//	public int getGroundClearance() {
//		return groundClearance;
//	}
//	public Builder setGroundClearance(int groundClearance) {
//		this.groundClearance = groundClearance;
//		return this;
//	}
//	public int getLength() {
//		return length;
//	}
//	public Builder setLength(int length) {
//		this.length = length;
//		return this;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public Builder setHeight(int height) {
//		this.height = height;
//		return this;
//	}
//	
//	
//}
