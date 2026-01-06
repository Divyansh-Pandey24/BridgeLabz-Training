package com.sorting.insertionsort;
public class IsertionSortMain {

    public static void main(String[] args) {

        // Unsorted employee IDs
        int[] ids = {105, 12, 67, 3, 89};

        EmployeeData data = new EmployeeData(ids);

        System.out.println("Before Sorting:");
        data.displayIds();

        InsertionSortEmployeeData sortService = new InsertionSortEmployeeData();
        sortService.insertionSort(data.getEmployeeIds());

        System.out.println("After Sorting:");
        data.displayIds();
    }
}
