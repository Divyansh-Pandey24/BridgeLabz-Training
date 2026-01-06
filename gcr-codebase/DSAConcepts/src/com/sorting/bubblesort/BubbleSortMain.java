package com.sorting.bubblesort;
public class BubbleSortMain {

    public static void main(String[] args) {

        int[] marksArray = {78, 45, 92, 60, 88};

        StudentMarks sm = new StudentMarks(marksArray);

        System.out.println("Before Sorting:");
        sm.displayMarks();

        BubbleSortStudentMarks sorter = new BubbleSortStudentMarks();
        sorter.bubbleSort(sm.getMarks());

        System.out.println("After Sorting:");
        sm.displayMarks();
    }
}
