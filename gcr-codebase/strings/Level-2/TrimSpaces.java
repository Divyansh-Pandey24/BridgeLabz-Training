import java.util.Scanner;

public class TrimSpaces {

    // Method to find start and end index after trimming spaces
    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
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

        // Take user input
        System.out.println("Enter the string:");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = trimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare results
        boolean result = compareStrings(manualTrim, builtInTrim);

        // Display result
        System.out.println("After trimming (user-defined): [" + manualTrim + "]");
        System.out.println("After trimming (built-in)    : [" + builtInTrim + "]");
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
