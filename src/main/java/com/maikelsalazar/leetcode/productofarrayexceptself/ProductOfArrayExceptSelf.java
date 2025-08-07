package com.maikelsalazar.leetcode.productofarrayexceptself;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] bruteForce(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        if (numbers.length < 2) {
            return new int[] { 1 };
        }

        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                answer[i] *= numbers[j];
            }
        }

        return answer;
    }

    public int[] productExceptSelf(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        if (numbers.length < 2) {
            return new int[] { 1 };
        }

        int[] answer = new int[numbers.length];

        int prefixProduct = 1;
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = prefixProduct;
            prefixProduct = prefixProduct * numbers[i];
        }

        int postfixProduct = 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * postfixProduct;
            postfixProduct = postfixProduct * numbers[i];
        }

        return answer;
    }
}
