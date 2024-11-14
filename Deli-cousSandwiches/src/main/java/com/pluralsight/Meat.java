package com.pluralsight;

public class Meat extends Toppings {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        switch (size) {
            case "4":
                return 1.00;
            case "8":
                return 2.00;

            case "12":
                return 3.00;
            default:
                System.out.println("Not a valid sandwich size");
                break;
        }
        return 0;
    }
}


