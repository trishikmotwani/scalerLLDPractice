package scaler.structural.decorator;

public class StrawberryScoop implements IceCreamCone {

	IceCreamCone cone;
	public StrawberryScoop() {
	}
	public StrawberryScoop(IceCreamCone cone) {
		this.cone = cone;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cone.getCost() + 15;
	}

	@Override
	public String getConstituents() {
		// TODO Auto-generated method stub
		return cone.getConstituents() + "+ Strawberry Scoop";
	}

	
}
