import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    // Method to find out valid parentheses
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if (st.isEmpty())
                    return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = isValid(s);

        if (result)
            System.out.println("Valid parentheses string");
        else
            System.out.println("Invalid parentheses string");

        sc.close();
    }
}
