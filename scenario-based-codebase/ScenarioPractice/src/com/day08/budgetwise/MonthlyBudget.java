package com.day08.budgetwise;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income) {
        super(income);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Budget Report -----");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }
}
