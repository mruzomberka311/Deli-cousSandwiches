package com.pluralsight;

public class RegularToppings extends Toppings {
    public RegularToppings(String name) {
        super(name);
    }


    @Override
    public double getPrice(String size) {
        return 0;
    }
}
