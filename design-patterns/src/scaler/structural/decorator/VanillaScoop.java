package scaler.structural.decorator;

public class VanillaScoop implements IceCreamCone {

	IceCreamCone cone;
	public VanillaScoop() {
	}
	public VanillaScoop(IceCreamCone cone) {
		this.cone = cone;
	}
	@Override
	public double getCost() {
		if(cone == null) {
			return 10;
		}
		return cone.getCost() + 10;
	}

	@Override
	public String getConstituents() {
		if(cone == null) {
			return "Vanilla Scoop";
		}
		return cone.getConstituents() + "+ Vanilla Scoop";
	}

	
}
