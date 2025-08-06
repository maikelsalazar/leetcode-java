package com.maikelsalazar.leetcode.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TwoSumHashMapTest {
    
    @Test
    void testFindTwoSum() {
        TwoSumHashMap solver = new TwoSumHashMap();
        int[] input = { 2, 7, 11, 15 };
        int target = 17;

        int[] result = solver.findTwoSum(input, target);

        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void testNoSolution() {
        TwoSumHashMap solver = new TwoSumHashMap();
        int[] input = { 2, 7, 11, 15 };
        int target = 5;

        int[] result = solver.findTwoSum(input, target);

        assertNull(result);
    }

    @Test
    void testDuplicates() {
        TwoSumHashMap solver = new TwoSumHashMap();
        int[] input = { 3, 1, 3 };
        int target = 6;

        int[] result = solver.findTwoSum(input, target);

        assertArrayEquals(new int[] {0,2}, result);
    }

    @Test
    void testNegativeNumbers() {
        TwoSumHashMap solver = new TwoSumHashMap();
        int[] input = { -3, -2, -1, -4, -5 };
        int target = -7;

        int[] result = solver.findTwoSum(input, target);

        assertArrayEquals(new int[] {0,3}, result);
    }

    @Test
    void testSingleElement() {
        TwoSumHashMap solver = new TwoSumHashMap();
        int[] input = { 9 };
        int target = 9;

        int[] result = solver.findTwoSum(input, target);

        assertNull(result);
    }
}
