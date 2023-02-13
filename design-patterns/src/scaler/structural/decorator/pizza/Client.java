package scaler.structural.decorator.pizza;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
		System.out.println(pizza.getCost());
		System.out.println(pizza.getDescription());
	}

}
