package com.day02.mybank;
public class CurrentAccount extends Account {

    private double interestRate = 2.0;

    public CurrentAccount(String accNo) {
        super(accNo);
    }

    public CurrentAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * interestRate) / 100;
    }
}
