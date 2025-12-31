/*18. Currency Exchange Kiosk 
Design a currency converter:
 Take INR amount and target currency.
 Use a switch to apply the correct rate.
 Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

public class CurrencyExchangeKiosk {

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    char choice;
    System.out.println("===================================");
    System.out.println("          Currency Exchange            ");
    System.out.println("===================================");


    do {

      // Take the user inputs
      System.out.print("Enter amount in INR: ");
      double inrAmount = sc.nextDouble();

      System.out.print("Enter target currency code (USD, EUR, GBP, JPY, AED): ");
      String currency = sc.next().toUpperCase();

      double convertedAmount = 0.0;
      String targetCurrencyName = "";

      switch (currency) {
        case "USD":
          convertedAmount = inrAmount / 89.80;
          targetCurrencyName = "USD";
          break;
        case "EUR":
          convertedAmount = inrAmount / 105.80;
          targetCurrencyName = "EUR";
          break;
        case "GBP":
          convertedAmount = inrAmount / 121.30;
          targetCurrencyName = "GBP";
          break;
        case "JPY":
          convertedAmount = inrAmount / 0.575;
          targetCurrencyName = "JPY";
          break;
        case "AED":
          convertedAmount = inrAmount / 24.45;
          targetCurrencyName = "AED";
          break;
        default:
          System.out.println("Wrong currency!");
          break;
      }

      // display the results
      System.out.printf("%.2f INR = %.2f %s%n",
          inrAmount, convertedAmount, targetCurrencyName);

      System.out.print("Do you want another conversion? (y/n): ");
      choice = sc.next().charAt(0);

    } while (choice == 'y' || choice == 'Y');
    
    System.out.println("=================================================");
    System.out.println("Thank you for using the Currency Exchange Kiosk!");
    System.out.println("=================================================");

    sc.close();
  }
}