package scaler.structural.decorator;

import javax.swing.text.PlainView;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCreamCone icone = new ChoclateCone(new PlainOrangeCone(new StrawberryScoop(new ChoclateScoop(new VanillaScoop()))));
		System.out.println(icone.getConstituents());
		System.out.println(icone.getCost());
	}

}
