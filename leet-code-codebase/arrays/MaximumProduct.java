import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0] * nums[1] * nums[nums.length - 1];
        int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        if (a > b)
            return a;

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maximumProduct(nums);

        System.out.println("Maximum Product of three numbers is: " + result);

        sc.close();
    }
}
