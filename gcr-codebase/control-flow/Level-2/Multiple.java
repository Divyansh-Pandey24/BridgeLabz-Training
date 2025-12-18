// Writing a program to find all the multiples of a number below 100 using while loop
// Create Multiple class

import java.util.Scanner;

public class Multiple {

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
            int counter= 100;
            while (counter>1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                    
                }
                counter-=1;
            }
        }

    }
}
