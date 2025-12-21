import java.util.Scanner;

public class EuclideanDistance {

    // Method to find Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);  
        double b = y1 - (m * x1);         

        return new double[] { m, b };
    }

    public static void main(String[] args) {

        // Take inputs from the users
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();

        double y2 = sc.nextDouble();

        // Calling methods
        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Displaying the results
        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of Line : y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}
