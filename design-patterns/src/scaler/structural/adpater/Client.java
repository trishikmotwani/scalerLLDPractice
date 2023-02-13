package scaler.structural.adpater;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhonePe pp = new PhonePe(new IciciBankAdapter());
		pp.sendMoneyAndReturnUpdatedBalance();
	}

}
