package com.maikelsalazar.leetcode.groupanagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GroupAnagramsTest {
    
    @ParameterizedTest
    @MethodSource("sourceWords")
    void testGroupAnagramsByCount(String[] inputWords, Set<Set<String>> expected) {
        GroupAnagrams grouper = new GroupAnagrams();
        List<List<String>> result = grouper.groupAnagramsByCount(inputWords);

        Set<Set<String>> actual = toSetOfSets(result);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("sourceWords")
    void testGroupAnagramsUsingSort(String[] inputWords, Set<Set<String>> expected) {
        GroupAnagrams grouper = new GroupAnagrams();
        List<List<String>> result = grouper.groupAnagramsUsingSort(inputWords);

        Set<Set<String>> actual = toSetOfSets(result);

        assertEquals(expected, actual);
    }

    private static Set<Set<String>> toSetOfSets(List<List<String>> groups) {
        Set<Set<String>> set = new HashSet<>();
        for(List<String> group: groups) {
            set.add(new HashSet<>(group));
        }

        return set;
    }

    private static Stream<Arguments> sourceWords() {
        return Stream.of(
            Arguments.of(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, 
                Set.of(
                    Set.of("eat", "tea", "ate"),
                    Set.of("tan", "nat"),
                    Set.of("bat")
                )
            ),
            // duplicate string case input
            Arguments.of(
                new String[]{"", ""},
                Set.of(new HashSet<>(List.of("", "")))
            ),
            // case-insensitive input
            Arguments.of(
                new String[]{"Eat", "TEA", "Ate"},
                Set.of(Set.of("Eat", "TEA", "Ate"))
            ),
            // only word input
            Arguments.of(
                new String[] {"solo"},
                Set.of(Set.of("solo"))
            ),
            // empty input
            Arguments.of(
                new String[]{},
                Set.of()
            )
        );
    }
}
