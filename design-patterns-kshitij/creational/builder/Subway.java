package com.scaler.practice.designpatterns.creational.builder;

public class Subway {
    // immutable subway, that means no setters, otherwise outside people will change it.
    String breadType;
    String capsicumType;
    String size;
    int price;
    // flexibility in setting parameters , will need to all add combinations

    public Subway() {
        // default constructor
    }
    public Subway(SubwayBuilder builder) {
        // we cannot pass subway it self becaause we cannot set subway from outside
        this.breadType = builder.breadType;
        this.capsicumType = builder.capsicumType;
        this.price = builder.price;
        this.size = builder.size;
    }
    public static SubwayBuilder getBuilder() {
        return new SubwayBuilder();
    }
    public static class SubwayBuilder {
        String breadType;
        String capsicumType;
        String size;
        int price;

        public Subway build() {
            return new Subway(this);
        }
        public String getBreadType() {
            return breadType;
        }

        public SubwayBuilder setBreadType(String breadType) {
            this.breadType = breadType;
            return this;
        }

        public String getCapsicumType() {
            return capsicumType;
        }

        public SubwayBuilder setCapsicumType(String capsicumType) {
            this.capsicumType = capsicumType;
            return this;
        }

        public String getSize() {
            return size;

        }

        public SubwayBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public int getPrice() {
            return price;
        }

        public SubwayBuilder setPrice(int price) {
            this.price = price;
            return this;
        }
    }
}
