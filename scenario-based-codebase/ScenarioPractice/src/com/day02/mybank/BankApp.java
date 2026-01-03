package com.day02.mybank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- Savings Account ---
        System.out.print("Enter Savings Account Number: ");
        String sAcc = sc.nextLine();

        System.out.print("Enter Opening Balance for Savings: ");
        double sBal = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sAcc, sBal);

        System.out.print("Enter amount to deposit in Savings: ");
        sa.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw from Savings: ");
        sa.withdraw(sc.nextDouble());

        System.out.println("Savings Balance: " + sa.checkBalance());
        System.out.println("Savings Interest: " + sa.calculateInterest());

        sc.nextLine(); // clear buffer

        // --- Current Account ---
        System.out.print("\nEnter Current Account Number: ");
        String cAcc = sc.nextLine();

        System.out.print("Enter Opening Balance for Current: ");
        double cBal = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(cAcc, cBal);

        System.out.print("Enter amount to deposit in Current: ");
        ca.deposit(sc.nextDouble());

        System.out.println("Current Balance: " + ca.checkBalance());
        System.out.println("Current Interest: " + ca.calculateInterest());

        sc.close();
    }
}
