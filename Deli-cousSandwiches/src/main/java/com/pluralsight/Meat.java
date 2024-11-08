package com.pluralsight;

public class Meat extends Toppings{
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        switch (sandwich.getSize) {
            case "4":
                return 1.00;
            break;
            case "8":
                return 2.00;
            break;
            case "12":
                return 3.00;
            break;
            default:
                System.out.println("Not a valid sandwich size");
                break;
        }
    }
}
