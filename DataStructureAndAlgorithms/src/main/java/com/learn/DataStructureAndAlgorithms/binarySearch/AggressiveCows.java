package com.learn.DataStructureAndAlgorithms.binarySearch;

import java.util.Arrays;

public class AggressiveCows {


    private static void findMaxMinShelters(int[] arr, int cows) {
        arr = Arrays.stream(arr).sorted().toArray();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        int low = 1, high = max - min;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlaceCows(arr, mid, cows)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Maxmimum distance between the cows is : "+ ans);
    }

    private static boolean canWePlaceCows(int[] arr, int mid, int cows) {
        int lastCow = arr[0];
        int cowCounter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastCow >= mid) {
                lastCow = arr[i];
                cowCounter++;
            }
        }
        if (cowCounter >= cows)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        findMaxMinShelters(arr, cows);
    }
}
