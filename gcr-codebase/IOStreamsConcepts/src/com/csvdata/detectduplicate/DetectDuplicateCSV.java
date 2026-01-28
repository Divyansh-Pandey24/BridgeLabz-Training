package com.csvdata.detectduplicate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/students.csv";
        Set<String> seenIds = new HashSet<>();

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

                // Check for duplicate ID
                if (seenIds.contains(id)) {
                    System.out.println("Duplicate record found:");
                    System.out.println(line);
                    System.out.println("-------------------------");
                } else {
                    seenIds.add(id);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
