import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find character frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Nested loops to find frequency
        for (int i = 0; i < n; i++) {

            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store results
        String[] result = new String[count];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[k] = chars[i] + " : " + freq[i];
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] output = findFrequency(text);

        System.out.println("Character Frequency:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        sc.close();
    }
}
