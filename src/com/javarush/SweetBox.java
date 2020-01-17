package com.javarush;

import java.util.ArrayList;
import java.util.List;

public class SweetBox implements SweetBoxActions {
    private List<SweetThing> currentBox;

    public SweetBox() {
        this.currentBox = new ArrayList<>();
    }

    @Override
    public void addCandy(SweetThing candy) {
        currentBox.add(candy);
    }

    @Override
    public void removeCandyByIndex(int number) {
        currentBox.remove(number);
    }

    @Override
    public void removeLastCandy() {
        if(currentBox.isEmpty())
        currentBox.remove(currentBox.size() - 1);
    }

    @Override
    public double getBoxWeight() {
        double totalWeight = 0.0;
        for (SweetThing candy : currentBox) {
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getBoxPrice() {
        double totalPrice = 0.0;
        for (SweetThing candy : currentBox) {
            totalPrice += candy.getPrice();
        }
        return totalPrice;
    }


    @Override
    public void getBoxInfo() {
        for (SweetThing candy : currentBox) {
            System.out.println(candy.getInfo());
        }
    }

    @Override
    public void reduceWeight(double weight) {
        while(getBoxWeight() > weight && !currentBox.isEmpty()) {
            SweetThing minimumSizeCandy = null;
            for(SweetThing candy : currentBox) {
                if (minimumSizeCandy == null) {
                    minimumSizeCandy = candy;
                } else {
                    if (minimumSizeCandy.getWeight() > candy.getWeight()) {
                        minimumSizeCandy = candy;
                    }
                }
            }
            currentBox.remove(minimumSizeCandy);
        }
    }

    @Override
    public void reducePrice(double price) {
        while(getBoxPrice() > price && !currentBox.isEmpty()) {
            SweetThing minimumPriceCandy = null;
            for(SweetThing candy : currentBox) {
                if (minimumPriceCandy == null) {
                    minimumPriceCandy = candy;
                } else {
                    if (minimumPriceCandy.getPrice() > candy.getPrice()) {
                        minimumPriceCandy = candy;
                    }
                }
            }
            currentBox.remove(minimumPriceCandy);
        }
    }

}
