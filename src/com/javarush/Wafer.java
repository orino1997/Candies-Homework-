package com.javarush;

public class Wafer extends SweetThing {
    private String name;
    private double weight;
    private double price;
    private boolean icing;

    public Wafer( boolean icing) {
        this.name = "wafer";
        this.weight = 12;
        this.price = 20;
        this.icing = icing;
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
        return "name: " + name + " weight: " + weight + " price: " + price + " with icing " + icing;
    }
}
