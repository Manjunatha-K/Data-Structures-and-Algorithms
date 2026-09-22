package com.learn.DataStructureAndAlgorithms.binarySearch;

import java.util.Arrays;

/*
Find the minimum number of bananas that a koko should eat so the total hours should not exceed the given threshold H
 */
public class KokoEatingBananas {

    private static void findKokoCapacity(int[] arr, int h) {
        int low = 1, high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalhours = findTotalHours(arr, mid);
            if (totalhours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimum number of banana's that a koko should eat per hour  is : " + ans);
    }

    private static int findTotalHours(int[] arr, int mid) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += Math.ceil((double)arr[i] / mid);
        }
        return totalHours;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;
        findKokoCapacity(arr, h);
    }
}
