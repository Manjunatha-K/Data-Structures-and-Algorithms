package com.learn.DataStructureAndAlgorithms.binarySearch;

import java.util.Arrays;

public class FindSmallestDivisorGivenThresold {
    private static void findSmallestDivisor(int[] arr, int thresold) {
        int low = 1, high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findDivisor(arr, mid, thresold)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (ans > 0)
            System.out.println("Smallest Divisor is : " + ans);
        else
            System.out.println("No Smallest Divisor");
    }

    private static boolean findDivisor(int[] arr, int mid, int thresold) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / mid);
        }
        if (sum > thresold)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7};
        int thresold = 6;
        findSmallestDivisor(arr, thresold);
    }


}
