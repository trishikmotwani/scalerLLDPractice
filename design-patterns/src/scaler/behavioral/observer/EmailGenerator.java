package scaler.behavioral.observer;

public class EmailGenerator implements Observer {

	public EmailGenerator() {
		Flipkart fc = Flipkart.getInstance();
		fc.registerObserver(this);
	}
	@Override
	public void sendNotification() {
		System.out.println("email generator sending email");
		
	}

}
