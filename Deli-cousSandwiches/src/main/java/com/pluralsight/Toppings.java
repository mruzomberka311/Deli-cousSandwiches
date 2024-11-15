package com.pluralsight;

public abstract class Toppings {
    protected String name;


    public Toppings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice(String size);
}



