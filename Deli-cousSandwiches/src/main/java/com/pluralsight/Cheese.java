package com.pluralsight;

public class Cheese extends Toppings{
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
