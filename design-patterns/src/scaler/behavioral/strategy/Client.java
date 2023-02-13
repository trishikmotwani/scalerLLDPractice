package scaler.behavioral.strategy;

import scaler.behavioral.strategy.GoogleMaps.PathModes;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GoogleMaps maps = new GoogleMaps();
		maps.findPath(new Object(), new Object(), PathModes.Bike);
	}

}
