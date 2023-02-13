package scaler.structural.decorator.pizza;

public class Tomato implements Pizza {

	Pizza basePizza;
	public Tomato(Pizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return basePizza.getDescription() + " + Tomato";
	}

}
