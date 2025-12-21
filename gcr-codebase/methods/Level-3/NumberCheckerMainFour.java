import java.util.Scanner;

class NumberChecker {

    // Method to check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Method to check Neon Number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check Spy Number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10)
                return false;
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // Method to check Buzz Number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }
}

public class NumberCheckerMainFour {
    
    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (NumberChecker.isPrime(number))
            System.out.println(number + " is a Prime number");
        else
            System.out.println(number + " is NOT a Prime number");

        if (NumberChecker.isNeon(number))
            System.out.println(number + " is a Neon number");
        else
            System.out.println(number + " is NOT a Neon number");

        if (NumberChecker.isSpy(number))
            System.out.println(number + " is a Spy number");
        else
            System.out.println(number + " is NOT a Spy number");

        if (NumberChecker.isAutomorphic(number))
            System.out.println(number + " is an Automorphic number");
        else
            System.out.println(number + " is NOT an Automorphic number");

        if (NumberChecker.isBuzz(number))
            System.out.println(number + " is a Buzz number");
        else
            System.out.println(number + " is NOT a Buzz number");

        sc.close();
    }
}
