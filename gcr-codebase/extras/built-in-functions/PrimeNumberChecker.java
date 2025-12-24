import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to take input from user
    public static int takeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        return num;
    }

    public static void main(String[] args) {

        int number = takeInput();

        boolean result = isPrime(number);

        if (result == true) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
