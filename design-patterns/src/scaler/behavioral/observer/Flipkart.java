package scaler.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
	// flipkart is publisher 
	static Flipkart fc;
	List<Observer> observersList = new ArrayList<Observer>();
	public void orderPlaced() {
		
		// after order is placed flipkart want to notify various subsystems
//		emailGenerator.sendEmail();
//		shipmentGenerator.sendShipmentDetails();
//		invoiceGenerator.createInvoice();
		// above code is violating SRP, OCP 
		// solution is create seperate class for each observer
//		this.registerObserver(new EmailGenerator());
//		this.registerObserver(new InvoiceGenerator());
//		this.registerObserver(new ShipmentGenerator());
		for(Observer obs: observersList) {
			obs.sendNotification();
		}
		
	}
	public static Flipkart getInstance() {
		if(fc == null) {
			fc = new Flipkart();
		}
		return fc;
	}
	
	public void registerObserver(Observer observer) {
		observersList.add(observer);
	}
	public void unregisterObserver(Observer observer) {
		observersList.remove(observer);
	}
}
