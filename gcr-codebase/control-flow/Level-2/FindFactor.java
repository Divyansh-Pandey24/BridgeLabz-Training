// Writing a program to find the factors of a number using while loop
// Create FindFactor class

import java.util.Scanner;

public class FindFactor {

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Logic to check positive integer and factors of the number and displaying the results
        if (number<=0) {
            System.out.println("Please enter a valid positive integer");
        } else {
            
            int i=1;
            System.out.println("Factors of " + number + " are:");

            while (i<number) {
                if (number%i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

    }
}
