package com.maikelsalazar.leetcode.strintointatoi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringToIntAtoiTest {

    private StringToIntAtoi atoi;

    @BeforeEach
    void setUp() {
        atoi = new StringToIntAtoi();
    }

    @Test
    void testSimplePositiveNumber() {
        assertEquals(42, atoi.myAtoi("42"));
    }

    @Test
    void testSimpleNegativeNumber() {
        assertEquals(-42, atoi.myAtoi("   -42"));
    }

    @Test
    void testLeadingSpacesPositiveNumber() {
        assertEquals(42, atoi.myAtoi("    42"));
        assertEquals(42, atoi.myAtoi("    +42"));
    }

    @Test
    void testLeadingSpacesNegativeNumber() {
        assertEquals(-42, atoi.myAtoi("    -42"));
    }

    @Test
    void testStopAtNonDigitCharacter() {
        assertEquals(1337, atoi.myAtoi("1337c0d3"));
    }

    @Test
    void testNoDigitsAtBeginning() {
        assertEquals(0, atoi.myAtoi("words and 987"));
    }

    @Test
    void testOverflowPositive() {
        assertEquals(Integer.MAX_VALUE, atoi.myAtoi("91283472332"));
    }

    @Test
    void testOverflowNegative() {
        assertEquals(Integer.MIN_VALUE, atoi.myAtoi("-91283472332"));
    }

    @Test
    void testReadDigitsBeforeNonDigits() {
        assertEquals(0, atoi.myAtoi("0-1"));
        assertEquals(1, atoi.myAtoi("1-2"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> atoi.myAtoi(null));
    }
}
