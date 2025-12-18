// Writing a program to find the power of a number using for loop.
// Create PowerOfNumber class

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
 
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Logic to check whether the number is positive or not and calculate the power
        if (number <= 0 || power < 0) {
            System.out.println("The number is not positive, enter a valid number");
        } else {

            int result = 1;

            for (int i= 1; i<= power; i++) {
                result = result * number;
            }

            // Displaying the result
            System.out.println("The answer is: " + result);
        }

    }
}
