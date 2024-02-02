package com.scaler.practice.designpatterns.behavioural.strategy;

public class RefillByInk implements RefillStrategy {
    @Override
    public void refill() {
        System.out.println("Refilling By Ink");
    }
}
