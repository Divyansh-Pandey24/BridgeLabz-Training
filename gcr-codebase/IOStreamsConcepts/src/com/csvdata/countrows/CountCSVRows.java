package com.csvdata.countrows;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/Student.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            String line;

            // Count data rows
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    recordCount++;
                }
            }

            System.out.println("Number of records (excluding header): " + recordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
