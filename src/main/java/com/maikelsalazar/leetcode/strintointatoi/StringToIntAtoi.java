package com.maikelsalazar.leetcode.strintointatoi;

/**
 * Converts a string to a 32-bit signed integer following the rules defined in the
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/description/">
 * String to Integer (atoi)</a> problem.
 */
class StringToIntAtoi {

    public int myAtoi(String s) {
        int i = 0, length = s.length();

        // 1. Ignore leading whitespace characters
        while (i < length && s.charAt(i) == ' ') i++;

        // 2. Detect optional sign ('+' or '-')
        int sign = 1;

        if (i < length) {
            char ch = s.charAt(i);
            if (ch == '-' || ch == '+') {
                if (ch == '-') sign = -1;
                i++;
            }
        }

        // 3. Convert digits into a number
        int result = 0;

        while (i < length) {
            char ch = s.charAt(i);

            // Stop at a non-digit
            if (ch < '0' || ch > '9') break;

            // we have a digit!
            int digit = ch - '0';

            // checking for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = (result * 10) + digit;
            i++;
        }

        return sign * result;
    }
}
