package scaler.structural.decorator.pizza;

public class Cheese implements Pizza {

	Pizza basePizza;
	public Cheese(Pizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 80;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return basePizza.getDescription() + " + Cheese";
	}

}
