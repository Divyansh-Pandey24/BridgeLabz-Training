package com.inheritance.hierarchical.bankaccounttypes;

public class BankAccountTypes {

    public static void main(String[] args) {

        // Hierarchical inheritance demonstration
        BankAccount acc1 = new SavingsAccount("SB1445", 545000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA2002", 31200, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD3345", 20120, 5);

        acc1.displayDetails();
        acc1.displayAccountType();
        System.out.println("----------------------");

        acc2.displayDetails();
        acc2.displayAccountType();
        System.out.println("----------------------");

        acc3.displayDetails();
        acc3.displayAccountType();
    }
}
