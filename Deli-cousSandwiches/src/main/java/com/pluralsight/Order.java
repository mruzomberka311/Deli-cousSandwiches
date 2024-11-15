package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private String customerName;
    private int orderNumber;
    private List<Sandwich> sandwiches;
    private List<Drinks> drinks;
    private List<Chips> chips;

    Scanner scanner = new Scanner(System.in);

    public Order(String customerName, int orderNumber,List<Sandwich> sandwiches,List<Drinks> drinks, List<Chips> chips) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public void addSandwich(Order order,Sandwich sandwichList){
     sandwiches.add(sandwichList);
    }

    public void addDrink(Drinks drinkList){
     drinks.add(drinkList);
    }

    public void addChips(Chips chipsList){
    chips.add(chipsList);
    }



    public double getTotalPrice(List<Sandwich> sandwichList,List<Drinks> drinksList,List<Chips> chipsList){
        double total = 0;
        for (Sandwich sandwich : sandwichList){
            total += sandwich.getSandwichPrice(sandwich.getSize(), sandwich.getToppings());
        }
        for (Chips chip : chipsList){
            total += chip.getPrice();
        }
        for (Drinks drink : drinksList){
            total += drink.getPrice(drink.getSize());
        }
        return total;
     }


    public String getCustomerName() {
        return customerName;
    }

    public int getOrderNumber() {
       int orderNumber = (int) Math.random() * 101;
        return orderNumber;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setName(String name) {
        this.customerName = customerName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }


    public String toString(){
        String sand = "";
        for (Sandwich sandwich : sandwiches){
            sand += sandwich.toString() + "\n";
        }
        String d = "";
        for (Drinks drink : drinks){
            d += drink.toString() + "\n";
        }
        String c = "";
        for (Chips chip : chips){
            c += chip.toString() + "\n";
        }

        return "Customer: " + customerName + "\n" + "ON: "  + orderNumber + "\n" + sand + "\n" + d + "\n" + c + "\n" +
                " Total ........................ $"+ getTotalPrice(sandwiches, drinks, chips) + "\n";
    }
}
