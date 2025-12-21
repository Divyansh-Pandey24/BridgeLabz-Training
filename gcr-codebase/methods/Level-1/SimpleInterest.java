import java.util.Scanner;

public class SimpleInterest {
    
    public static double calculateSI(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }
    
    public static void main(String[] args) {

        // Take input from the users
        Scanner sc= new Scanner(System.in);
        double principle= sc.nextDouble();
        double rate= sc.nextDouble();
        double time= sc.nextDouble();

        //
        double simpleInterest= calculateSI(principle, rate, time);

        // Displaying the results
        System.out.println("The Simple Interest is "+simpleInterest+" for Principle "+principle+" , Rate of interest "+rate+" and Time "+time);
    }
}