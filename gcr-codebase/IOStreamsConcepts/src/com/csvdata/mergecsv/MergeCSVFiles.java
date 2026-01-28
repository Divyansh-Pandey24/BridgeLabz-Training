package com.csvdata.mergecsv;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "src/com/csvdata/Student.csv";
        String file2 = "src/com/csvdata/Student1.csv";
        String outputFile = "students_merged.csv";

        // Map to store data from first CSV
        Map<String, String[]> studentMap = new HashMap<>();

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read and skip header of students1.csv
            br1.readLine();

            // Load students1.csv into map
            while ((line = br1.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String age = data[2];

                studentMap.put(id, new String[]{name, age});
            }

            // Write header for merged CSV
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            // Read and skip header of students2.csv
            br2.readLine();

            // Merge with students2.csv
            while ((line = br2.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String marks = data[1];
                String grade = data[2];

                // Match ID from first CSV
                if (studentMap.containsKey(id)) {

                    String[] studentInfo = studentMap.get(id);
                    String name = studentInfo[0];
                    String age = studentInfo[1];

                    bw.write(id + "," + name + "," + age + "," + marks + "," + grade);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
