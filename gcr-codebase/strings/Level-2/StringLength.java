import java.util.Scanner;

public class StringLength {

    // Method to find length of string without using length()
    public static int findLength(String text) {
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

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.next();

        // Calling user-defined method
        int manualLength = findLength(input);

        // Calling built-in method
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length without using length() method: " + manualLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
