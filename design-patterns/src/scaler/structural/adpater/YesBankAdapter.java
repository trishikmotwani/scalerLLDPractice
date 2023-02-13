package scaler.structural.adpater;

import scaler.structural.adpater.thridparties.YesBankApi;

public class YesBankAdapter implements BankAdapter {

	YesBankApi bankApi = new YesBankApi();
	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		bankApi.sendMoney();
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		bankApi.checkBalance();
	}

	
}
