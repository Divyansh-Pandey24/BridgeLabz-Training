import java.util.*;

public class MaximumHappiness {

    // Returns the maximum happiness sum for k children
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int decrement = 1;
        long happi = happiness[happiness.length - 1];

        for (int i = happiness.length - 2; i >= 0; i--) {
            if (decrement == k) break;
            if (happiness[i] - decrement < 0) continue;
            happi += (happiness[i] - decrement);
            decrement++;
        }
        return happi;
    }

    // Takes input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] happiness = new int[n];
        for (int i = 0; i < n; i++) {
            happiness[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maximumHappinessSum(happiness, k));
    }
}
