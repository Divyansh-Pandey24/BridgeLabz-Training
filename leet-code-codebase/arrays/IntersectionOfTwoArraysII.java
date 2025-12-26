import java.util.*;

public class IntersectionOfTwoArraysII {

    // Returns the intersection of two arrays including duplicates
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map1.containsKey(nums1[i])) {
                map1.put(nums1[i], 1);
            } else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!map2.containsKey(nums2[i])) {
                map2.put(nums2[i], 1);
            } else {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }
        }

        int count = 0;
        for (int a : map1.keySet()) {
            if (map2.containsKey(a)) {
                count += Math.min(map1.get(a), map2.get(a));
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int a : map1.keySet()) {
            if (map2.containsKey(a)) {
                int times = Math.min(map1.get(a), map2.get(a));
                while (times-- > 0) {
                    result[index++] = a;
                }
            }
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

        int[] ans = intersect(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
