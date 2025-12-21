import java.util.Scanner;

public class NaturalNumbersSum {

    // Method to calculate sum of natural numbers
    public static int sumNaturalNumbers(int number) {
        if (number==0) {
           return 0;
        }
        return number + sumNaturalNumbers(number-1);
        
    }
   
    // Method to calculate sum of natural numbers using formula
    public static int sumNaturalNumbersV2(int number) {
        return number * (number+1)/2;
    }

    public static void main(String[] args) {
        
        // Take input from users
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        // Calling the methods
        int sum= sumNaturalNumbers(number);
        int sumFormula= sumNaturalNumbersV2(number);
        
        // displaying the results
        System.out.println("The sum using recursion is: "+sum+" ,The sum using formula is: "+sumFormula);
            
    }
}