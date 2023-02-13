package scaler.creational.builderpattern.production;

import scaler.creational.builderpattern.production.Car.Builder;
import scaler.creational.builderpattern.production.Car.CarTypes;

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
		hondaCityBuilder.setName("HondaCity");
		hondaCityBuilder.setCarType(CarTypes.Sedan);
		hondaCityBuilder.setGroundClearance(100);
		hondaCityBuilder.setHeight(4);
		hondaCityBuilder.setHorsepower(256);
		hondaCityBuilder.setTyresize(11);
		Car hondaCity = new Car(hondaCityBuilder);
		System.out.println("Builded car - Honda City");
		
		// way2 more intuitive and clear, in way1 client needs to know ohh I have to first create builder class , 
		// because student constructor accepts builder then student will be created, whatif student gives a builder
		// but but student object needs to be created after builder is created, so make builder static class
		Builder whiteCretaBuilder = Car.getBuilder();
		whiteCretaBuilder.setName("Creta");
		whiteCretaBuilder.setCarType(CarTypes.Suv);
		whiteCretaBuilder.setGroundClearance(200);
		whiteCretaBuilder.setHeight(4);
		whiteCretaBuilder.setHorsepower(256);
		whiteCretaBuilder.setTyresize(16);
		Car whiteCreta = new Car(whiteCretaBuilder);
		System.out.println("Builded car - White Creta");
		
		// more intuitive is below, builder is now actually building car and returning
		Builder blackCretaBuilder = Car.getBuilder();
		blackCretaBuilder.setName("Creta");
		blackCretaBuilder.setCarType(CarTypes.Suv);
		blackCretaBuilder.setGroundClearance(200);
		blackCretaBuilder.setHeight(4);
		blackCretaBuilder.setHorsepower(256);
		blackCretaBuilder.setTyresize(16);
		blackCretaBuilder.setColor("black");
		Car blackCreta = blackCretaBuilder.build();
		System.out.println("Builded car - Black Creta");
		
		// final improved version
		Car silverCretaBuilder = Car.getBuilder().setName("Creta").setCarType(CarTypes.Sedan).setColor("Silver")
														.setTyresize(20).build();
		System.out.println("Builded car - Silver Creta");
		
	}

}
