package com.pluralsight;

public class RegularToppings extends Toppings {
    public RegularToppings(String name) {
        super(name);
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
