package com.javarush;

public class Lollipop extends SweetThing {
    private String name;
    private double weight;
    private double price;
    private double diameter;

    public Lollipop(double radius) {
        this.name = "lollipop";
        this.weight = 40;
        this.price = 10;
        this.diameter = radius;
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
        return "name: " + name + " weight: " + weight + " price: " + price + " diameter " + diameter;
    }
}
