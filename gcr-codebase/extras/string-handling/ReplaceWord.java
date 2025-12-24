import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word using split
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            // Add space after each word except last
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        // Calling methods to replace the word
        String updated = replaceWord(sentence, oldWord, newWord);

        // Displaying the results
        System.out.println("Modified Sentence: " + updated);

        sc.close();
    }
}
