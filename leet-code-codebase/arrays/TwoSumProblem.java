import java.util.*;

public class TwoSumProblem {

    // Returns indices of the two numbers whose sum equals target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (map.containsKey(r)) {
                return new int[]{i, map.get(r)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{0};
    }

    // Takes user input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = twoSum(nums, target);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
