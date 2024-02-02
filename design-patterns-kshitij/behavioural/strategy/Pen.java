package com.scaler.practice.designpatterns.behavioural.strategy;

public abstract  class Pen implements Write {

    String name;
    RefillStrategy refillStrategy;

    public abstract void refill();
}
