import java.util.Scanner;
import java.util.Arrays;

class NumberChecker {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Method to check palindrome number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
}

public class NumberCheckerMainThree {
    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Count of digits: " + NumberChecker.countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversed = NumberChecker.reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));

        System.out.println("Arrays equal? " +
                NumberChecker.areArraysEqual(digits, reversed));

        if (NumberChecker.isPalindrome(digits)) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is NOT a Palindrome number");
        }

        if (NumberChecker.isDuckNumber(digits)) {
            System.out.println(number + " is a Duck number");
        } else {
            System.out.println(number + " is NOT a Duck number");
        }

        sc.close();
    }
}
