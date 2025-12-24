import java.util.Scanner;

public class PalindromeChecker {

    // Method to check whether the string is palindrome
    public static boolean isPalindrome(String text) {
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

    // Method to take input from the user
    public static String takeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        return input;
    }

    public static void main(String[] args) {

        String text = takeInput();

        boolean result = isPalindrome(text);

        if (result == true) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }
}
