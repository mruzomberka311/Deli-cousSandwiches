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

    //display the menu
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


    switch (choice)
    {
        case 1:

            //Choose the size of sandwich
            displaySizes();
            String[] sizes = {"4","8","12"};
            System.out.println("What size sandwich would you like?");
            int userChoiceSize = scanner.nextInt();
            String size;
            switch (userChoiceSize){
                case 1:
                    size = sizes[0];
                    break;
                case 2:
                    size = sizes[1];
                    break;
                case 3:
                    size = sizes[2];
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }


            //Choose what bread type
            displayBreadMenu();
            String[] breads = {"white", "wheat", "rye", "wrap"};
            System.out.println("What type of bread would you like?");
            int userChoiceBread = scanner.nextInt();
            String breadType;
            switch (userChoiceBread){
                case 1:
                     breadType = breads[0];
                    break;
                case 2:
                     breadType = breads[1];
                    break;
                case 3:
                    breadType = breads[2];
                    break;
                case 4:
                    breadType = breads[3];
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }




            System.out.println("What kind of toppings would you like?");
            //Create a list of toppings and add to sandwich
            List<Toppings> sandwichToppings = new ArrayList<>();
            boolean chooseingMeats = true;
            while (chooseingMeats) {
                String[] meats = {"steak", "ham", "salami",};
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                }

                displayMeatMenu();
                System.out.println("What meat would you like? Type 'done' to continue");
                sandwichToppings.add(new Meat());

            }





            System.out.println("What kind of cheese would you like?");
            displayCheeseMenu();
            sandwichToppings.add(new Cheese(scanner.nextLine()));
            System.out.println("What free toppings would you like?");
            displayRegularToppingsMenu();
            sandwichToppings.add(new RegularToppings(scanner.nextLine()));

            displaySauceMenu();
            sandwichToppings.add(new Sauce(scanner.nextLine()));


            System.out.println("Would you like your sandwich toasted? true/false");
            boolean isToasted = scanner.nextBoolean();

            Sandwich sandwich = new Sandwich(size, breadType, sandwichToppings, isToasted);
            sandwich.addBread(bread);
            sandwich.addToppings();
            List<Sandwich> sandwichList = new ArrayList<>();
            sandwichList.add(sandwich);

            System.out.println("Sandwich successfully added!");
            break;

        case 2:
            //order drink
            //display drinks menu
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
            //display chips menu
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


public static void displaySizes(){
    System.out.println("/n Sandwich sizes");
    System.out.println("1) 4'");
    System.out.println("2) 8'");
    System.out.println("3) 12'");
}

public static void displayBreadMenu(){
    System.out.println("/n Bread Menu");
    System.out.println("1) white");
    System.out.println("2) wheat");
    System.out.println("3) rye");
    System.out.println("4) wrap");

}
public static void displayMeatMenu(){
    System.out.println("/n Meat Menu");
    System.out.println("1) steak");
    System.out.println("2) ham");
    System.out.println("3) salami");
    System.out.println("4) roast beef");
    System.out.println("5) chicken");
    System.out.println("6) bacon");
}
public static void displayCheeseMenu(){
    System.out.println("/n Cheese Menu");
    System.out.println("1) american");
    System.out.println("2) provolone");
    System.out.println("3) cheddar");
    System.out.println("4) swiss");

}

public static void displayRegularToppingsMenu(){
    System.out.println("/n Regular Toppings Menu");
    System.out.println("1) lettuce");
    System.out.println("2) peppers");
    System.out.println("3) onions");
    System.out.println("4) tomatoes");
    System.out.println("5) jalapenos");
    System.out.println("6) cucumbers");
    System.out.println("7) pickles");
    System.out.println("8)guacamole");
    System.out.println("9) mushrooms");
}
public static void displaySauceMenu(){
    System.out.println("/n Sauce Menu");
    System.out.println("1) mayo");
    System.out.println("2) mustard");
    System.out.println("3) ketchup");
    System.out.println("4) ranch");
    System.out.println("5) thousand island");
    System.out.println("6) vinaigrette");
}



public static void displayDrinksMenu(){

}
public static void displayChipsMenu(){

}

public void addOrder(){

}

public Order getOrder(){

}

}
