/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
        // discount based on the bill
        double DISCOUNT_10 = 0.10;
        double DISCOUNT_20 = 0.20;
        double DISCOUNT_30 = 0.30;


        // Available catalog items
        String[] catalog = {
            "Maggie", "Bread", "Milk", "Eggs", "Biscuits",
            "Rice", "Sugar", "Tea", "Oil", "Chips"
        };

        System.out.println("========= SHOP CATALOG =========");
        System.out.println("We have the following items:");
        for (String item : catalog) {
            System.out.println("- " + item);
        }

        System.out.println("\nType item name to add to cart.");
        System.out.println("Type 'close' to finish shopping.");
        System.out.println("================================\n");

        double totalBill = 0;
       
        // Loops runs continuously until user puts close
        for (; ;) {

            System.out.print("Enter item name: ");
            String item = sc.next();

            // Exit shopping
            if (item.equalsIgnoreCase("close")) {
                break;
            }

            System.out.print("Enter price of " + item + ": ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity of " + item + ": ");
            int quantity = sc.nextInt();

            // Add to total
            totalBill += price * quantity;

            System.out.println("Item added successfully!\n");
        }

        double discount = 0;

        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 2000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 10000) {
            discount = totalBill * DISCOUNT_30;
        }

        double finalAmount = totalBill - discount;

        System.out.println("\n========== BILL SUMMARY ==========");
        System.out.printf("Total Bill      : Rs%.2f\n", totalBill);
        System.out.printf("Discount Applied: Rs%.2f\n", discount);
        System.out.printf("Final Amount    : Rs%.2f\n", finalAmount);
        System.out.println("==================================");

        sc.close();
    }
}
