// Writing a program to find the power of a number using while loop
// Create PowerOfNumbers class

import java.util.Scanner;

public class PowerOfNumbers {

    public static void main(String[] args) {
 
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Logic to check whether the number is positive or not and calculate the power
        if (number<= 0 || power< 0) {
            System.out.println("The number is not positive, enter a valid number");
        } else {

            int result = 1;
            int counter = 0;

            while (counter<power) {
                result = result * number;
                // Incrementing the value of counter
                counter+=1;
            }

            // Displaying the result
            System.out.println("The answer is: " + result);
        }

    }
}
