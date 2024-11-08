package com.pluralsight;

public class Sandwich {
    private String size;
    private String breadType;
    private List<Toppings> toppings;
    private boolean isToasted;


    public Sandwich(String size, String breadType, List<Toppings> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }


    public void addBread(){

    }

    public void addToppings(){

    }


    public String getSize() {
        return size;
    }

    public String getBreadType() {
        return breadType;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }
}
