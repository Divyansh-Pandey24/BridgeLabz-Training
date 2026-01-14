package com.day08.budgetwise;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected HashMap<String, Double> categoryLimits;
    protected ArrayList<Transaction> transactions;

    public Budget(double income) {
        this.income = income;
        categoryLimits = new HashMap<>();
        transactions = new ArrayList<>();
    }

   
    public void addCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double calculateSavings() {
        return income - getTotalExpenses();
    }

    @Override
    public void detectOverspend() {
        for (String category : categoryLimits.keySet()) {
            double spent = 0;

            for (Transaction t : transactions) {
                if (t.getCategory().equals(category) &&
                    t.getType().equalsIgnoreCase("expense")) {
                    spent += t.getAmount();
                }
            }

            if (spent > categoryLimits.get(category)) {
                System.out.println("Overspending in " + category);
            }
        }
    }
}
