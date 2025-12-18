// Writing a code to check if a number is divisible by 5
// Create DivisibleByFive class

import java.util.Scanner;

public class DivisibleByFive{
 public static void main(String[] args){

  // Take input from users
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the number: ");
  int num= input.nextInt();


  // Logic to check if it is divisible by using if-else and displaying
  if(num%5==0){
    System.out.println("Is the number "+num+" divisible by 5? Yes");
    }
   else{
     System.out.println("Is the number "+num+" divisible by 5? No");
    }
 
 }
}