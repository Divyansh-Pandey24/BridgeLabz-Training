package com.sorting.selectionsort;

public class SelectionSortMain {

	public static void main(String[] args) {

        int[] examScores = {85, 42, 96, 73, 60};

        ExamScores scores = new ExamScores(examScores);

        System.out.println("Before Sorting:");
        scores.displayScores();

        SelectionSortExamStore sorter = new SelectionSortExamStore();
        sorter.selectionSort(scores.getScores());

        System.out.println("After Sorting:");
        scores.displayScores();
    }
}
