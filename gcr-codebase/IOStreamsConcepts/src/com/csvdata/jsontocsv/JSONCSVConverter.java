package com.csvdata.jsontocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONCSVConverter {

    public static void main(String[] args) {
        convertJSONToCSV();
        convertCSVToJSON();
    }

    // Convert JSON file to CSV
    public static void convertJSONToCSV() {

        String jsonFile = "src/com/csvdata/students.json";
        String csvFile = "src/com/csvdata/students.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
             FileWriter writer = new FileWriter(csvFile)) {

            // Write CSV header
            writer.write("ID,Name,Age,Marks\n");

            String line;

            while ((line = reader.readLine()) != null) {

                line = line.trim();

                // Skip array brackets
                if (line.startsWith("[") || line.startsWith("]") || line.isEmpty()) {
                    continue;
                }

                // Remove JSON symbols
                line = line.replace("{", "")
                           .replace("}", "")
                           .replace("\"", "")
                           .replace(",", ",");

                String[] fields = line.split(",");

                String id = fields[0].split(":")[1];
                String name = fields[1].split(":")[1];
                String age = fields[2].split(":")[1];
                String marks = fields[3].split(":")[1];

                writer.write(id + "," + name + "," + age + "," + marks + "\n");
            }

            System.out.println("JSON to CSV conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error converting JSON to CSV");
            e.printStackTrace();
        }
    }

    // Convert CSV file to JSON
    public static void convertCSVToJSON() {

        String csvFile = "src/com/csvdata/students.csv";
        String jsonFile = "src/com/csvdata/students.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile));
             FileWriter writer = new FileWriter(jsonFile)) {

            String line;
            boolean isHeader = true;

            writer.write("[\n");

            boolean firstRecord = true;

            while ((line = reader.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] arr = line.split(",");

                if (!firstRecord) {
                    writer.write(",\n");
                }

                writer.write("  {");
                writer.write("\"ID\":" + arr[0] + ",");
                writer.write("\"Name\":\"" + arr[1] + "\",");
                writer.write("\"Age\":" + arr[2] + ",");
                writer.write("\"Marks\":" + arr[3]);
                writer.write("}");

                firstRecord = false;
            }

            writer.write("\n]");
            System.out.println("CSV to JSON conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error converting CSV to JSON");
            e.printStackTrace();
        }
    }
}
