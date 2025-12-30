import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Rohan's Library Fine Calculator ");
        System.out.println("------------------------------------");

        // Variable to store total fine
        int totalFine = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i + ":");

            LocalDate dueDate = null;
            LocalDate returnDate = null;

            // Take input for due date 
            while (true) {
                try {
                    System.out.print("Enter Due Date (yyyy-mm-dd): ");
                    String due = sc.next();
                    dueDate = LocalDate.parse(due);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println(" Invalid date! Example valid format: 2025-01-30");
                }
            }

            // Take input for return date
            while (true) {
                try {
                    System.out.print("Enter Return Date (yyyy-mm-dd): ");
                    String ret = sc.next();
                    returnDate = LocalDate.parse(ret);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date! Example valid format: 2025-01-30");
                }
            }

            int fine = 0;

            if (returnDate.isAfter(dueDate)) {
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
                fine = (int) lateDays * 5;
            }

            System.out.println("Fine for Book " + i + " : Rs" + fine);

            totalFine += fine;
        }

        System.out.println("\nTotal Fine for all books = Rs" + totalFine);
        System.out.println("All fines calculated. Thank you ");
        sc.close();
    }
}
