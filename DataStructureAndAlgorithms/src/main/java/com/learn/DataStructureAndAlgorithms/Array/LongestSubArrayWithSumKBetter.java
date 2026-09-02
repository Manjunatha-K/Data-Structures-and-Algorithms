package com.learn.DataStructureAndAlgorithms.Array;

public class LongestSubArrayWithSumKBetter {
    private static void findLongestSubArrayWithSumK(int[] arr, int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i);
                    System.out.println("i : " + i + " j : " + j + " len : " + maxLen);
                }
            }
        }
        System.out.println("Longest sub-array with sum K: " + k + " is : " + maxLen);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 1, 1, 1, 1, 3, 0, 0, 4, 6};
        int k = 3;
        findLongestSubArrayWithSumK(arr, k);
    }


}
