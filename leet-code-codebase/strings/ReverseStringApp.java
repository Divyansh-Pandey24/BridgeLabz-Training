import java.util.Scanner;
import java.util.Arrays;

public class ReverseStringApp {

    // Method to reverse the string
    public static char[] reverseString(char[] s) {

        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        return s; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] arr = input.toCharArray();

        char[] reversed = reverseString(arr);

        System.out.print("Reversed string: "+ Arrays.toString(reversed));

        sc.close();
    }
}
