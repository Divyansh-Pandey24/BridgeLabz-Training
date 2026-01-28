package com.csvdata.readlargecsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVInChunks {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/Large.csv";
        int totalRecordsProcessed = 0;

        List<String> buffer = new ArrayList<>(CHUNK_SIZE);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                buffer.add(line);

                // Process chunk when buffer reaches 100 lines
                if (buffer.size() == CHUNK_SIZE) {
                    processChunk(buffer);
                    totalRecordsProcessed += buffer.size();
                    buffer.clear();
                }
            }

            // Process remaining lines (less than 100)
            if (!buffer.isEmpty()) {
                processChunk(buffer);
                totalRecordsProcessed += buffer.size();
                buffer.clear();
            }

            System.out.println("Total records processed: " + totalRecordsProcessed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Simulated processing logic
    private static void processChunk(List<String> chunk) {
        // Example: just count or parse rows
        System.out.println("Processed chunk of size: " + chunk.size());
    }
}
