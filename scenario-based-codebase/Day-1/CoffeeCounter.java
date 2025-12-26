import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double GST_RATE = 0.18;
        System.out.println("Available Coffee Types: espresso, latte, cappuccino");
        System.out.println("Type 'exit' to stop.");

        while (true) {

            System.out.print("Enter coffee type: ");
            String coffeeType = sc.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Cafe closed. Thank you for visiting!");
                break;
            }

            double pricePerCup;

            // switch for coffee type
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 170;
                    break;
                default:
                    System.out.println("This type of coffe is not available. Please try again.");
                    continue; 
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = pricePerCup * quantity; 
            double gst = total * GST_RATE; 
            double finalBill = total + gst; 

            System.out.println("----- Bill Details -----");
            System.out.println("Coffee Type  : " + coffeeType);
            System.out.println("Price/Cup    : " + pricePerCup);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Total Amount : " + total);
            System.out.println("GST (18%)    : " + gst);
            System.out.println("Final Bill   : " + finalBill);
            System.out.println("------------------------");
        }

        sc.close();
    }
}
