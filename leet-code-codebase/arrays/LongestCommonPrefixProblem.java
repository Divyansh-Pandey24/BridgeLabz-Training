import java.util.*;

public class LongestCommonPrefixProblem {

    // Returns the longest common prefix in the array of strings
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String str = "";
        for (int i = 0; i < strs[0].length(); i++) {
            String ptr = strs[0].substring(0, i + 1);
            if (check(ptr, strs)) {
                str = ptr;
            }
        }
        if (!str.isEmpty() || strs.length == 1) {
            if (strs.length == 1) {
                return strs[0];
            }
            return str;
        }
        return str;
    }

    // Checks if all strings start with the given prefix
    public static boolean check(String htr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(htr)) {
                return false;
            }
        }
        return true;
    }

    // Takes user input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        System.out.println(longestCommonPrefix(strs));
    }
}
