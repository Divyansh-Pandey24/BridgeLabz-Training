// Writing a code to calculate profit and loss

// Create CalProfitAndLoss class to calculate profit and loss
public class CalProfitAndLoss
{
  public static void main(String []args)
  {
     // Create a variable to indicate Cost Price and Selling Price
     double costPrice= 129, sellingPrice=191;
     
     // Create a variable to indicate Profit
     double profit= sellingPrice-costPrice;
     
     // Create a variable to indicate Profit Percentage
     double profitPercentage= profit/costPrice*100;

    // Print the Cost price, Selling Price, Profit and Profit Percentage
    System.out.println("The Cost Price is INR " + costPrice+
                           " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
                           );
    
    }
}