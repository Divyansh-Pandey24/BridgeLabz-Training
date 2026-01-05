package com.hashmaps.pairwithsum;

import java.util.*;

public class PairWithSum {

    public static void main(String[] args) {

        int[] arr = {10, 15, 3, 7};
        int target = 17;

        // HashSet to store elements which only stores unique elements
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {

        	// Variable to store required number
            int need = target - num;

            if(set.contains(need)) {
                System.out.println("Pair found: " + num + " and " + need);
                return;
            }

            set.add(num);
        }

        System.out.println("No pair found");
    }
}
