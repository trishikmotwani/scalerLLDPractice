package scaler.casestudies.designpen.pens;

import scaler.casestudies.designpen.Ink;
import scaler.casestudies.designpen.WritingStrategy;

public class FountainPen extends Pen {

	private Ink ink;
	
	FountainPen(WritingStrategy ws) {
		super(ws);
	}
	@Override
	public void write() {
		System.out.println("Writing with Fountain Pen");
		//System.out.println("Writing Smoothly");
	}

}
