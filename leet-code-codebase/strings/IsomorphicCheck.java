import java.util.Scanner;

public class IsomorphicCheck {

    // Method to check whether strings are isomorphic or not
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    if (t.charAt(i) != t.charAt(j)) {
                        return false;
                    }
                } else {
                    if (t.charAt(i) == t.charAt(j)) {
                        return false;
                    }
                }
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

        boolean result = isIsomorphic(s, t);

        System.out.println("Are the strings isomorphic? " + result);

        sc.close();
    }
}
