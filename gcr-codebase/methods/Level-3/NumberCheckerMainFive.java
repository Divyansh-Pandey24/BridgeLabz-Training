import java.util.Scanner;

class NumberChecker {

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
}

public class NumberCheckerMainFive {
    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (NumberChecker.isPerfect(number))
            System.out.println(number + " is a Perfect number");
        else
            System.out.println(number + " is NOT a Perfect number");

        if (NumberChecker.isAbundant(number))
            System.out.println(number + " is an Abundant number");
        else
            System.out.println(number + " is NOT an Abundant number");

        if (NumberChecker.isDeficient(number))
            System.out.println(number + " is a Deficient number");
        else
            System.out.println(number + " is NOT a Deficient number");

        if (NumberChecker.isStrong(number))
            System.out.println(number + " is a Strong number");
        else
            System.out.println(number + " is NOT a Strong number");

        sc.close();
    }
}
