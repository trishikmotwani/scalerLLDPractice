package com.scaler.practice.designpatterns.creational.builder;

public class SubwayClient {

    public static void main(String[] args) {

        // client wants to create a subway burger , but it has to be immutable
        // also there can be many fields , so client needs flexibility while setting the subway ingredient

        Subway sub = new Subway();
        // sub.set() // as Subway class is immutable, we have to use another class

        // way of creating class of inner classes
        // Subway.SubwayBuilder sb = new Subway().new SubwayBuilder();

        // final soln
        Subway subFinal = Subway.getBuilder().setBreadType("WholeWheat").setCapsicumType("Red")
                .setSize("half").setPrice(100).build();

        System.out.println("Subway is ready");
        System.out.println("bread::" + subFinal.breadType);
        System.out.println("capsicum::" + subFinal.capsicumType);
        System.out.println("size::" + subFinal.size);
        System.out.println("price::" + subFinal.price);
    }
}
