import java.util.Scanner;

public class AnagramCheck {

    // Method to check whether string are anagram or not 
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("Are the strings anagrams? " + result);

        sc.close();
    }
}
