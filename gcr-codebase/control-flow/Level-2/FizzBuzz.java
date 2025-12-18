// Writing a program to print multiple of 3 and 5 and both using for loop
// Create FizzBuzz class

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Logic to Check for positive integer and displaying the results
        if (number<=0) {
            System.out.println("Please enter a correct positive integer");
        } else {

            // Printing the multiples of 3, 5 and both
            for (int i=1; i<=number; i++) {

                if (i % 3==0 && i % 5== 0) {
                    System.out.println("FizzBuzz");
                } else if (i%3== 0) {
                    System.out.println("Fizz");
                } else if (i%5== 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

    }
}
