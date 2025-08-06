# LeetCode Solutions in Java

This repository contains Java solutions to selected problems.

## Structure 

Each problem is placed in its own package.

## Solved Problems

| Title | Solution | Test | Notes |
|-------|----------|------|-------|
| [Anagram Checker](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/anagramchecker)| [AnagramChecker](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/anagramchecker/AnagramChecker.java) | [AnagramCheckerTest](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/anagramchecker/AnagramCheckerTest.java) | Case-insensitive comparison, uses HashMap |
| [Group Anagrams](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/groupanagrams)| [GroupAnagrams](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/groupanagrams/GroupAnagrams.java) | [GroupAnagramsTest](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/groupanagrams/GroupAnagramsTest.java) | Solved using sorting and character counting |
| [Two Sum](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/twosum) | [TwoSumHashMap](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/twosum/TwoSumHashMap.java) [TwoSumBruteForce](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/twosum/TwoSumBruteForce.java) | [TwoSumHashMapTest](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/twosum/TwoSumHashMapTest.java) [TwoSumBruteForceTest](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/twosum/TwoSumBruteForceTest.java) | HashMap and brute-force implementations |

## Testing
1. Make sure you have **JDK 17+** and **Maven** installed.
2. Clone the repository:
```bash
git clone https://github.com/maikelsalazar/leetcode-java.git
cd leetcode-java
```
3. Run the tests:
```bash
mvn test
```

