package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface
{
    private String customerName;
    private int orderNumber;
    private List<Sandwich> sandwichList;
    private List<Drinks> drinksList;
    private List<Chips> chipsList;
    private Order order;


    Scanner scanner = new Scanner(System.in);


    public UserInterface() {
        this.customerName = "mort";
        this.orderNumber = 7;
        this.sandwichList = new ArrayList<>();
        this.drinksList = new ArrayList<>();
        this.chipsList = new ArrayList<>();

    }

    public void displayMenu()
{
    System.out.println("Welcome to the Krusty Krab my name is Squidwarddd. How may I help you?");
    System.out.println("1) New Order");
    System.out.println("0) Exit");



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

            //switch case to choose the size of sandwich
            displaySizes();
            String[] sizes = {"4","8","12"};
            System.out.println("What size sandwich would you like?");
            int userChoiceSize = scanner.nextInt();
            String size = "";
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


            //switch case to choose what bread type
            displayBreadMenu();
            String[] breads = {"white", "wheat", "rye", "wrap"};
            System.out.println("What type of bread would you like?");
            int userChoiceBread = scanner.nextInt();
            String breadType = "";
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



            //switch case to choose type of meat
            System.out.println("What kind of toppings would you like?");
            //Create a list of toppings and add to sandwich
            List<Toppings> sandwichToppings = new ArrayList<>();
            boolean choosingMeats = true;

            while (choosingMeats) {
                displayMeatMenu();
                System.out.println("What kind of meat would you like. Type '0' to continue.");
                String[] meats = {"steak", "ham", "salami","roast beef","chicken","bacon"};
                int userChoiceMeat = scanner.nextInt();
                switch (userChoiceMeat) {
                    case 0:
                        choosingMeats = false;
                        break;
                    case 1:
                        Meat steak = new Meat(meats[0]);
                        sandwichToppings.add(steak);
                        break;
                    case 2:
                        Meat ham = new Meat(meats[1]);
                        sandwichToppings.add(ham);
                        break;
                    case 3:
                        Meat salami = new Meat(meats[2]);
                        sandwichToppings.add(salami);
                        break;
                    case 4:
                        Meat roastBeef = new Meat(meats[3]);
                        sandwichToppings.add(roastBeef);
                        break;
                    case 5:
                        Meat chicken = new Meat(meats[4]);
                        sandwichToppings.add(chicken);
                        break;
                    case 6:
                        Meat bacon = new Meat(meats[5]);
                        sandwichToppings.add(bacon);
                        break;
                    default:
                        System.out.println("Please choose a valid option");
                        break;

                }

            }

            //switch case to choose the type of cheese
            displayCheeseMenu();
            String[] cheeses = {"american","provolone","cheddar","swiss"};
            System.out.println("What kind of cheese would you like. Type '0' to continue.");
            int userChoiceCheese = scanner.nextInt();
            boolean choosingCheese = true;

            while (choosingCheese){
                switch (userChoiceCheese){
                    case 0:
                        choosingCheese = false;
                        break;
                    case 1:
                        Cheese american = new Cheese(cheeses[0]);
                        sandwichToppings.add(american);
                        break;
                    case 2:
                        Cheese provolone = new Cheese(cheeses[1]);
                        sandwichToppings.add(provolone);
                        break;
                    case 3:
                        Cheese cheddar = new Cheese(cheeses[2]);
                        sandwichToppings.add(cheddar);
                        break;
                    case 4:
                        Cheese swiss = new Cheese(cheeses[3]);
                        sandwichToppings.add(swiss);
                        break;
                    default:
                        System.out.println("Please choose a valid option");
                        break;
                }

            }


            //switch case to choose the type of regular toppings
            displayRegularToppingsMenu();
            String[] regularToppings = {"lettuce","peppers","onions","tomatoes","jalapenos","cucumbers","pickles","guacamole","mushrooms"};
            System.out.println("What free toppings would you like? Type '0' to continue.");
            int userChoiceRegularToppings = scanner.nextInt();
            boolean choosingRegularToppings = true;

            while (choosingRegularToppings) {
                switch (userChoiceRegularToppings) {
                    case 0:
                        choosingRegularToppings = false;
                    case 1:
                        RegularToppings lettuce = new RegularToppings(regularToppings[0]);
                        sandwichToppings.add(lettuce);
                        break;
                    case 2:
                        RegularToppings peppers = new RegularToppings(regularToppings[1]);
                        sandwichToppings.add(peppers);
                        break;
                    case 3:
                        RegularToppings onions = new RegularToppings(regularToppings[2]);
                        sandwichToppings.add(onions);
                        break;
                    case 4:
                        RegularToppings tomatoes = new RegularToppings(regularToppings[3]);
                        sandwichToppings.add(tomatoes);
                        break;
                    case 5:
                        RegularToppings jalapenos = new RegularToppings(regularToppings[4]);
                        sandwichToppings.add(jalapenos);
                        break;
                    case 6:
                        RegularToppings cucumbers = new RegularToppings(regularToppings[5]);
                        sandwichToppings.add(cucumbers);
                        break;
                    case 7:
                        RegularToppings pickles = new RegularToppings(regularToppings[6]);
                        sandwichToppings.add(pickles);
                        break;
                    case 8:
                        RegularToppings guacamole = new RegularToppings(regularToppings[7]);
                        sandwichToppings.add(guacamole);
                        break;
                    case 9:
                        RegularToppings mushrooms = new RegularToppings(regularToppings[8]);
                        sandwichToppings.add(mushrooms);
                        break;
                    default:
                        System.out.println("Please choose a valid option");
                }

            }

            //switch case to choose the kind of sauces
            displaySauceMenu();
            String[] sauces = {"mayo","mustard","ketchup","ranch","thousand island","vinaigrette"};
            System.out.println("What sauces would you like. Type '0' to continue");
            int userChoiceSauce = scanner.nextInt();
            boolean choosingSauces = true;

            while (choosingSauces){
                switch (userChoiceSauce){
                    case 0:
                        choosingSauces = false;
                        break;
                    case 1:
                        Sauce mayo = new Sauce(sauces[0]);
                        sandwichToppings.add(mayo);
                        break;
                    case 2:
                        Sauce mustard = new Sauce(sauces[1]);
                        sandwichToppings.add(mustard);
                        break;
                    case 3:
                        Sauce ketchup = new Sauce(sauces[2]);
                        sandwichToppings.add(ketchup);
                        break;
                    case 4:
                        Sauce ranch = new Sauce(sauces[3]);
                        sandwichToppings.add(ranch);
                        break;
                    case 5:
                        Sauce thousandIsland = new Sauce(sauces[4]);
                        sandwichToppings.add(thousandIsland);
                        break;
                    case 6:
                        Sauce vinaigrette = new Sauce(sauces[5]);
                        sandwichToppings.add(vinaigrette);
                        break;
                    default:
                        System.out.println("Please choose a valid option");
                        break;
                }

            }

            //istoasted if statement
            boolean isToasted;
            System.out.println("Would you like your sandwich toasted? yes/no");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes"))
            {
                isToasted = true;
            }
            if (answer.equalsIgnoreCase("no"))
            {
                isToasted = false;
            }
            else
            {
                System.out.println("Invalid choice");
                return;
            }


            Sandwich sandwich = new Sandwich(size, breadType, sandwichToppings, isToasted);
            sandwich.addBread(breadType);
            sandwich.addToppings(sandwichToppings);

            List<Sandwich> sandwichList = new ArrayList<>();
            sandwichList.add(sandwich);

            System.out.println("Sandwich successfully added!");
            break;

        case 2:
            //order drink
            //display drinks menu
            List<Drinks> drinksList = new ArrayList<>();
            displayDrinkSize();
            String[] drinkSizes = {"small","medium","large"};
            System.out.println("What size drink would you like?");
            int sizeInput = scanner.nextInt();
            String drinkSize = "";

            switch (sizeInput){
                case 1:
                    drinkSize = drinkSizes[0];
                    break;
                case 2:
                    drinkSize = drinkSizes[1];
                    break;
                case 3:
                    drinkSize = drinkSizes[2];
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }

            displayDrinksMenu();
            String[] flavors = {"coke","sprite","mug","fanta orange"};
            System.out.println("What drink would you like? ");
            int userChoiceFlavor = scanner.nextInt();

                switch (userChoiceFlavor){
                    case 1:
                        Drinks coke = new Drinks(flavors[0],drinkSize);
                        drinksList.add(coke);
                        break;
                    case 2:
                        Drinks sprite = new Drinks(flavors[1],drinkSize);
                        drinksList.add(sprite);
                        break;
                    case 3:
                        Drinks mug = new Drinks(flavors[2],drinkSize);
                        drinksList.add(mug);
                        break;
                    case 4:
                        Drinks fanta = new Drinks(flavors[3],drinkSize);
                        drinksList.add(fanta);
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                        break;
                }

            System.out.println("Drink successfully added!");
            break;

        case 3:
            //order chips
            //display chips menu
            displayChipsMenu();
            List<Chips> chipsList = new ArrayList<>();
            System.out.println("What kind of chips would you like?");
            String[] chips = {"Lay's Original", "Doritios Cool Ranch","Lay's Salt and Vinegar","Ruffles Cheddar","Miss Vickie's Jalapeno"};
            int userChoiceChips = scanner.nextInt();

            switch (userChoiceChips)
            {
                case 1:
                    Chips laysOriginal = new Chips(chips[0]);
                    chipsList.add(laysOriginal);
                    break;
                case 2:
                    Chips coolRanch = new Chips(chips[1]);
                    chipsList.add(coolRanch);
                    break;
                case 3:
                    Chips saltAndVinegar = new Chips(chips[2]);
                    chipsList.add(saltAndVinegar);
                    break;
                case 4:
                    Chips cheddar = new Chips(chips[3]);
                    chipsList.add(cheddar);
                    break;
                case 5:
                    Chips jalapeno = new Chips(chips[4]);
                    chipsList.add(jalapeno);
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("Chips successfully added!");
            break;


        case 4:
            //checkout



            break;
        case 0:
            //cancel order
            running = false;
        break;
        default:
            System.out.println("Please choose an option listed above.");
            break;
    }

}
    order = new Order(customerName,orderNumber,sandwichList,drinksList,chipsList);
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
    System.out.println("Drinks Menu");
    System.out.println("1) Coke");
    System.out.println("2) Sprite");
    System.out.println("3) Mug");
    System.out.println("4) Fanta Orange");
}


public static void displayDrinkSize(){
    System.out.println("Drink sizes:");
    System.out.println("1) small");
    System.out.println("2) medium");
    System.out.println("3) large");
}
public static void displayChipsMenu(){
    System.out.println("Chips Menu");
    System.out.println("1) Lays Original");
    System.out.println("2) Doritos Cool Ranch");
    System.out.println("3) Lays Salt and Vinegar");
    System.out.println("4) Ruffles Cheddar");
    System.out.println("5) Miss Vickie's Jalapeno");

}

public void addOrder(Order order)
{

}

public Order getOrder()
{
    return order;
}

}
