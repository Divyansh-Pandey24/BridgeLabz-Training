import java.util.Scanner;

public class ComparisionOfStrings {

    // Method to compare strings using charAt() method
    public static boolean compare(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i=0; i< str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Take input from users
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();

        // Calling methods to compare
        boolean isEqualUsingCompare= compare(str1, str2);
        
        // Checking using built-in method
        boolean isEqualUsingEquals= str1.equals(str2);

        // Displaying the results
        if (isEqualUsingCompare && isEqualUsingEquals) {
            System.out.println("Both the strings are equal");
        } else {
            System.out.println("Both the strings are not equal");
        }
        sc.close();
    }
}