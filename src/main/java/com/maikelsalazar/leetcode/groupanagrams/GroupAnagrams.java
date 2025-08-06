package com.maikelsalazar.leetcode.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagramsUsingSort(String[] inputWords) {
        if (inputWords == null || inputWords.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(String word: inputWords) {
            String normalizedWord = word.toLowerCase();
            char[] chars = normalizedWord.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!anagramGroups.containsKey(sorted)) {
                anagramGroups.put(sorted, new ArrayList<>());
            }

            anagramGroups.get(sorted).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public List<List<String>> groupAnagramsByCount(String[] inputWords) {
        if (inputWords == null || inputWords.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(String word: inputWords) {
            String normalizedWord = word.toLowerCase();
            int[] letters = new int[26]; // a-z
            for(char c: normalizedWord.toCharArray()) {
                letters[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                keyBuilder.append(letters[i]);
                keyBuilder.append('#');
            }

            String key = keyBuilder.toString();

            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }

            anagramGroups.get(key).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    } 
}
