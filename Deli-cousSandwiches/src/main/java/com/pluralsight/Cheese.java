package com.pluralsight;

public class Cheese extends Toppings{
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {


        switch (size) {
            case "4":
                return 0.75;
            case "8":
                return 1.50;
            case "12":
                return 2.25;
            default:
                System.out.println("Not a valid sandwich size");
                break;
        }
        return 0;
    }
}
