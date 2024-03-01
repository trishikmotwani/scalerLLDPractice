package scaler.creational.builderpattern;

import scaler.creational.builderpattern.Car.CarTypes;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // in this naive example, we cannot check validations before creating object
//		Car hondaCity = new Car();
//		hondaCity.setCarType(CarTypes.Sedan);
//		hondaCity.setGroundClearance(100);
//		hondaCity.setHeight(4);
//		hondaCity.setHorsepower(256);
		
		// way1
		Builder hondaCityBuilder = new Builder();
		hondaCityBuilder.setCarType(CarTypes.Sedan);
		hondaCityBuilder.setGroundClearance(100);
		hondaCityBuilder.setHeight(4);
		hondaCityBuilder.setHorsepower(256);
		hondaCityBuilder.setTyresize(9);
		Car hondaCity = new Car(hondaCityBuilder);
		
		// way2 more intuitive and clear
//		Car silverCretaBuilder = Car.getBuilder().setName("Creta").s
//				.setTyresize(20).build();
	}

}
