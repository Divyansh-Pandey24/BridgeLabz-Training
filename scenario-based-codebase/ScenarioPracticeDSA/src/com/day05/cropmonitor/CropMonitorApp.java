package com.day05.cropmonitor;
public class CropMonitorApp {

    public static void main(String[] args) {

        SensorData[] readings = {
            new SensorData(1705401200L, 24.5),
            new SensorData(1705400900L, 22.1),
            new SensorData(1705401500L, 26.3),
            new SensorData(1705400600L, 21.8),
            new SensorData(1705401300L, 25.0)
        };

        System.out.println("Before Sorting");
        for (SensorData s : readings) {
            s.display();
        }

        SensorSorter.quickSort(readings, 0, readings.length - 1);

        System.out.println("\nAfter Sorting by Timestamp");
        for (SensorData s : readings) {
            s.display();
        }
    }
}
