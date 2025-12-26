import java.util.*;

public class ThirdMaximumNumber {

    // Returns the third distinct maximum number (or maximum if fewer than 3)
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if (nums.length < 3) {
            return nums[nums.length - 1];
        }

        int maxEle = nums[nums.length - 1];
        int count = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != maxEle) {
                maxEle = nums[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }

        if (count != 3) {
            maxEle = nums[nums.length - 1];
        }

        return maxEle;
    }

    // Takes user input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(thirdMax(nums));
    }
}
