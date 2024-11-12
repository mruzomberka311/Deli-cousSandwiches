package com.pluralsight;

public class Sauce extends Toppings{
    public Sauce(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}
