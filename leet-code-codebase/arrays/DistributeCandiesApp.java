import java.util.*;

public class DistributeCandiesApp {

    // Method to distribute the candies
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int i : candyType)
            set.add(i);
        int n = candyType.length / 2;

        if (set.size() >= n)
            return n;
        else
            return set.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candies: ");
        int size = sc.nextInt();

        int[] candyType = new int[size];

        for (int i = 0; i < size; i++) {
            candyType[i] = sc.nextInt();
        }

        int result = distributeCandies(candyType);

        System.out.println("Maximum different candy types sister can eat: " + result);

        sc.close();
    }
}
