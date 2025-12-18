// Writing a code to check the largest number among three numbers
// Create LargestNumber class

import java.util.Scanner;

public class LargestNumber{

  public static void main(String[] args){

      //Take input from users
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int num1= input.nextInt();
      System.out.print("Enter the second number: ");
      int num2= input.nextInt();
      System.out.print("Enter the third number: ");
      int num3= input.nextInt();
  
      // Logic to find out the greatest number among three numbers and displaying the results
      if(num1>num2 && num1>num3){
      System.out.println("Is the first number the largest? Yes");
      System.out.println("Is the second number the largest? No");
      System.out.println("Is the third number the largest? No");
      }
      else if(num2>num1 && num2>num3){
      System.out.println("Is the first number the largest? No");
      System.out.println("Is the second number the largest? Yes");
      System.out.println("Is the third number the largest? No");
      }
      else if(num3>num1 && num3>num2){
      System.out.println("Is the first number the largest? No");
      System.out.println("Is the second number the largest? No");
      System.out.println("Is the third number the largest? Yes");

      }
  
  }
}