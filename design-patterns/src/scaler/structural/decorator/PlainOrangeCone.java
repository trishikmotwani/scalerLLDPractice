package scaler.structural.decorator;

public class PlainOrangeCone implements IceCreamCone {

	IceCreamCone cone;
	public PlainOrangeCone() {
	}
	public PlainOrangeCone(IceCreamCone cone) {
		this.cone = cone;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cone.getCost() + 5;
	}

	@Override
	public String getConstituents() {
		// TODO Auto-generated method stub
		return cone.getConstituents() + " + PlainOrangeCone";
	}

	
}
