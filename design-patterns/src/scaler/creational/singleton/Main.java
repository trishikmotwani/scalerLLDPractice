package scaler.creational.singleton;
import scaler.creational.singleton.DatabaseConnection;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10000; i++) {
			
			Thread connectionCreator = new Thread(new ConnectionCreator());
			connectionCreator.setName("T" + i);
			connectionCreator.start();
		}
	}

}
