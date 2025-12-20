import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Take input from user and create array to store salary and experience
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] serviceYears = new double[10];

        // Create arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {

            salary[i] = sc.nextDouble();

            serviceYears[i] = sc.nextDouble();

            // Check for invalid input
            if (salary[i] <= 0 || serviceYears[i] < 0) {
                System.err.println("Invalid input, please enter again");
                i--; 
            }
        }

        // Logic to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (serviceYears[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying the results
        System.out.println("Total Bonus Amount: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
