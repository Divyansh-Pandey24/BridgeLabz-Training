import java.util.Scanner;

public class VotingEligibility {

    // Method to generate ages of n students (2-digit ages)
    public static int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Random 2-digit age (10 to 99)
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayTable(String[][] table) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkVoting(ages);

        // Display result
        displayTable(result);

        sc.close();
    }
}
