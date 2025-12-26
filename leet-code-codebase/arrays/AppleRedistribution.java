import java.util.*;

public class AppleRedistribution {

    // Returns the minimum number of boxes needed to hold all apples
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int noOfApples = 0;
        for (int i = 0; i < apple.length; i++) {
            noOfApples += apple[i];
        }
        Arrays.sort(capacity);
        int count = 0;
        int index = capacity.length - 1;
        while (noOfApples > 0) {
            noOfApples -= capacity[index];
            index--;
            count++;
        }
        return count;
    }

    // Takes user input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] apple = new int[n];
        for (int i = 0; i < n; i++) {
            apple[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] capacity = new int[m];
        for (int i = 0; i < m; i++) {
            capacity[i] = sc.nextInt();
        }

        System.out.println(minimumBoxes(apple, capacity));
    }
}
