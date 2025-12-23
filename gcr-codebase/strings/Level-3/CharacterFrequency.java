import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequencies and return as 2D array
    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findCharacterFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(
                    frequency[i][0] + "\t\t" +
                    frequency[i][1]
            );
        }

        sc.close();
    }
}
