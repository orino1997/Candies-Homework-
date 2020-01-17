package com.javarush;

public class Tests {
    public static void main(String[] args) throws Exception {
        testReduceWeight();
        testReducePrice();
        testAddedSweets();
        testDeletedByIndexSweets();
        testLastCandyRemoved();
        testInfo();
    }
    private static void testAddedSweets() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Licorice("red"));
        s.addCandy(new Lollipop(10.5));
        if(s.getBoxPrice() == 0) {
            throw new Exception("Incorrect price (incorrect amount of added goods)");
        }
    }
    private static void testDeletedByIndexSweets() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new ChocolateBar(false));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.removeCandyByIndex(1);
        if(s.getBoxPrice() != 40) {
            throw new Exception("Incorrect element was removed. The price is incorrect");
        }
    }
    private static void testLastCandyRemoved() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new ChocolateBar(false));
        s.removeLastCandy();
        if(s.getBoxPrice() != 40) {
            throw new Exception("Last candy wasn't removed. The price is incorrect");
        }
    }
    private static void testInfo() throws Exception {
        SweetBox s = new SweetBox();
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new ChocolateBar(false));
        s.getBoxInfo();
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
