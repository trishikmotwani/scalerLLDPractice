package scaler.casestudies.designpen.pens;

import scaler.casestudies.designpen.Refill;
import scaler.casestudies.designpen.WritingStrategy;

public class SketchPen extends Pen {
	
	Refill refill;
	
	SketchPen(WritingStrategy ws) {
		super(ws);
	}
	@Override
	public void write() {
		System.out.println("Writing with Sketch Pen");
		// System.out.println("Writing Normally");
	}


}
