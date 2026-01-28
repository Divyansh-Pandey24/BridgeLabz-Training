package com.csvdata.validatecsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateCSVData {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/users.csv";

        // Regex patterns
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",");

                String id = columns[0];
                String name = columns[1];
                String email = columns[2];
                String phone = columns[3];

                boolean isValid = true;
                StringBuilder errorMessage = new StringBuilder();

                // Email validation
                if (!email.matches(emailRegex)) {
                    isValid = false;
                    errorMessage.append("Invalid Email ");
                }

                // Phone number validation
                if (!phone.matches(phoneRegex)) {
                    isValid = false;
                    errorMessage.append("Invalid Phone Number ");
                }

                // Print invalid rows
                if (!isValid) {
                    System.out.println("Invalid Row Found:");
                    System.out.println("Row Data : " + line);
                    System.out.println("Error    : " + errorMessage.toString().trim());
                    System.out.println("-----------------------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
