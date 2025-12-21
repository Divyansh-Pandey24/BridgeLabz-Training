public class HeightOfPlayers {

    // Method to generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Generate heights for 11 players
        int[] heights = generateHeights();

        // Display player heights
        System.out.println("Heights of players:");
        for (int height : heights) {
            System.out.println(height);
        }

        // Displaying results
        System.out.println("Shortest height: " + findShortest(heights));
        System.out.println("Tallest height: " + findTallest(heights));
        System.out.println("Mean height: " + findMean(heights));
    }
}
