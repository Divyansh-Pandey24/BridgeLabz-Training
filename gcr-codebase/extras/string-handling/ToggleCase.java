import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of characters
    public static String toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // If uppercase, convert to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // Other characters remain same
            else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Calling method to toggle the character
        String toggled = toggleCase(text);

        // Displaying the results
        System.out.println("Toggled string: " + toggled);

        sc.close();
    }
}
