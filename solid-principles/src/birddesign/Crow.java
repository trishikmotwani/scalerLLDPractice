package birddesign;

public class Crow implements Flyable {

	CommonFlyBehaviour pcdb;
	
	Crow(CommonFlyBehaviour cdb) {
		this.pcdb = cdb;
	}
	public void fly() {
		//System.out.println("Crow is flying"); 
		this.pcdb.peacockCrowFly(); // peacock and crow fly commonly
	}
}
