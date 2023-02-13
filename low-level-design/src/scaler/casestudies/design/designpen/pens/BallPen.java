package scaler.casestudies.designpen.pens;

import scaler.casestudies.designpen.Refill;
import scaler.casestudies.designpen.Refillable;
import scaler.casestudies.designpen.WritingStrategy;

public class BallPen extends Pen implements Refillable {

	Refill refill;
	
	public BallPen(WritingStrategy ws) {
		super(ws);
	}
	@Override
	public void write() {
		System.out.println("Writing with Ball Pen");
		// System.out.println("Writing Normally");
		this.getWs().writeInAStrategy();
	}
	@Override
	public void refill() {
		System.out.println("Refilling BallPen");
		
	}

}
