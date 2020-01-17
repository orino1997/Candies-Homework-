package com.javarush;

public class Licorice extends SweetThing {
    private String name;
    private double weight;
    private double price;
    private String colour;

    public Licorice(String colour) {
        this.name = "licorice";
        this.weight = 25;
        this.price = 20;
        this.colour = colour;
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
        return "name: " + name + " weight: " + weight + " price: " + price + " colour " + colour;
    }
}
