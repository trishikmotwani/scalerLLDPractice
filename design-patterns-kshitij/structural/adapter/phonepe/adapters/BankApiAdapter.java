package com.scaler.practice.designpatterns.structural.adapter.phonepe.adapters;

import com.scaler.practice.designpatterns.structural.adapter.phonepe.BankApi;

public abstract class BankApiAdapter {

    BankApi api;
    public abstract void transfer();

    public abstract  int checkBalance();

    public abstract void payCreditCardBill();
}
