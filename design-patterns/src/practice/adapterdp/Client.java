package practice.adapterdp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String senderUpi = "trishik@icici";
		String receiverUpi = "chandni@hdfc";
		PhonePe pp = new PhonePe();
		pp.transferMoney(senderUpi, receiverUpi, 1000.00);
		
	}

}
