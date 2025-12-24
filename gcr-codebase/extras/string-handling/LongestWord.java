import java.util.Scanner;

public class LongestWord {

    // Method to find longest word
    public static String findLongestWord(String text) {
        String[] words= text.split("\\s+");
     
        int maxLength= words[0].length();
        String longestWord= words[0];

        for (int i=1; i<words.length; i++) {
             if (words[i].length() > maxLength) {
                 maxLength= words[i].length();
                 longestWord=words[i];
             } 
        }
        return longestWord;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();

        // calling the method to find longest word
        String longestWord= findLongestWord(text);
     
        // Displaying the results
        System.out.println("The longest word is: "+longestWord);
    }
}