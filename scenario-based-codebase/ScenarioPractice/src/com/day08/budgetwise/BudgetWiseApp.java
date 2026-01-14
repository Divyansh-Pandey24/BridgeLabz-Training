package com.day08.budgetwise;

import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        Budget budget = new MonthlyBudget(income);

        System.out.print("How many budget categories? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter category name: ");
            String cat = sc.nextLine();

            System.out.print("Enter limit for " + cat + ": ");
            double limit = sc.nextDouble();
            sc.nextLine();

            budget.addCategoryLimit(cat, limit);
        }

        while (true) {
            System.out.println("\n===== BudgetWise Menu =====");
            System.out.println("1. Add Transaction");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspend");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 4) {
                System.out.println("Exiting BudgetWise...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter type (income/expense): ");
                    String type = sc.nextLine();

                    System.out.print("Enter date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();

                    budget.addTransaction(new Transaction(amt, type, date, cat));
                    System.out.println("Transaction added!");
                    break;

                case 2:
                    budget.generateReport();
                    break;

                case 3:
                    budget.detectOverspend();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
