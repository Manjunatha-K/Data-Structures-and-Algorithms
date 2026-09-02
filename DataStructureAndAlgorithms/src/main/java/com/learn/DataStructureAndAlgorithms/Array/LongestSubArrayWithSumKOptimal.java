package com.learn.DataStructureAndAlgorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumKOptimal {
    private static void findLongestSubArrayWithSumK(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = arr[0];
        while (right < arr.length) {
            while (sum > k && left < right) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length)
                sum += arr[right];
        }
        System.out.println("longest sub array is : " + maxLen);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 1, 1, 1, 0, 1};
        int k = 4;
        findLongestSubArrayWithSumK(arr, k);
    }


}
