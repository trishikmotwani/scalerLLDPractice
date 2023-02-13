package practice.adapterdp;

public interface BankApi {
    // RBI gave this api for Banks to implement
	public void deposit(String upi, Double amount);
	public void withdraw(String upi, Double amount);
	public double checkBalance(String upi);
}
