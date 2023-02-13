package scaler.behavioral.observer;

public class InvoiceGenerator implements Observer {

	public InvoiceGenerator() {
		Flipkart fc = Flipkart.getInstance();
		fc.registerObserver(this);
	}
	@Override
	public void sendNotification() {
		System.out.println("Invoice generator sending email");
		
	}

}
