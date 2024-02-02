package com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters;

import com.scaler.practice.designpatterns.structural.adapter.phonepe.AxisBankApi;

public class AxisBankApiAdapterImpl extends BankApiAdapter {
    AxisBankApi api = new AxisBankApi();
    @Override
    public void transfer() {
        api.transfer();
    }

    @Override
    public int checkBalance() {
        api.checkBalance();
        return 0;
    }

    @Override
    public void payCreditCardBill() {
        api.payCreditCardBill();
    }
}
