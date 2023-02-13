package birddesign;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DancingBird penguin = new Penguin(); // Abstract class DancingBird extends Bird one who can dance and eat
//		penguin.eat();
//		penguin.dance();
//		
//		FlyingBird crow = new Crow(); // Abstract class FlyingBird extends Bird one who can fly and eat
//		crow.eat();
//		crow.fly();
//		
//		Bird abnormalBird = new AbnormalBird(); // Extends only Bird can only eat
//		abnormalBird.eat();
		
		Dancer penguin = new Penguin(); // Abstract class DancingBird extends Bird one who can dance and eat
		penguin.dance();
		
		Flyable crow = new Crow(new PeacockCrowFlyBehaviour()); // Abstract class FlyingBird extends Bird one who can fly and eat
		crow.fly();
		
		
		Bird abnormalBird = new AbnormalBird(); // Extends only Bird can only eat
		abnormalBird.eat();
		
		// peacock is one can dance and fly both 
		Peacock peacock = new Peacock(new PeacockCrowFlyBehaviour());
		peacock.dance();
		peacock.fly();
	}

}
