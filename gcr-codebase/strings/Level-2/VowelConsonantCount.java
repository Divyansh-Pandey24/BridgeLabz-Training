import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check whether a character is vowel, consonant or not a letter
    public static String checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String result = checkChar(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the string:");
        String text = sc.nextLine();

        // Call method
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("Vowels count     : " + result[0]);
        System.out.println("Consonants count : " + result[1]);

        sc.close();
    }
}
