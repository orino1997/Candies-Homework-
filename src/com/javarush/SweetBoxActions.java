package com.javarush;

public interface SweetBoxActions {
    void addCandy(SweetThing candy);
    void removeCandyByIndex(int number);
    void removeLastCandy();
    double getBoxWeight();
    double getBoxPrice();
    void getBoxInfo();
    void reduceWeight(double weight);
    void reducePrice(double price);
}
