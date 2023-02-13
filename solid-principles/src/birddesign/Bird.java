package birddesign;

abstract public class Bird {
	public enum BirdTypes {
		Sparrow, Crow, Penguin
	}
	BirdTypes type;
	int noOfWings;
	String color;
	float weight;
	
//  void fly();
//		// SRP  -> single responsibility means only one reason to change the class/ function / ..
//		if(type == BirdTypes.Crow) {
//			System.out.print("Crow is flying");
//		} else if(type == BirdTypes.Penguin) {
//			throw new Error("Penguin cannot fly");
//		}
		
	
	void eat() {
		System.out.println("Bird is eating");
	}
//	void dance();
//		if(type == BirdTypes.Crow) {
//		throw new Error("Crow cannot dance");
//		} else if(type == BirdTypes.Penguin) {
//			System.out.print("Crow is dancing");

//		}
	
}
