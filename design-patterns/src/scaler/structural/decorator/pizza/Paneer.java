package scaler.structural.decorator.pizza;

public class Paneer implements Pizza {

	Pizza basePizza;
	public Paneer(Pizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 60;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return basePizza.getDescription() + " + Paneer";
	}

}
