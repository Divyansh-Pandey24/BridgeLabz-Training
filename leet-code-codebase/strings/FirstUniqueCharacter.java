import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        char st[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : st) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first char with count = 1
        for (int i = 0; i < st.length; i++) {
            if (map.get(st[i]) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int index = firstUniqChar(s);

        System.out.println("Index of first unique character: " + index);

        sc.close();
    }
}
