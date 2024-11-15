package com.pluralsight;

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

    public void displayOrder(Order order){
        order.toString();
        System.out.println(order);
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
        return customerName + "/n" + orderNumber + "/n" + sandwiches + "" + drinks + "/n" + chips + "/n" + getTotalPrice(sandwiches, drinks, chips) + "/n" ;
    }
}
