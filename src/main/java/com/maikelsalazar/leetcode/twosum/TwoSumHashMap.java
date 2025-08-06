package com.maikelsalazar.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    
    /**
     * Returns indices of two numbers that add up to the target.
     * Assumes exactly one valid solution exists or returns null if none found.
     * 
     * @param numbers Input array of integers
     * @param target  The target sum
     * @return Indices of the two numbers, or null if no solution exists
     */
    public int[] findTwoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int complement = target - currentNumber;

            if (map.containsKey(complement)){ 
                return new int[] {map.get(complement), i};
            }

            map.put(currentNumber, i);
        }

        return null;
    }
}
