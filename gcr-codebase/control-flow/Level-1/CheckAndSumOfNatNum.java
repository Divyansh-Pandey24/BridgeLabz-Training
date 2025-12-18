// Writing a code to check if the numbers are natural or not, and finding the sum of the natural numbers
// Create CheckAndSumOfNatNum class

import java.util.Scanner;

public class CheckAndSumOfNatNum{
 public static void main(String[] args){
  
  // Take input from users
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the number: ");
  int number=input.nextInt();
  
  // Logic to find out the sum and verifying the number
  if(number<0){
   System.out.println("The number "+number+" is not a natural number");
  }
  else{
   // Create a variable to store the the sum of natural number
   int sumOfNatuNumbers= number * (number+1)/2;
   System.out.println("The sum of "+number+" natural numbers is "+sumOfNatuNumbers);
  }
  
 
 }
}