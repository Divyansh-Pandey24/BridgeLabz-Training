import java.util.*;

public class IntersectionOfArrays {

    // Returns the intersection of two arrays (unique elements)
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!map.containsKey(nums1[i])) {
                        map.put(nums1[i], 1);
                    } else {
                        break;
                    }
                }
            }
        }

        int[] result = new int[map.size()];
        int i = 0;
        for (int a : map.keySet()) {
            result[i++] = a;
        }

        return result;
    }

    // Takes user input and prints the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] ans = intersection(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
