package scaler.creational.factory.factorymethod.BirdSound.product;

public class EagleSound implements BirdSound {

    @Override
    public void makeSound() {
        System.out.println("Singing like a Eagle");
    }
}
