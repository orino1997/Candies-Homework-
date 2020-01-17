package com.javarush;

public class Stickjaw extends SweetThing  {
    private String name;
    private double weight;
    private double price;
    private String flavour;

    public Stickjaw(String flavour) {
        this.name = "stickjaw";
        this.weight = 10;
        this.price = 15;
        this.flavour = flavour;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getInfo() {
        return "name: " + name + " weight: " + weight + " price: " + price + " flavour " + flavour;
    }
}

