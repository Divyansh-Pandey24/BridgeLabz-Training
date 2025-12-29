/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        String choice;

        System.out.println("===== PHONE RECHARGE SIMULATOR =====");

        do {
            System.out.print("\nEnter Mobile Operator (Jio/Airtel/VI/BSNL): ");
            String operator = sc.next();

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            // Add amount to balance
            balance += amount;

            System.out.println("\n---- Recharge Offer ----");

            switch (operator.toLowerCase()) {

                case "jio":
                    System.out.printf("Operator : Jio\nCashback : Rs%.2f\nData Offer : 2GB/day\n", amount * 0.05);
                    break;

                case "airtel":
                    System.out.printf("Operator : Airtel\nCashback : Rs%.2f\nData Offer : 1.5GB/day\n", amount * 0.04);
                    break;

                case "vi":
                    System.out.printf("Operator : VI\nCashback : Rs%.2f\nData Offer : 2GB/day + Weekend rollover\n", amount * 0.03);
                    break;

                case "bsnl":
                    System.out.printf("Operator : BSNL\nCashback : Rs%.2f\nData Offer : 1GB/day\n", amount * 0.06);
                    break;

                default:
                    System.out.println("Invalid Operator — No Offer Available");
            }


            System.out.printf("\nCurrent Wallet Balance: Rs%.2f\n", balance);

            // Loop decision
            System.out.print("\nDo you want another recharge? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\n===== Thank you for using Recharge Simulator =====");
        sc.close();
    }
}
