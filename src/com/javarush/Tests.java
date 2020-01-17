package com.javarush;

public class Tests {
    public static void main(String[] args) throws Exception {
        testReduceWeight();
        testReducePrice();
    }

    private static void testReduceWeight() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.reduceWeight(40);
        if ((s.getBoxWeight() > 40)) {
            throw new Exception("Incorrect reduced weight");
        }
    }

    private static void testReducePrice() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.reducePrice(20);
        if ((s.getBoxPrice() > 20)) {
            throw new Exception("Incorrect reduced price");
        }
    }
}
