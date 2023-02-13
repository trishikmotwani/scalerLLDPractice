package scaler.behavioral.observer;

public class ShipmentGenerator implements Observer {

	public ShipmentGenerator() {
		Flipkart fc = Flipkart.getInstance();
		fc.registerObserver(this);
	}
	
	@Override
	public void sendNotification() {
		System.out.println("shipment generator sending email");
		
	}

}
