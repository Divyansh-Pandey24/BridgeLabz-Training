package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate;

    // Constructor to initialize savings account
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest for savings account
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    // Apply for loan for savings account
    @Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    // Check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 20000;
    }
}

