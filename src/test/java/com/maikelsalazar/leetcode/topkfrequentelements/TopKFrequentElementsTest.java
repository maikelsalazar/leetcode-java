package com.maikelsalazar.leetcode.topkfrequentelements;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TopKFrequentElementsTest {

    @ParameterizedTest
    @MethodSource("sourceElements")
    void testFindTopFrequent(int[] input, int k, int[] expected) {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] actual = finder.findTopFrequent(input, k);

        assertTrue(containsAll(actual, expected));
    }

    @ParameterizedTest
    @MethodSource("sourceElements")
    void testFindTopFrequentBucketSort(int[] input, int k, int[] expected) {
        TopKFrequentElements finder = new TopKFrequentElements();
        int[] actual = finder.findTopFrequentBucketSort(input, k);

        assertTrue(containsAll(actual, expected));
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

    private static Stream<Arguments> sourceElements() {
        return Stream.of(
                Arguments.of(new int[] { 1, 1, 1, 2, 2, 3 }, 2, new int[] { 1, 2 }),
                Arguments.of(new int[] { 10, 10, 2, 2, 3 }, 2, new int[] { 10, 2 }),
                Arguments.of(new int[] { 4, 4, 4, 5, 5, 6 }, 1, new int[] { 4 }),
                Arguments.of(new int[] { 7, 8, 9, 7, 8, 9 }, 3, new int[] { 7, 8, 9 }),
                Arguments.of(new int[] { 42 }, 1, new int[] { 42 }),
                Arguments.of(new int[] {}, 0, new int[] {}));
    }
}
