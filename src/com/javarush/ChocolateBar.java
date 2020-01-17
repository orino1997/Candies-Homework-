package com.javarush;

public class ChocolateBar extends SweetThing{
    private String name;
    private double weight;
    private double price;
    private boolean nuts;

    public ChocolateBar(boolean nuts) {
        this.name = "chocolate bar";
        this.weight = 35;
        this.price = 50;
        this.nuts = nuts;
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
        return "name: " + name + " weight: " + weight + " price: " + price + " with nuts " + nuts;
    }
}
