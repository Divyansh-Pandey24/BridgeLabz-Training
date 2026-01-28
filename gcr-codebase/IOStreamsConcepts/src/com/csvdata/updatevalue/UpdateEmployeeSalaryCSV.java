package com.csvdata.updatevalue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

    public static void main(String[] args) {

        String inputFile = "src/com/csvdata/Employee.csv";
        String outputFile = "src/com/csvdata/Employee_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read and write header
            line = br.readLine();
            bw.write(line);
            bw.newLine();

            // Process data rows
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",");

                String id = columns[0];
                String name = columns[1];
                String department = columns[2];
                double salary = Double.parseDouble(columns[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                bw.write(id + "," + name + "," + department + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("Salary update completed. Updated file created.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
