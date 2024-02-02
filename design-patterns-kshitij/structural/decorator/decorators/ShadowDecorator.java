package com.scaler.practice.designpatterns.structural.decorator.decorators;

import com.scaler.practice.designpatterns.structural.decorator.UiComponent;

public class ShadowDecorator extends UiComponentDecorator {
    // UiComponent component;

    public ShadowDecorator(UiComponent component) {
        super(component);
    }
    @Override
    public void draw() {
        this.component.draw();
        System.out.println("Shadow added to component");
    }
}
