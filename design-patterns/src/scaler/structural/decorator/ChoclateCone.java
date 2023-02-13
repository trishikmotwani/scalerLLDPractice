package scaler.structural.decorator;

public class ChoclateCone implements IceCreamCone {

	IceCreamCone cone;
	public ChoclateCone() {
	}
	public ChoclateCone(IceCreamCone cone) {
		this.cone = cone;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cone.getCost() + 10;
	}

	@Override
	public String getConstituents() {
		// TODO Auto-generated method stub
		return cone.getConstituents() + "+ ChoclateCone";
	}

	
}
