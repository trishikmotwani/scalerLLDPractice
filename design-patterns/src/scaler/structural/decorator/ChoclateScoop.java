package scaler.structural.decorator;

public class ChoclateScoop implements IceCreamCone {

	IceCreamCone cone;
	public ChoclateScoop() {
	}
	public ChoclateScoop(IceCreamCone cone) {
		this.cone = cone;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cone.getCost() + 20;
	}

	@Override
	public String getConstituents() {
		// TODO Auto-generated method stub
		return cone.getConstituents() + "+ Choclate Scoop";
	}

	
}
