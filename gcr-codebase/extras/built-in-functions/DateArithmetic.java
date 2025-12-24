import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking date input
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        // Adding days, months, years, and subtracting weeks
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);


        // Displaying results
        System.out.println("Original Date: " + date);
        System.out.println("Final Date after calculations: " + updatedDate);

        sc.close();
    }
}
