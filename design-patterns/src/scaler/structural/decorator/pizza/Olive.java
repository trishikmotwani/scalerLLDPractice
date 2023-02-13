package scaler.structural.decorator.pizza;

public class Olive implements Pizza {

	Pizza basePizza;
	public Olive(Pizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return basePizza.getDescription() + "+ Olive";
	}

}
