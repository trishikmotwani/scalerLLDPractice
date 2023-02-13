package scaler.casestudies.designpen;

import scaler.casestudies.designpen.pens.BallPen;
import scaler.casestudies.designpen.pens.Pen;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen celloGripper = new BallPen(new NormalWritingStrategy());
		
		celloGripper.write();
	}

}
