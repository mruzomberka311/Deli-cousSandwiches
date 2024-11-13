package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface
{
Scanner scanner = new Scanner(System.in);
Order order = new Order();



public void displayMenu()
{
    System.out.println("Welcome to the Krusty Krab my name is Squidwarddd. How may I help you?");


    System.out.println("What is your name?");
    String customerName = scanner.nextLine();

boolean running = true;

while (running)
{
    System.out.println("Main menu");
    System.out.println("1) Order Sandwich");
    System.out.println("2) Order Drink");
    System.out.println("3) Order Chips");
    System.out.println("4) Checkout");
    System.out.println("0) Cancel Order");

    int choice = scanner.nextInt();


    //display the menu

    switch (choice)
    {
        case 1:



            System.out.println("What size sandwich would you like?");
            String size = scanner.nextLine();
            System.out.println("What type of bread would you like?");
            String bread = scanner.nextLine();
            System.out.println("What kind of toppings would you like?");
            //Create a list of toppings and add to sandwich
            List<Toppings> sandwichToppings = new ArrayList<>();
            String choiceToppings = scanner.nextLine();
            sandwichToppings.add(choiceToppings);
            System.out.println("Would you like your sandwich toasted?");
            boolean isToasted = scanner.nextBoolean();


            Sandwich sandwich = new Sandwich(size, bread, sandwichToppings, isToasted);
            sandwich.addBread(bread);
            sandwich.addToppings();
            List<Sandwich> sandwichList = new ArrayList<>();
            sandwichList.add(sandwich);

            System.out.println("Sandwich successfully added!");
            break;
        case 2:
            //order drink
            System.out.println("What drink would you like?");
            String drinkFlavor = scanner.nextLine();
            System.out.println("What size drink would you like? small/medium/large");
            String drinkSize = scanner.nextLine();
            Drinks drink = new Drinks(drinkSize, drinkFlavor);
            drink.getPrice(drinkSize);
            List<Drinks> drinksList = new ArrayList<>();
            drinksList.add(drink);
            System.out.println("Drink successfully added!");
            break;
        case 3:
            //order chips
            System.out.println("What kind of chips would you like?");
            String chipType = scanner.nextLine();
            Chips chips = new Chips(chipType);
            chips.getPrice();
            List<Chips> chipsList = new ArrayList<>();
            chipsList.add(chips);
            System.out.println("Chips successfully added!");
            break;
        case 4:
            //checkout


            break;
        case 0:
            //cancel order
            sandwichList.clear();
            drinksList.clear();
            chipsList.clear();
            running = false;
        break;
        default:
            System.out.println("Please choose an option listed above.");
            break;
    }
}
}

public void displayBreadMenu(){
    System.out.println("/n Bread Menu");
    System.out.println("1) white");
    System.out.println("2) wheat");
    System.out.println("3) rye");
    System.out.println("4) wrap");

}
public void displayMeatMenu(){
    System.out.println("/n Meat Menu");
    System.out.println("1) steak");
    System.out.println("2) ham");
    System.out.println("3) salami");
    System.out.println("4) roast beef");
    System.out.println("5) chicken");
    System.out.println("6) bacon");
}
public void displayCheeseMenu(){
    System.out.println("/n Cheese Menu");
    System.out.println("1) american");
    System.out.println("2) provolone");
    System.out.println("3) cheddar");
    System.out.println("4) swiss");

}

public void displayRegularToppingsMenu(){
    System.out.println("/n Regular Toppings Menu");
    System.out.println("1) lettuce");
    System.out.println("2) peppers");
    System.out.println("3) onions");
    System.out.println("4) tomatoes");
    System.out.println("5) jalepenos");
    System.out.println("6) cucumbers");
    System.out.println("7) pickles");
    System.out.println("8)guacamole");
    System.out.println("9) mushrooms");
}
public void displaySauceMenu(){
    System.out.println("/n Sauce Menu");
    System.out.println("1) mayo");
    System.out.println("2) mustard");
    System.out.println("3) ketchup");
    System.out.println("4) ranch");
    System.out.println("5) thousand island");
    System.out.println("6) vinaigrette");
}

public void addOrder(){

}

public Order getOrder(){

}

}
