package com.sorting.heapsort;
public class JobApplicants {

    private double[] salaries;

    public JobApplicants(double[] salaries) {
        this.salaries = salaries;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void displaySalaries() {
        for (double s : salaries) {
            System.out.print(s + "  ");
        }
        System.out.println();
    }
}
