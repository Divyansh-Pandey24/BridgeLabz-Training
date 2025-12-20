import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {

        // Take input from user and create array to store age and height
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Logic to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
       
        sc.close();
    }
}
