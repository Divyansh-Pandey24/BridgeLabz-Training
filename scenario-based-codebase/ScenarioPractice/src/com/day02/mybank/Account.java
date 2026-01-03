package com.day02.mybank;

public class Account implements ITransaction {

    protected String accountNumber;
    private double balance;   // Encapsulated

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public double calculateInterest() {
        return 0;   // Overridden in child classes
    }
}
