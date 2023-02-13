package scaler.behavioral.strategy;

public class GoogleMaps {

	public enum PathModes {
		Car, Bike, Walk
	}
	
	public void findPath(Object src, Object dest, PathModes mode) {
		
//		if(mode == PathModes.Car) {
//			
//		} else if (mode == PathModes.Bike) {
//			
//		} else {
//			
//		}
		// writing above if else will violate SRP, OCP open for addtion, closed for modification
		// ?? now strategy will be to divide these if else into subclasses
		FindPathMode driveMode = FindPathModeFactory.createFindPathMode(mode);
		driveMode.findPath(new Object(), new Object());
	}
}
