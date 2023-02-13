package scaler.casestudies.designpen.pens;

import scaler.casestudies.designpen.Refill;
import scaler.casestudies.designpen.Refillable;
import scaler.casestudies.designpen.WritingStrategy;

public class GelPen extends Pen implements Refillable {

	Refill refill;
	
	GelPen(WritingStrategy ws) {
		super(ws);
	}
	
	@Override
	public void write() {
		System.out.println("Writing with Gel Pen");
		//System.out.println("Writing Smoothly");
	}
	@Override
	public void refill() {
		System.out.println("Refilling GelPen");
		
	}


}
