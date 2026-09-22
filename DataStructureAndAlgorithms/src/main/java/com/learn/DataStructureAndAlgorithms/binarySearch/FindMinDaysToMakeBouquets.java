package com.learn.DataStructureAndAlgorithms.binarySearch;

import java.util.Arrays;

public class FindMinDaysToMakeBouquets {
    private static void findDays(int[] arr, int m, int k) {
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int noOfBouquets = calculateBouquets(arr, mid, k);
            if (noOfBouquets >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Number of bouquets is : " + ans);
    }

    private static int calculateBouquets(int[] arr, int mid, int k) {
        int counter = 0;
        int flowers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                counter++;
            } else {
                flowers += counter / k;
                counter = 0;
            }
        }
        flowers += counter / k;
        return flowers;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;
        findDays(arr, m, k);
    }
}
