import java.util.*;

public class NegativeNumbers {
 
    // Method to count negative numbers
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count += grid[i].length - j;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = countNegatives(grid);

        System.out.println("Total negative numbers = " + result);

        sc.close();
    }
}
