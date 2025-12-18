// Writing a code print odd and even numbers between 1 to the number entered by the user.
// Create PrintOddEvenNumbers class

import java.util.Scanner;

public class PrintOddEvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Logic to Check the natural numbers
        if(number<1){
           System.out.println("It is not a natural number");
        } else {
            
           // Loop from 1 to the given number
          for (int i = 1; i <=number; i++) {

              // Checking odd and even numbers
              if (i % 2 ==0) {
                  System.out.println(i + " is an Even number");
              } else {
                    System.out.println(i + " is an Odd number");
              }
          }


        }

        
    }
}
