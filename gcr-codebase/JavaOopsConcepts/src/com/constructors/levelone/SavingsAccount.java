package com.constructors.levelone;

public class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC1001", "Neha", 50000);
        sa.deposit(2000);
        sa.withdraw(3000);
        sa.displayAccount();
    }
}

