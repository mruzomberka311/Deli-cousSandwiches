package com.pluralsight;

public class Meat extends Toppings{
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
