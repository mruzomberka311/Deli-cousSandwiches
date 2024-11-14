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
            //Needs work
     }
    }

    public void addToppings(List<Toppings> sandwichToppings) {
        for (Toppings topping : toppings) {
            if (sandwichToppings.equals(topping.getName())) {
                toppings.add(topping);
            }
        }
    }

    public double getSandwichPrice(String size, List<Toppings> sandwichToppings){
        double basePrice = 0;
        switch (size){
            case "4":
                basePrice = 5.50;

            case "8":
                basePrice = 7.00;

            case "12":
                basePrice = 8.50;
            default:
                basePrice = 0;

        }

        for (Toppings topping : sandwichToppings) {
           basePrice += topping.getPrice(size);

        }
        return basePrice;
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
