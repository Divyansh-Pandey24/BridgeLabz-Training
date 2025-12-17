// Writing a code to perform addition, substraction, multiplication, and division
// Create BasicCalculator class to perform addition, substraction, multiplication, and division

import java.util.Scanner;
public class BasicCalculator{
 public static void main(String[] args){

  // Input numbers num1 and num2
 Scanner input=new Scanner(System.in);
System.out.print("Enter the first number : ");
 double num1=input.nextDouble();
System.out.print("Enter the second number : ");
 double num2=input.nextDouble();
 
 // Logic for addition, substraction, multiplication, and division
 double addition= num1+num2;
 double substraction= num1-num2;
 double multiplication= num1*num2;
 double division= num1/num2;

 // Displaying the results
 System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + addition+", "+ substraction+", "+ multiplication+", "+" and "+division);
 
 }
}