import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElementFinder {

    // Method to find out next greater element
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int flag = -1;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    flag = 1;
                }

                if (nums2[j] > nums1[i] && flag == 1) {
                    result[i] = nums2[j];
                    flag = 0;
                    break;
                }
            }

            if (flag == 1 || flag == -1) {
                result[i] = -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(nums1, nums2);

        // Output
        System.out.println("Next Greater Elements: " + Arrays.toString(result));

        sc.close();
    }
}
