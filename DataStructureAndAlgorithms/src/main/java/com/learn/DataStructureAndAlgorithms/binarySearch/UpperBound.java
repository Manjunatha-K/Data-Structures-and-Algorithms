package com.learn.DataStructureAndAlgorithms.binarySearch;

public class UpperBound {
    private static void findUpperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int upperBoundIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                upperBoundIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (upperBoundIndex < 0)
            System.out.println("Lowerbound doen not exist");
        else
            System.out.println("Lower bound is at index : " + upperBoundIndex);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = -1;

        findUpperBound(arr, target);
    }
}
