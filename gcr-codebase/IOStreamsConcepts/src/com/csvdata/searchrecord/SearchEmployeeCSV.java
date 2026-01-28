package com.csvdata.searchrecord;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/Employee.csv";
        String searchName = "Michael Brown"; // name to search

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",");

                String name = columns[1];

                if (name.equalsIgnoreCase(searchName)) {

                    String department = columns[2];
                    int salary = Integer.parseInt(columns[3]);

                    System.out.println("Employee Name : " + name);
                    System.out.println("Department    : " + department);
                    System.out.println("Salary        : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found: " + searchName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
