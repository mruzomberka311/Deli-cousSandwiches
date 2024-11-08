package com.pluralsight;

public class Order {
    private String customerName;
    private int orderNumber;
    private List<Sandwich> sandwiches;
    private List<Chips> chips;


    public Order(String customerName, int orderNumber, List<Sandwich> sandwiches, List<Chips> chips) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.sandwiches = sandwiches;
        this.chips = chips;
    }

    public void addSandwich(){

    }

    public void addDrink(){

    }

    public void addChips(){

    }

    public void displayOrder(){

    }

    public void getTotalPrice(){

    }

    public String getName() {
        return name;
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
        this.name = name;
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
