package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private List<Toppings> toppings;
    private boolean isToasted;


    public Sandwich(String size, String breadType, List<Toppings> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
        this.isToasted = isToasted;
    }


    public void addBread(String bread){
     if (bread.equalsIgnoreCase(getBreadType())){
            String breadType = bread;
     }
    }

    public void addToppings(List<Toppings> sandwichToppings) {
        for (Toppings topping : toppings) {
            if (sandwichToppings.equals(topping.getName())) {
                toppings.add(topping);
            }
        }
    }

    public double getPrice(){

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
