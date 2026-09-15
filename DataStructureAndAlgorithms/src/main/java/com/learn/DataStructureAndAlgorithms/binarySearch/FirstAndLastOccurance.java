package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FirstAndLastOccurance {
    private static void findFirstAndLastOccurance(int[] arr, int target) {
        int firstOccurance = -1;
        int lastOccurance = -1;
        firstOccurance = findFirst(arr, target);
        if (firstOccurance < 0) {
            System.out.println("The number doesn't exists in the array");
            return;
        }
        lastOccurance = findLast(arr, target);
        System.out.println("first occurance is at index : " + firstOccurance);
        System.out.println("Last occurance is at index : " + lastOccurance);
    }

    private static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 9, 10};
        int target = 8;
        findFirstAndLastOccurance(arr, target);
    }
}
