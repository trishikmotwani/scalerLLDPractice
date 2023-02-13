package practice.factorymethoddp;

public abstract class LogisticsCreator {
	
	abstract Transporter getTransporter();

	
	public void deliverMaal(String transportVia) {
		Transporter porter = getTransporter();
		porter.transport();
	}
}
