package com.scaler.practice.designpatterns.structural.decorator.decorators;

import com.scaler.practice.designpatterns.structural.decorator.UiComponent;

public abstract class UiComponentDecorator extends UiComponent {
    UiComponent component;
    UiComponentDecorator(UiComponent component) {
        this.component = component;
    }
}
