import java.util.Scanner;

public class LeapYear {

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // Calling the method
        boolean result = isLeapYear(year);

        // Displaying the result
        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
