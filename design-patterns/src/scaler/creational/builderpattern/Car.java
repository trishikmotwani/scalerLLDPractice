package scaler.creational.builderpattern;

public class Car {
	enum CarTypes {
		Sports, Sedan, Hatchback, Suv
	}
	private String name;
	private CarTypes carType;
	private String color;
	private int tyresize;
	private int rpm;
	private int horsepower;
	private int groundClearance;
	private int length;
	private int height;
	
	// now you will need to create soo many fields in constructor to initialize the car, not feasible and prone to errors
	// dont you think this is more prone to client errors, eg: bymistake rpm and horsepower are exchanged by clients mistake in passing parameters
//	public Car(String name, CarTypes carType, String color, int tyresize, int rpm, int horsepower, int groundClearance,
//			int length, int height) {
//	
//	}
	// other scenario below, if you want you want a car with less config, you woll need to override multiple constructors
	// and what if signature is name , it will lead to compile time error eg: though parameters differ but signature is same
//	public Car(String name, CarTypes carType, int tyresize, int rpm) {
//		
//	}
//	public Car(String name, CarTypes carType, int tyresize, int horsepower) {
//			
//	}
	
	// telescoping constructors
	public Car(Builder carBuilder) {
		this.name = carBuilder.getName();
		this.carType = carBuilder.getCarType();
		if(carBuilder.getTyresize() < 10) {
			throw new IllegalArgumentException();
		}
		this.tyresize = carBuilder.getTyresize();
	}
	public Car(String name) {
		this.name = name;
	}
	public Car(String name, CarTypes carType) {
		this(name);
		this.carType = carType;
	}
	// one more scenario, what if you want to validate some fields before object is created , eg: tiresize should always be > 10 incehs
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
