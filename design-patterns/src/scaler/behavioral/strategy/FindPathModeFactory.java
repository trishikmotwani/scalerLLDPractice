package scaler.behavioral.strategy;

import scaler.behavioral.strategy.GoogleMaps.PathModes;

public class FindPathModeFactory {

	public static FindPathMode createFindPathMode(PathModes mode) {
		
		if(mode == PathModes.Car) {
			return new CarMode();
		}
		return new WalkingMode();
	}
}
