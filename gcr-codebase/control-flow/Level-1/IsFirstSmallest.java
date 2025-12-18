// Writing a code to check if the first number is the smallest
// Create IsFirstSmallest class

import java.util.Scanner;

public class IsFirstSmallest{
 public static void main(String[] args){

  // Take input from users
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the first number: ");
  int num1= input.nextInt();
  System.out.print("Enter the second number: ");
  int num2=input.nextInt();
  System.out.print("Enter the third number: ");
  int num3=input.nextInt();
  
  //Logic to find out if the first number is the smalllest using if-else
  if(num1<num2 && num1<num3){
    System.out.println("Is the first number the smallest? Yes");
   }
  else{
    System.out.println("Is the first number the smallest? No");
  }
  
 }
}