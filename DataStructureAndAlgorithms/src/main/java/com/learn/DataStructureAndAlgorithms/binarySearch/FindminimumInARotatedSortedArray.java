package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindminimumInARotatedSortedArray {
    private static void findMinimum(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                min = Math.min(arr[low], min);
                low = mid + 1;
            } else {
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }
        }
        System.out.println("minimum is : " + min);
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        findMinimum(arr);
    }
}
