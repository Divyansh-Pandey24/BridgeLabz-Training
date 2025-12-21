import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
       int[] results= new int[2];

        // Number of chocolates
        int quotient = number / divisor;
        results[0]= quotient;
   
        // Number of remaining chocolates
        int remainder = number % divisor;
        results[1]= remainder;
        return results;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // Calling the method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the result
        System.out.println("Number of chocolates per child get: " + result[0]+"\n"+"Remaining chocolates: " + result[1]);
   
        sc.close();
    }
}
