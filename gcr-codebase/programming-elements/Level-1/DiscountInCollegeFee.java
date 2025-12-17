//Writing a code to calculate the discounted amount and discounted price

// Create DiscountInCollegeFee class to calculate the discounted amount and discounted price
 public class DiscountInCollegeFee
{
  public static void main(String []args)
  {
     // Create a variable to indicate fee
     int fee=125000;
    
     // Create a variable to indicate discount Percentage
     int discounPercen=10;

    // Create a variable to indicate discounted Amount
     double discountedAmount= fee*10/100;
    
   // Create a variable to indicate final discounted fee
    double finalDiscounFee= fee-discountedAmount;
   
   // Print discounted amount and final discounted fee
    System.out.println("The discounted amount is INR "+discountedAmount+" and final discounted fee is INR "+finalDiscounFee);
   }
}
   
