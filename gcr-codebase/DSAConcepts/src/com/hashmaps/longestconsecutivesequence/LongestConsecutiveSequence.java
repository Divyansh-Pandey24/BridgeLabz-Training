package com.hashmaps.longestconsecutivesequence;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        // HashSet to store all elements
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums)
            set.add(n);

        int longest = 0;

        for(int n : set) {

            // Check start of sequence
            if(!set.contains(n - 1)) {

                int length = 1;
                int current = n;

                // Count forward
                while(set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest consecutive sequence length = " + longest);
    }
}
