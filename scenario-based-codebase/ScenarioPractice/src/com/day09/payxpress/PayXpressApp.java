package com.day09.payxpress;

import java.util.Scanner;

public class PayXpressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Bill Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Internet");

        int choice = sc.nextInt();

        System.out.println("Enter Bill Amount:");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Due Date:");
        String date = sc.nextLine();

        Bill bill = null;

        if (choice == 1)
            bill = new ElectricityBill(amount, date);
        else if (choice == 2)
            bill = new WaterBill(amount, date);
        else if (choice == 3)
            bill = new InternetBill(amount, date);
        else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("\n--- Bill Details ---");
        System.out.println("Type: " + bill.getType());
        System.out.println("Amount: " + bill.getAmount());
        System.out.println("Due Date: " + bill.getDueDate());

        bill.sendReminder();

        System.out.println("\nDo you want to pay the bill? (yes/no)");
        String pay = sc.nextLine();

        if (pay.equalsIgnoreCase("yes")) {
            bill.pay(bill);
            return;
        }

        System.out.println("\nAdd late fee? Enter penalty amount:");
        double penalty = sc.nextDouble();

        System.out.println("Total with Late Fee: " + bill.calculateLateFee(penalty));
    }
}
