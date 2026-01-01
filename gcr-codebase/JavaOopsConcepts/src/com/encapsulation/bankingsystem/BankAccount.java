package com.encapsulation.bankingsystem;

public abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}

