package com.scaler.practice.designpatterns.behavioural.strategy;

public class BallPen extends  Pen {

    @Override
    public void write() {
        System.out.println("Ball Pen Write Behaviour");
    }

    @Override
    public void refill() {
        this.refillStrategy.refill();
    }
}
