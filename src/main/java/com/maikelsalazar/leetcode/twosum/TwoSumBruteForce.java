package com.maikelsalazar.leetcode.twosum;

public class TwoSumBruteForce {

    /**
     * Brute-force solution to the Two Sum problem.
     *
     * @param numbers Input array of integers
     * @param target  The target sum
     * @return Indices of the two numbers that add up to target, or null if not
     *         found
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
