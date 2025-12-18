// Writing a program to find all the multiples of a number below 100
// Create Multiples class

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Logic to check whether the input is correct or not and checking the multiples
        if (number<= 0 || number>= 100) {
            System.out.println("The number is not valid");
        } else {

            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i =100; i>= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
