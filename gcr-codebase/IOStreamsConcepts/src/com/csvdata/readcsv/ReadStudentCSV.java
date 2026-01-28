package com.csvdata.readcsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/Student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] columns = line.split(",");

                int id = Integer.parseInt(columns[0]);
                String name = columns[1];
                int age = Integer.parseInt(columns[2]);
                int marks = Integer.parseInt(columns[3]);

                System.out.println("Student ID : " + id);
                System.out.println("Name       : " + name);
                System.out.println("Age        : " + age);
                System.out.println("Marks      : " + marks);
                System.out.println("-------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
