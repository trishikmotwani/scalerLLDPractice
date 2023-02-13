package scaler.creational.singleton;

public class ConnectionCreator implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
		System.out.println("connection object creted from thread" + dbc.hashCode() + ", " + Thread.currentThread().getName());
		
	}

}
