package com.pluralsight;

public class Cheese extends Toppings{
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice() {


        switch (sandwich.getSize) {
            case "4":
                return 0.75;
                break;
            case "8":
                return 1.50;
                break;
            case "12":
                return 2.25;
                break;
            default:
                System.out.println("Not a valid sandwich size");
                break;
        }
    }
}
