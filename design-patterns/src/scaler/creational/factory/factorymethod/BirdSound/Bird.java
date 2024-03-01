package scaler.creational.factory.factorymethod.BirdSound;

import scaler.creational.factory.factorymethod.BirdSound.product.BirdSound;

abstract public class Bird {

    int age;

    public void sing() {
        BirdSound sound = getSound(); // BirdSoundfactory.getSound(birdType); // Practical factory method
        sound.makeSound();
    }
    abstract public BirdSound getSound(); // this is a factory method
}
