// Writing a program to print multiple of 3 and 5 and both using while loop
// Create BuzzFizz class

import java.util.Scanner;

public class BuzzFizz {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Logic to Check for positive integer and displaying the results
        if (number<=0) {
            System.out.println("Please enter a correct positive integer");
        } else {
          
            int i=1;

            // Printing the multiples of 3, 5 and both
            while (i<=number) {

                if (i % 3==0 && i % 5== 0) {
                    System.out.println("FizzBuzz");
                } else if (i%3== 0) {
                    System.out.println("Fizz");
                } else if (i%5== 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                
                i++;
            }
        }

    }
}
