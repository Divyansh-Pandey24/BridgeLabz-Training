package com.sorting.bubblesort;
public class StudentMarks {

    private int[] marks;

    public StudentMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void displayMarks() {
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
