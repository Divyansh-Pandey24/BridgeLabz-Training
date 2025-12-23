import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome using loop
    public static boolean isPalindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method to check palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text) {

        int n = text.length();
        char[] reverse = new char[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            reverse[j] = text.charAt(i);
            j++;
        }

        return reverse;
    }

    // Method to check palindrome using charAt() and in-built method
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeLoop(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        System.out.println("Palindrome Check Results:");
        System.out.println("Using Loop      : " + result1);
        System.out.println("Using Recursion : " + result2);
        System.out.println("Using Arrays    : " + result3);

        sc.close();
    }
}
