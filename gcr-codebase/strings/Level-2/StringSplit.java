import java.util.Scanner;

public class StringSplit {

    // Method to find length of string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int length = getLength(text);

        // Count number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int k = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        // User-defined split
        String[] manual = splitText(text);

        // Built-in split
        String[] builtIn = text.split(" ");

        // Compare results
        boolean result = compareArrays(manual, builtIn);

        // Display results
        System.out.println("\nWords using user-defined method:");
        for (String word : manual) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
