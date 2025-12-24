import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String text) {

        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int maxFreq = 0;
        char result = text.charAt(0);

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Calling the method to find the frequency of the character
        char mostFrequent = findMostFrequentChar(text);

        // Displaying the results
        System.out.println("Most frequent character: " + mostFrequent);

        sc.close();
    }
}
