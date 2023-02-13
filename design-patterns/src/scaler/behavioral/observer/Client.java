package scaler.behavioral.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart fc = Flipkart.getInstance();
		// if we have a dependency injection framework like spring boot where these observers are created at run time
		// then we can direct register them as observers during app initialization
		Observer eg = new EmailGenerator();
		Observer ig = new InvoiceGenerator();
		Observer sg = new ShipmentGenerator();
		
		fc.orderPlaced();
	}

}
