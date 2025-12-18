// Writing a code to print the greatest factor of a number beside itself using for loop
// Create GreatestFactor class

import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
      
        // Logic to find out the greatest factor
            int greatestFactor = 1;

            for (int i =number-1; i >=1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

        // Displaying the greatest factor
        System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);
        

    }
}
