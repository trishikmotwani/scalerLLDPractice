package practice.adapterdp;

public class PhonePe {

	BankApi api = new IciciApi();
	
	public void transferMoney(String senderUpi, String receiverUpi, Double amount) {
		
		double balance = api.checkBalance(senderUpi);
		api.withdraw(senderUpi, amount);
		api.deposit(receiverUpi, amount);
		
	}
}
