package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
Scanner scanner = new Scanner(System.in);




public void displayMenu(){
    System.out.println("Welcome to the Krusty Krab my name is Squidwarddd. How may I help you?");
    int choice = scanner.nextInt();

    //display the menu

    switch (choice){
        case 1:
            //order a sandwich
            break;
        case 2:
            //order drink
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

public void addOrder(){

}

public Order getOrder(){

}

}
