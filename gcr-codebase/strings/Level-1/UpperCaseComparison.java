import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using ASCII logic and charAt()
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase (a–z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
            }

            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.println("Enter the text:");
        String inputText = sc.nextLine();

        // Using user-defined method
        String manualUpperCase = convertToUpperCase(inputText);

        // Using built-in method
        String builtInUpperCase = inputText.toUpperCase();

        // Comparing both strings
        boolean result = compareStrings(manualUpperCase, builtInUpperCase);

        // Displaying results
        System.out.println("Uppercase using user-defined method: " + manualUpperCase);
        System.out.println("Uppercase using built-in method: " + builtInUpperCase);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
