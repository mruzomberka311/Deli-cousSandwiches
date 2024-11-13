package com.pluralsight;

import java.util.List;

public class Order {
    private String customerName;
    private int orderNumber;
    private List<Sandwich> sandwiches;
    private List<Drinks> drinks;
    private List<Chips> chips;


    public Order(String customerName, int orderNumber, List<Sandwich> sandwiches,List<Drinks> drinks, List<Chips> chips) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public void addSandwich(Sandwich sandwich){
    order.add(sandwich);
    }

    public void addDrink(Drinks drink){
    order.add(drink);
    }

    public void addChips(Chips chips){
    order.add(chips);
    }

    public void displayOrder(){
        for (int i = 0; i < order.length; i++) {
            System.out.println(order.get[i]);
        }

    }

    public void getTotalPrice(){


    }

    public String getCustomerName() {
        return customerName;
    }

    public int getOrderNumber() {
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
}
