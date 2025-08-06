package com.maikelsalazar.leetcode.topkfrequentelements;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    @Test
    void testFindTopFrequent() {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] input = { 1, 1, 1, 2, 2, 3 };
        int[] actual = finder.findTopFrequent(input, 2);

        assertTrue(containsAll(actual, new int[] { 1, 2 }));
    }

    @Test
    void testEmptyInput() {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] input = {};
        int[] actual = finder.findTopFrequent(input, 2);

        assertTrue(actual.length == 0);
    }

    @Test
    void testSingleElement() {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] input = { 99 };
        int[] actual = finder.findTopFrequent(input, 1);

        assertTrue(containsAll(actual, new int[] { 99 }));
    }

    @Test
    void testTieFrequencies() {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] input = { 1, 1, 2, 2, 8, 8 };
        int[] actual = finder.findTopFrequent(input, 2);

        assertTrue(
                containsAll(actual, new int[] { 1, 2 })
                        || containsAll(actual, new int[] { 1, 8 })
                        || containsAll(actual, new int[] { 2, 8 }));
    }

    /**
     * helper function to check if two arrays contains the same elements
     * 
     * @param actual
     * @param expected
     * @return boolean true if both array contains all the elements, false otherwise
     */
    private static boolean containsAll(int[] actual, int[] expected) {
        if (actual.length != expected.length)
            return false;

        for (int e : expected) {
            boolean found = false;
            for (int a : actual) {
                if (e == a) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }

        return true;
    }
}
