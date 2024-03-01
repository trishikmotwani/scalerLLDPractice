package scaler.creational.factory.factorymethod.BirdSound;

public class BirdClient {

    public static void main(String[] args) {

        Bird crow = new Crow();
        crow.sing();
    }
}
