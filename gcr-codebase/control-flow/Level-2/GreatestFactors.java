// Writing a code to print the greatest factor of a number beside itself using while loop
// Create GreatestFactors class

import java.util.Scanner;

public class GreatestFactors {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
      
        // Logic to find out the greatest factor
            int greatestFactor = 1;
            
            int counter=number-1;

            while (counter>=1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter-=1;
            }

        // Displaying the greatest factor
        System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);
        

    }
}
