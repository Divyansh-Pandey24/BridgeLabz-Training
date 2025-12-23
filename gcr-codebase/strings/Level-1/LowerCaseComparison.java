import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using ASCII logic and charAt()
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (A–Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII conversion
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
        String manualLowerCase = convertToLowerCase(inputText);

        // Using built-in method
        String builtInLowerCase = inputText.toLowerCase();

        // Comparing both strings
        boolean result = compareStrings(manualLowerCase, builtInLowerCase);

        // Displaying results
        System.out.println("Lowercase using user-defined method: " + manualLowerCase);
        System.out.println("Lowercase using built-in method: " + builtInLowerCase);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
