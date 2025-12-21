import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Calling the method
        int result = calculateSum(n);

        // Displaying the result
        System.out.println("The sum of n natural numbers is: "+result);
     
        sc.close();
    }
}
