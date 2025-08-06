package com.maikelsalazar.leetcode.anagramchecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramCheckerTest {

    @Test
    void testAreAnagrams() {
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams("silent", "tilens");

        assertTrue(result);
    }

    @Test
    void testAreAnagramsIgnoringWhitespaces() {
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams("s ilent ", "   tilens");

        assertTrue(result);
    }

    @Test
    void testNoAnagrams() {
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams("hello", "world");

        assertFalse(result);
    }

    @Test
    void testCaseInsensitivity() {
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams("hello", "llohe");

        assertTrue(result);
    }

    @Test
    void testSpecialCharacters() {
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams("a@b!", "b!a@");
        
        assertTrue(result);
    }
}
