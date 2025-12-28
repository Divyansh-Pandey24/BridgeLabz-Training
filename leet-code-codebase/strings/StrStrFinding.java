import java.util.Scanner;

public class StrStrFinding {

    // Method to find out the first occurrence
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String haystack = sc.nextLine();
        System.out.print("Enter string2: ");
        String needle = sc.nextLine();

        int result = strStr(haystack, needle);

        System.out.println("Index of first occurrence: " + result);

        sc.close();
    }
}
