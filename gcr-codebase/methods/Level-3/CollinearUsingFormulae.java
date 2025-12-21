import java.util.Scanner;

public class CollinearUsingFormulae {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope( double x1, double y1, double x2, double y2, double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle
    public static boolean isCollinearByArea( double x1, double y1, double x2, double y2, double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3)
              + x2 * (y3 - y1)
              + x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        // Take input from users
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check using slope
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check using area
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Displaying the results
        if (slopeResult && areaResult) {
            System.out.println("The three points are collinear");
        } else {
            System.out.println("The three points are NOT collinear");
        }

        sc.close();
    }
}
