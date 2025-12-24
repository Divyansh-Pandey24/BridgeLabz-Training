import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Method to take input
    public static int takeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        return num;
    }

    public static void main(String[] args) {

        int number = takeInput();

        int result = factorial(number);

        // Displaying the results
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
