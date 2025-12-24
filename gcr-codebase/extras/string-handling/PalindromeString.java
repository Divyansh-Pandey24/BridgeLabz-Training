import java.util.Scanner;

public class PalindromeString {

    public static boolean checkPalindrome(String text) {

        int startIndex=0;
        int endIndex=text.length()-1;

        while (startIndex < endIndex) {
             if (text.charAt(startIndex) != text.charAt(endIndex)) {
                 return false;
             }
             startIndex++;
             endIndex--;
        }
        return true;
    }
    public static void main(String[] args) {

        // Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text= sc.next();

        // Calling the methods to get the results
        Boolean isPalindrome= checkPalindrome(text);
       
        // Displaying the results
        if (isPalindrome) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }
}