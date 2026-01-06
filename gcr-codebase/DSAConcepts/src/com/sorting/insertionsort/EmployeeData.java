package com.sorting.insertionsort;
public class EmployeeData {

    private int[] employeeIds;

    public EmployeeData(int[] employeeIds) {
        this.employeeIds = employeeIds;
    }

    public int[] getEmployeeIds() {
        return employeeIds;
    }

    public void displayIds() {
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
