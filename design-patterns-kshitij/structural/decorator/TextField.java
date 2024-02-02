package com.scaler.practice.designpatterns.structural.decorator;

public class TextField extends  UiComponent {
    @Override
    public void draw() {
        System.out.println("Text Field Drawn.");
    }
}
