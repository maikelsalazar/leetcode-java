package com.maikelsalazar.leetcode.topkfrequentelements;

import java.util.Comparator;
import java.util.HashMap;
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
}
