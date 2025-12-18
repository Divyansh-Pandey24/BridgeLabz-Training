// Writing a program to find the multiplication table of a number from 6 to 9.
// Create MultiplicatioTable

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Logic for printing the  table of a number from 6 to 9 and displaying the result
        for (int i=6; i<=9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
