import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        int minLen = (len1 < len2) ? len1 : len2;

        for (int i = 0; i < minLen; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                return -1;  
            } 
            else if (c1 > c2) {
                return 1;    
            }
        }

        // If all compared characters are equal
        if (len1 < len2) {
            return -1;
        } 
        else if (len1 > len2) {
            return 1;
        } 
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result < 0) {
            System.out.println( s1 + " comes before " + s2 +" in lexicographical order");
        } 
        else if (result > 0) {
            System.out.println(s1 + " comes after " + s2 +" in lexicographical order");
        } 
        else {
            System.out.println("Both strings are equal");
        }

        sc.close();
    }
}
