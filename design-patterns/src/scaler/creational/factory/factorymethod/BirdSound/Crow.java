package scaler.creational.factory.factorymethod.BirdSound;

import scaler.creational.factory.factorymethod.BirdSound.product.BirdSound;
import scaler.creational.factory.factorymethod.BirdSound.product.CrowSound;

public class Crow extends  Bird {

    @Override
    public BirdSound getSound() {
        // this is factory product creater implementation
        return new CrowSound();
    }
}
