package com.maikelsalazar.leetcode.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TwoSumBruteForceTest {

    @Test
    void testTwoSum() {
        TwoSumBruteForce solver = new TwoSumBruteForce();
        int[] input = { 2, 5, 6, 7 };

        int[] actual = solver.twoSum(input, 12);

        assertArrayEquals(new int[] { 1, 3 }, actual);
    }

    @Test
    void testInvalidInput() {
        TwoSumBruteForce solver = new TwoSumBruteForce();

        int[] actual = solver.twoSum(null, 12);

        assertNull(actual);
    }

    @Test
    void testInsufficientInput() {
        TwoSumBruteForce solver = new TwoSumBruteForce();

        int[] actual = solver.twoSum(new int[] { 5 }, 12);

        assertNull(actual);
    }

    @Test
    void testNoSolution() {
        TwoSumBruteForce solver = new TwoSumBruteForce();
        int[] input = { 2, 5, 6, 7 };

        int[] actual = solver.twoSum(input, 20);

        assertNull(actual);
    }

    @Test
    void testNegativeNumbers() {
        TwoSumBruteForce solver = new TwoSumBruteForce();
        int[] input = { 2, -5, -6, 7 };

        int[] actual = solver.twoSum(input, 1);

        assertArrayEquals(new int[] { 2, 3 }, actual);
    }
}
