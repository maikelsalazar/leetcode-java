package com.maikelsalazar.leetcode.topkfrequentelements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] findTopFrequent(int[] list, int topK) {
        if (list == null || list.length == 0) {
            return new int[] {};
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        for (int number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > topK) {
                minHeap.poll();
            }
        }

        int[] result = new int[topK];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }

        return result;
    }

    public int[] findTopFrequentBucketSort(int[] numbers, int k) {
        if (numbers == null || numbers.length == 0)
            return new int[0];

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[numbers.length + 1];
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int num = entry.getKey();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        return result.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
