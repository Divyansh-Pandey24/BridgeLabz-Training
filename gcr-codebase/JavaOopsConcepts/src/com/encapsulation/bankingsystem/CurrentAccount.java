package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private double interestRate;

    // Constructor to initialize current account
    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest for current account
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    // Apply for loan for current account
    @Override
    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }

    // Check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

