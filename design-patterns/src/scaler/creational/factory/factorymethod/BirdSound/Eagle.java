package scaler.creational.factory.factorymethod.BirdSound;

import scaler.creational.factory.factorymethod.BirdSound.product.BirdSound;
import scaler.creational.factory.factorymethod.BirdSound.product.EagleSound;

public class Eagle  extends Bird {
    public BirdSound getSound() {
        // this is factory product creater implementation
        return new EagleSound();
    }
}
