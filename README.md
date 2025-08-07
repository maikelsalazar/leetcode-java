# LeetCode Solutions in Java

This repository contains Java solutions to selected problems.

## Structure 

Each problem is placed in its own package.

## Solved Problems

| Title | Solution | Test | Notes |
|-------|----------|------|-------|
| [Anagram Checker](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/anagramchecker)| [AnagramChecker.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/anagramchecker/AnagramChecker.java) | [AnagramCheckerTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/anagramchecker/AnagramCheckerTest.java) | Case-insensitive comparison using `HashMap` |
| [Group Anagrams](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/groupanagrams)| [GroupAnagrams.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/groupanagrams/GroupAnagrams.java) | [GroupAnagramsTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/groupanagrams/GroupAnagramsTest.java) | Solved using sorting and character counting |
| [Product of Array Except Self](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/productofarrayexceptself) | [ProductOfArrayExceptSelf.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/productofarrayexceptself/ProductOfArrayExceptSelf.java) | [ProductOfArrayExceptSelfTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/productofarrayexceptself/ProductOfArrayExceptSelfTest.java) | Brute-force and optimized prefix/suffix product approach |
| [Top K Frequent Elements](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/topkfrequentelements) | [TopKFrequentElements.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/topkfrequentelements/TopKFrequentElements.java) | [TopKFrequentElementsTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/topkfrequentelements/TopKFrequentElementsTest.java)  | Solved using heap-based (`PriorityQueue`) and bucket sort approaches |
| [Two Sum](https://github.com/maikelsalazar/leetcode-java/tree/main/src/main/java/com/maikelsalazar/leetcode/twosum) | [TwoSumHashMap.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/twosum/TwoSumHashMap.java), [TwoSumBruteForce.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/main/java/com/maikelsalazar/leetcode/twosum/TwoSumBruteForce.java) | [TwoSumHashMapTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/twosum/TwoSumHashMapTest.java), [TwoSumBruteForceTest.java](https://github.com/maikelsalazar/leetcode-java/blob/main/src/test/java/com/maikelsalazar/leetcode/twosum/TwoSumBruteForceTest.java) | Solved using `HashMap` and brute-force approaches |


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

