package com.csvdata.employeecsv;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/Employee.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Write employee records
            bw.write("101,John Doe,Engineering,60000");
            bw.newLine();

            bw.write("102,Jane Smith,HR,50000");
            bw.newLine();

            bw.write("103,Michael Brown,Marketing,55000");
            bw.newLine();

            bw.write("104,Alice Williams,Finance,62000");
            bw.newLine();

            bw.write("105,Bob Johnson,Sales,58000");
            bw.newLine();

            System.out.println("CSV file created and data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
