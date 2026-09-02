package com.learn.DataStructureAndAlgorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumKBetter2 {
    private static void findLongestSubArrayWithSumK(int[] arr, int k) {
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int remaining = sum - k;
            if (map.containsKey(remaining)) {
                int len = i - map.get(remaining);
                maxLen = Math.max(maxLen, len);
            }
            map.put(sum, i);
        }
        System.out.println("longest sub array is : " + maxLen);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 1, 1, 1, 0, 1};
        int k = 4;
        findLongestSubArrayWithSumK(arr, k);
    }


}
