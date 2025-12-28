import java.util.*;

class DisappearedNumbers {

    // Method to find out the disappeared numbers
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        List<Integer> missing = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + missing);

        sc.close();
    }
}
