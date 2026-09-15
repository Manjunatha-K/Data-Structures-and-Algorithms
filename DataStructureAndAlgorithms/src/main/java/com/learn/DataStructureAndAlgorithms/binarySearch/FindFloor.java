package com.learn.DataStructureAndAlgorithms.binarySearch;

//The floor of x is the largest element in the array which is smaller than or equal to x.
public class FindFloor {
    private static void findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Flor is at index : "+ ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int target = 8;
        findFloor(arr, target);
    }

}
