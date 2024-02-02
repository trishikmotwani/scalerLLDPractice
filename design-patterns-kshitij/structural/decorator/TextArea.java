package com.scaler.practice.designpatterns.structural.decorator;

public class TextArea extends  UiComponent {
    @Override
    public void draw() {
        System.out.println("Text Area Drawn.");
    }
}
