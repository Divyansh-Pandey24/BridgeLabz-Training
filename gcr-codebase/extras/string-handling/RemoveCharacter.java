import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove a specific character from string
    public static String removeCharacter(String text, char ch) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result = result + text.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        // Calling method to remove the given character
        String modified = removeCharacter(text, ch);

        // Displaying the results
        System.out.println("Modified String: " + modified);

        sc.close();
    }
}
