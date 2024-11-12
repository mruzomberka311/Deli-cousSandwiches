package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
Scanner scanner = new Scanner(System.in);




public void displayMenu(){
    System.out.println("Welcome to the Krusty Krab my name is Squidwarddd. How may I help you?");
    int choice = scanner.nextInt();

    //display the menu
    Order order = new Order();
    switch (choice){
        case 1:

            System.out.println("What size sandwich would you like?");
            String size = scanner.nextLine();
            System.out.println("What type of bread would you like?");
            String bread = scanner.nextLine();
            System.out.println("What kind of toppings would you like?");
            String topping = scanner.nextLine();
            System.out.println("Would you like your sandwich toasted?");
            String isToasted = scanner.nextLine();
            Sandwich sandwich = new Sandwich(size,bread,topping,isToasted);
            sandwich.addBread(bread);
            sandwich.addToppings(topping);
            order.addSandwich(sandwich);
            break;
        case 2:
            //order drink
            System.out.println("What drink would you like?");
            String drinkFlavor = scanner.nextLine();
            System.out.println("What size drink would you like? small/medium/large");
            String drinkSize = scanner.nextLine();
            Drinks drink = new Drinks(drinkSize,drinkFlavor);
            drink.getPrice();
            order.addDrink();
            break;
        case 3:
            //order chips
            break;
        case 4:
            //finish order
            break;
        default:
            System.out.println("Please choose an option listed above.");
            break;
    }
}

public void displayItemMenu(){


}

public void addOrder(){

}

public Order getOrder(){

}

}
