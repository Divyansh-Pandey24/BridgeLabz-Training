package com.hashmaps.twosum;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

    	// HashMap to store elements
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

        	// Variable to find out the required number 
            int need = target - nums[i];

            if(map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.put(nums[i], i);
        }
        // If not found return -1 indexes
        return new int[] {-1, -1}; 
    }


    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(arr, target);

        System.out.println(ans[0] + ", " + ans[1]);
    }
}
