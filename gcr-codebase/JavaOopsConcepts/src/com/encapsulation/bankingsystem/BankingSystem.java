package com.encapsulation.bankingsystem;

public class BankingSystem {

    // Method to process account and display interest
    public static void processAccount(BankAccount account) {

        double interest = account.calculateInterest();

        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Holder Name    : " + account.getHolderName());
        System.out.println("Balance        : " + account.getBalance());
        System.out.println("Interest       : " + interest);
        System.out.println();
    }

    // Main method to test polymorphism
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("ACC101", "Rohan", 30000, 0.04);
        BankAccount a2 = new CurrentAccount("ACC102", "Sneha", 80000, 0.02);

        processAccount(a1);
        processAccount(a2);
    }
}

