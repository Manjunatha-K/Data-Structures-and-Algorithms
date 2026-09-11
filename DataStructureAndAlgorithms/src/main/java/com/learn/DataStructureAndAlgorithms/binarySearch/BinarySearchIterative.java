package com.learn.DataStructureAndAlgorithms.binarySearch;

public class BinarySearchIterative {
    private static void findTargetUsingBinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("target : " + target + " is found at index : " + mid);
                return;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Target :" + target + " does not exist in the array");
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;

        findTargetUsingBinarySearch(arr, target);
    }
}
