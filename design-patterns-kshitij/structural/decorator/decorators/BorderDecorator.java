package com.scaler.practice.designpatterns.structural.decorator.decorators;

import com.scaler.practice.designpatterns.structural.decorator.UiComponent;

public class BorderDecorator extends UiComponentDecorator {
    // UiComponent component;

    public BorderDecorator(UiComponent component) {
        super(component);
        // this.component = component;
    }
    @Override
    public void draw() {
        this.component.draw(); // this first performs the chain of operations in recursion then adds a border
        System.out.println("Border added to component");
    }
}
