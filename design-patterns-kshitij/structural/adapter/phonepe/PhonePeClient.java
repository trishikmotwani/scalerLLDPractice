package com.scaler.practice.designpatterns.structural.adapter.phonepe;

import com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters.AxisBankApiAdapterImpl;
import com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters.BankApiAdapter;
import com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters.IciciBankApiAdapterImpl;

public class PhonePeClient {
    BankApiAdapter api = new IciciBankApiAdapterImpl();  // dependency injected via dependency injection
    public void transferMoney() {

        var balance = api.checkBalance();
        if(balance > 0) {
            api.transfer();
        }
    }
}
