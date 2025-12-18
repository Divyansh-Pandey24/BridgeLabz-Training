// Writing a code to find the sum of n natural numbers
// Create SumNaturalNumbers class

import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static void main(String[] args) {

        // Take input from users
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= input.nextInt();

        if(number<1) {
           System.out.println("The number is not a natural number");
        } else { 
             // Create a variable to store the sum of natural numbers
             int sum=0;
          
            // Create a variable to store the sum using formual
            int naturalSumFor= (number * (number+1))/2;

            for (int i=number; i>=1; i--) {

              // Adding the number in sum
              sum=sum+i;
          
            }
        
            if (sum==naturalSumFor) {
               System.out.println("Correct");
            }

        }
   
        
    }
}