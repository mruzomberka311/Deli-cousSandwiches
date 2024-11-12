package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
Scanner scanner = new Scanner(System.in);




public void displayMenu(){
    System.out.println("Welcome to the Krusty Krab my name is Squidwarddd. How may I help you?");
    int choice = scanner.nextInt();
    System.out.println("What is your name?");
    String customerName = scanner.nextLine();

    //display the menu

    switch (choice){
        case 1:
            System.out.println("What size sandwich would you like?");
            String size = scanner.nextLine();
            System.out.println("What type of bread would you like?");
            String bread = scanner.nextLine();
            System.out.println("What kind of toppings would you like?");
            //Create a list of toppings and add to sandwich
            System.out.println("Would you like your sandwich toasted?");
            boolean isToasted = scanner.nextBoolean();


            Sandwich sandwich = new Sandwich(size, bread,, isToasted);
            sandwich.addBread(bread);
            sandwich.addToppings();

            System.out.println("Sandwich successfully added!");
            break;
        case 2:
            //order drink
            System.out.println("What drink would you like?");
            String drinkFlavor = scanner.nextLine();
            System.out.println("What size drink would you like? small/medium/large");
            String drinkSize = scanner.nextLine();
            Drinks drink = new Drinks(drinkSize,drinkFlavor);
            drink.getPrice(drinkSize);
            System.out.println("Drink successfully added!");
            break;
        case 3:
            //order chips
            System.out.println("What kind of chips would you like?");
            String chipType = scanner.nextLine();
            Chips chips = new Chips(chipType);
            chips.getPrice();

            System.out.println("Chips successfully added!");
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
