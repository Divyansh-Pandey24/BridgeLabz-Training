package com.day05.cropmonitor;
class SensorSorter {

    public static void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private static int partition(SensorData[] data, int low, int high) {

        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp <= pivot) {
                i++;

                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
