package com.day02.mybank;
public class SavingsAccount extends Account {

    private double interestRate = 4.0;   // Example %

    public SavingsAccount(String accNo) {
        super(accNo);
    }

    public SavingsAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * interestRate) / 100;
    }
}
