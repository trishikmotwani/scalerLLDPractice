package com.scaler.practice.designpatterns.structural.decorator.decorators;

import com.scaler.practice.designpatterns.structural.decorator.UiComponent;

public class ScrollBarDecorator extends UiComponentDecorator {
    // UiComponent component;

    public ScrollBarDecorator(UiComponent component) {
        super(component);
        //this.component = component;
    }
    @Override
    public void draw() {
        this.component.draw();
        System.out.println("Scroll Bar added to component");
    }
}
