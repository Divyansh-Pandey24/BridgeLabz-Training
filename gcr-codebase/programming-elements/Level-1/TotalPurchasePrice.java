// Writing a code to calculate total purchase price
// Create TotalPurchasePrice class to calculate total purchase price

import java.util.Scanner;

public class TotalPurchasePrice{
 public static void main(String[] args){

  // Take unit price and quantity from user as Input
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the unit price of the item : ");
  double unitPrice = input.nextDouble();
  System.out.print("Enter the quantity to be bought : ");
  int quantity = input.nextInt();


  //Logic to Calculate total price
  double totalPrice = unitPrice * quantity;


  // Displaying the result
  System.out.println("The total purchase price is INR " + totalPrice +
                     " if the quantity is " + quantity +
                     " and unit price is INR " + unitPrice);

  input.close();
 }
}
