import java.util.*;

public class SearchInsertPosition {

    // Returns the index where target is found or should be inserted
    public static int searchInsert(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target)
                return i;
            if (nums[i] > target)
                return i;
        }
        return size;
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

        System.out.println(searchInsert(nums, target));
    }
}
