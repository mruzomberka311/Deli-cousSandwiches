package com.pluralsight;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecieptFileManager {


    public void printReciept(Order order) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String fmtDate = current.format(fmt);
        String path = "C:\\Users\\mer3l\\OneDrive - Year Up- BOS\\Desktop\\Pluralsight\\capstones\\Deli-cousSandwiches\\Deli-cousSandwiches\\receipts";
        File file = new File(path,fmtDate + ".txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(order.toString());
            bufferedWriter.close();

            System.out.println("Thank you for your money! Have a good day!");

        } catch (Exception e) {
            System.err.println("Error creating file");
            e.printStackTrace();
        }

    }
}
