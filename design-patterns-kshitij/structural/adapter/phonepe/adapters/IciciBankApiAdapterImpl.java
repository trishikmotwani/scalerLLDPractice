package com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters;

import com.scaler.practice.designpatterns.structural.adapter.phonepe.IciciBankApi;

public class IciciBankApiAdapterImpl extends  BankApiAdapter {
    IciciBankApi api = new IciciBankApi();
    @Override
    public void transfer() {
        api.sendMoney();
    }

    @Override
    public int checkBalance() {
        api.getBalance();
        return 0;
    }

    @Override
    public void payCreditCardBill() {
        api.payCCBill();
    }
}
