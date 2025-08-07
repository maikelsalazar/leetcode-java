package com.maikelsalazar.leetcode.productofarrayexceptself;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductOfArrayExceptSelfTest {

    @ParameterizedTest
    @MethodSource("sourceNumbers")
    void testProductExceptSelf(int[] numbers, int[] expected) {
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int[] actual = product.productExceptSelf(numbers);

        assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("sourceNumbers")
    void testProductExceptSelfUsingBruteForce(int[] numbers, int[] expected) {
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int[] actual = product.bruteForce(numbers);

        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> sourceNumbers() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3, 4 }, new int[] { 24, 12, 8, 6 }),
                Arguments.of(new int[] { 1, 2, 3, 4, 0 }, new int[] { 0, 0, 0, 0, 24 }),
                // Edge Cases
                Arguments.of(new int[] {}, new int[] {}), // empty list
                Arguments.of(new int[] { 10 }, new int[] { 1 }), // single element, neutral product is 1
                Arguments.of(null, null)); // null
    }
}
