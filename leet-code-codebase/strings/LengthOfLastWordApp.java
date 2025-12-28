import java.util.Scanner;

public class LengthOfLastWordApp {

    // Method to find out the size of last word
    public static int lengthOfLastWord(String s) {
        String temp = s.trim();
        int count = 0;

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}
