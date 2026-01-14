package com.day08.budgetwise;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income) {
        super(income);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Report =====");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual overspending analysis:");
        super.detectOverspend();   // calls Budget logic
    }
}

