import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {

        // Take input from user and create any array to store height
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];

        // Create a Variable to store sum of heights
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        // Logic to find the sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculating and displaying the mean height
        double mean = sum / 11;
        System.out.println(mean);
    }
}
