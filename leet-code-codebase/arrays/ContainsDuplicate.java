import java.util.Scanner;

public class ContainsDuplicate {

    // Checks if the array contains any duplicate value
    public boolean containsDuplicate(int[] nums) {

        // Compare every element with others
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContainsDuplicate sol = new ContainsDuplicate();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(sol.containsDuplicate(nums));

        sc.close();
    }
}