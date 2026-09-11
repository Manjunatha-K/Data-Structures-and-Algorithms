package com.learn.DataStructureAndAlgorithms.binarySearch;

public class BinarySearchRecursive {

    private static int findTargetUsingBinarySearchRecusrive(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target)
            return findTargetUsingBinarySearchRecusrive(arr, 0, mid - 1, target);
        else
            return findTargetUsingBinarySearchRecusrive(arr, mid + 1, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = -2;
        int index = findTargetUsingBinarySearchRecusrive(arr, 0, arr.length - 1, target);
        System.out.println("target : " + target + " is found at index : " + index);
    }
}


