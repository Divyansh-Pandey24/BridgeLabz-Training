import java.util.Scanner;

public class IsPosNegOrZero {

    // Method to check whether number is positive or negative
    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check whether number is even or odd
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calling the methods and checking the numbers whether positive or negative
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Calling to compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
