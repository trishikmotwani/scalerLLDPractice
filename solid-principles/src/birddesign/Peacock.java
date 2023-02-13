package birddesign;

public class Peacock implements Flyable, Dancer {
	
	CommonFlyBehaviour pcdb; 
	
	Peacock(CommonFlyBehaviour cfb) {
		this.pcdb = cfb;
	}
	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Peacock is Dancing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		//System.out.println("Peacock is Flying");
		this.pcdb.peacockCrowFly(); // peacock and crow fly similarly common code
	}

}
