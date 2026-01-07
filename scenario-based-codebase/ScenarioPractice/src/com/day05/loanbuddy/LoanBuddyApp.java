package com.day05.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LoanBuddy – Apply For Loan =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.println("\n1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Choose Loan Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Loan Term (in months): ");
        int term = sc.nextInt();

        // Create applicant
        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        // Create loan object (very simple)
        LoanApplication loan = null;

        if (type == 1) {
            loan = new HomeLoan(applicant, term);
        } else if (type == 2) {
            loan = new AutoLoan(applicant, term);
        } else {
            loan = new PersonalLoan(applicant, term);
        }

        // Check approval
        boolean approved = loan.approveLoan();

        if (approved) {
            double emi = loan.calculateEMI();
            System.out.println("\nLoan Approved");
            System.out.println("Your EMI = " + String.format("%.2f", emi));
        } else {
            System.out.println("\nLoan Rejected");
        }

        sc.close();
    }
}
