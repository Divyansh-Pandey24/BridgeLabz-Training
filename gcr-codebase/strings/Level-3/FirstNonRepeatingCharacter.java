import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character then return this
        return '#';
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '#') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
