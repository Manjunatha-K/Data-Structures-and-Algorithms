package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;

public class LongestConsecutiveSequenceBetter {
    private static void findLongestSequenece(int[] arr) {
        int longest = 1;
        int countCurrent = 0;
        int lastSmaller = Integer.MIN_VALUE;
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            if (lastSmaller == arr[i] - 1) {
                countCurrent++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                countCurrent = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(countCurrent, longest);
        }
        System.out.println("Longest sequence is : " + longest);
    }

    public static void main(String[] args) {
        int[] arr = {104, 2, 4, 5, 101, 100, 102, 3, 103};
        findLongestSequenece(arr);
    }

}
