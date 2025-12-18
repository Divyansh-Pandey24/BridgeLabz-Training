// Writing a code to check whether a number is positive, negative, or zero
// Create IsNumPosNegOrZero class

import java.util.Scanner;

public class IsNumPosNegOrZero{
 public static void main(String[] args){
 
 // Take input from a user
 Scanner input=new Scanner(System.in);
 System.out.print("Enter the number: ");
 int number=input.nextInt();
 
 // Logic to check  whether a number is positive, negative, or zero and displaying the result
 if(number>0){
  System.out.println("Positive");
 }
 else if(number<0){
  System.out.println("Negative");
 }
 else{
  System.out.println("Zero");
 }
 
 }
}