package scaler.structural.adpater;

import scaler.structural.adpater.thridparties.IciciBankApi;

public class IciciBankAdapter implements BankAdapter {

	IciciBankApi bankApi = new IciciBankApi();
	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		bankApi.transfer();
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		bankApi.checkRemainingBalance();
	}

	
}
