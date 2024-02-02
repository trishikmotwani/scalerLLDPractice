package com.scaler.practice.designpatterns.structural.decorator;

import com.scaler.practice.designpatterns.structural.decorator.decorators.BorderDecorator;
import com.scaler.practice.designpatterns.structural.decorator.decorators.ShadowDecorator;

public class ComponentClient {

    public static void main(String[] args) {
        UiComponent textArea = new BorderDecorator(new ShadowDecorator(new TextArea()));
        textArea.draw();
    }
}
