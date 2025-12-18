// Writing a program to find the youngest and tallest among Amar, Akbar, and Anthony.
// Create TallestAndYoungest class

import java.util.Scanner;

public class TallestAndYoungest {

    public static void main(String[] args) {

        // Take inputs from the user
        // Take age inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // Taking height inputs
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // Logic to find out the youngest friend
        if (amarAge<=akbarAge && amarAge<=anthonyAge) {
            System.out.println("Amar is the youngest friend.");
        } else if (akbarAge<=amarAge && akbarAge<=anthonyAge) {
            System.out.println("Akbar is the youngest friend.");
        } else {
            System.out.println("Anthony is the youngest friend.");
        }

        // Logic to find out the tallest friend
        if (amarHeight>=akbarHeight && amarHeight>=anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } else if (akbarHeight>=amarHeight && akbarHeight>=anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } else {
            System.out.println("Anthony is the tallest friend.");
        }

    }
}
