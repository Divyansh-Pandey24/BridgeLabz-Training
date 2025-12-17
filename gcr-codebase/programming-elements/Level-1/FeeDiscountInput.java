// Writing a code to calculate fee discount using user input

import java.util.Scanner;

// Create FeeDiscountInput class to calculate fee discount using user input
public class FeeDiscountInput{

  public static void main(String[] args){

     Scanner input = new Scanner(System.in);

     // Create variables to indicate fee and discountpercent
     double fee, discountPercent;

     System.out.print("Enter fee: ");
     fee = input.nextDouble();

     System.out.print("Enter discount percentage: ");
     discountPercent = input.nextDouble();
      
     // Create variables to indicate discount and finalFee
     double discount = fee*discountPercent/100;
     double finalFee = fee-discount;



 
     // Print discount amount and final discounted fee
     System.out.println("The discount amount is INR " + discount +
                        " and final discounted fee is INR " + finalFee);
  }
}
