package scaler.structural.adpater;

import scaler.structural.adpater.thridparties.IciciBankApi;

public class PhonePe {

	
	// phonepe wants to talk to Third party banks for making transactions
	BankAdapter bankApi;
	public PhonePe(BankAdapter bankApi) {
		this.bankApi = bankApi;
	}
	
	public void sendMoneyAndReturnUpdatedBalance() {
		// TODO Auto-generated method stub
		bankApi.sendMoney();
		bankApi.checkBalance();
		return;
	}
}
