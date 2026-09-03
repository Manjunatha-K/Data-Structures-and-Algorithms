package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;

public class Sort0s1s2s {
    private static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int right = arr.length - 1;
        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, right);
                right--;
            } else {
                System.out.println("BAD DATA");
            }
        }
        System.out.println("Array after sorting");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 1, 1, 0, 2, 2, 2, 0, 0, 1, 1, 2, 1};
        sortArray(arr);
    }


}
