import java.util.Scanner;

public class MaximumHandshake {
    
    // Method to find out the result
    public static double calculateHandshake(double numberOfStudents) {
        return (numberOfStudents * (numberOfStudents-1)) / 2;
    }
    
    public static void main(String[] args) {

        // Take input from the users
        Scanner sc= new Scanner(System.in);
        double numberOfStudents= sc.nextDouble();

        // Calling the method
        double maxHandshakes= calculateHandshake(numberOfStudents);

       // Displaying the results
       System.out.println(maxHandshakes);
    }
}
