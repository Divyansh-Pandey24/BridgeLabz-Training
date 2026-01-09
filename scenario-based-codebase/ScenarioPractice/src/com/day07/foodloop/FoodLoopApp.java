package com.day07.foodloop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem i1 = new VegItem("Paneer Pizza", 300, 10);
        FoodItem i2 = new NonVegItem("Chicken Burger", 250, 10);
        FoodItem i3 = new VegItem("Veg Pasta", 200, 10);
        FoodItem i4 = new NonVegItem("Grilled Chicken", 400, 10);
        FoodItem i5 = new VegItem("French Fries", 150, 10);

        List<FoodItem> menu = new ArrayList<>();
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);

        Order order = new Order();

        while (true) {

            System.out.println("Menu");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getName() + " Price " + menu.get(i).getPrice());
            }
            System.out.println("6. Create Combo");
            System.out.println("7. Place Order");
            System.out.println("8. Cancel Order");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                order.addItem(menu.get(choice - 1));
                System.out.println("Item added");
            }
            else if (choice == 6) {

                List<FoodItem> comboItems = new ArrayList<>();

                System.out.println("Enter two item numbers for combo");

                int a = sc.nextInt();
                int b = sc.nextInt();

                comboItems.add(menu.get(a - 1));
                comboItems.add(menu.get(b - 1));

                System.out.print("Enter combo price: ");
                double price = sc.nextDouble();

                ComboMeal combo = new ComboMeal(comboItems, price);
                order.addCombo(combo);

                System.out.println("Combo added");
            }
            else if (choice == 7) {
                order.placeOrder();
                break;
            }
            else if (choice == 8) {
                order.cancelOrder();
                break;
            }
        }

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Final Amount: " + order.getFinalAmount());

        sc.close();
    }
}
