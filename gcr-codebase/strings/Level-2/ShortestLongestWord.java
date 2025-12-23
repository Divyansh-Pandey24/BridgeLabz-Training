import java.util.Scanner;

public class ShortestLongestWord {

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

        // Count words
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
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }

        return table;
    }

    // Method to find shortest and longest word indexes
    // returns {shortestIndex, longestIndex}
    public static int[] findShortestAndLongest(String[][] table) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < table.length; i++) {
            int current = Integer.parseInt(table[i][1]);
            int shortLen = Integer.parseInt(table[shortest][1]);
            int longLen = Integer.parseInt(table[longest][1]);

            if (current < shortLen) {
                shortest = i;
            }

            if (current > longLen) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        // Split text
        String[] words = splitText(text);

        // Create word-length table
        String[][] table = getWordLengthTable(words);

        // Find shortest and longest
        int[] result = findShortestAndLongest(table);

        // Display table
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        // Display result
        System.out.println("\nShortest word : " + table[result[0]][0]);
        System.out.println("Longest word  : " + table[result[1]][0]);

        sc.close();
    }
}
