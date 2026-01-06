package com.sorting.insertionsort;
public class InsertionSortEmployeeData {

    // Method to perform insertion sort
    public void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];     
            int j = i - 1;           

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }
}
