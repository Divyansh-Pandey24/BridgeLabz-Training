import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of substring using indexOf
    public static int countOccurrences(String text, String sub) {

        int count = 0;
        int index = 0;

        while (true) {
            index = text.indexOf(sub, index);

            if (index == -1) {
                break;
            }

            count++;
            index = index + 1; 
        }

        return count;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        // Calling the methods
        int result = countOccurrences(text, sub);

        // Displaying the results
        System.out.println("Substring occurs " + result + " times");

        sc.close();
    }
}
