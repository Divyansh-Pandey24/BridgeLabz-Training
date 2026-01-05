package com.hashmaps.zerosum;

import java.util.*;

public class ZeroSum {

    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1};

        // Store sum and index
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        // Sum 0 is considered at index -1
        map.put(0, -1);

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum already exists subarray found
            
            if(map.containsKey(sum)) {

                int start = map.get(sum) + 1;
                int end = i;

                System.out.println("Zero sum from index " + start + " to " + end);
                flag = true;
            }

            map.put(sum, i);
        }

        if (!flag) {
        	System.out.println("No zero sum subarray");
        }
        
    }
}
