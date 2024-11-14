package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RecieptFileManager {

    public void saveOrder(){

    }

    public void printReciept(Order order)
    {
        File file = new File("receipts.txt");
        try
        {
            if (!file.exists())
            {
                file.createNewFile();
            } else
            {
                FileWriter fileWriter = new FileWriter("receipts.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(order.toString());
                bufferedWriter.close();
                System.out.println("Thank you for your money! Have a good day!");
            }
        } catch (Exception e) {
            System.err.println("Error creating file");
            e.printStackTrace();
        }




    }
