import java.util.Scanner;

public class RansomNoteCheck {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length())
            return false;

        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0)
                return false;
            alphabets_counter[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note string: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine string: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Can construct ransom note? " + result);

        sc.close();
    }
}
