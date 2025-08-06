package com.maikelsalazar.leetcode.anagramchecker;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public boolean areAnagrams(String s, String t) {
        String sCleaned = s.replaceAll("\\s+", "").toLowerCase();
        String tCleaned = t.replaceAll("\\s+", "").toLowerCase();

        if (sCleaned.length() != tCleaned.length()) {
            return false;
        }

        Map<Character, Integer> occurrences = new HashMap<>();
        for(char c: sCleaned.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) +1 );
        }

        for (char c: tCleaned.toCharArray()) {
            if(!occurrences.containsKey(c)) return false;
            occurrences.put(c, occurrences.get(c) - 1);
            if(occurrences.get(c) < 0) return false;
        }

        return true;
    }
}
