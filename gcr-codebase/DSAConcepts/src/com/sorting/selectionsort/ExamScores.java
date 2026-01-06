package com.sorting.selectionsort;
public class ExamScores {

    private int[] scores;

    public ExamScores(int[] scores) {
        this.scores = scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void displayScores() {
        for (int s : scores) {
            System.out.print(s + "  ");
        }
        System.out.println();
    }
}
