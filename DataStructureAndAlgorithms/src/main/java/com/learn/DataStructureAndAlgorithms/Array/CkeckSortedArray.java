package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Scanner;

public class CkeckSortedArray {
    private static void CheckIfSorted(int[] arr) {
        Boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("The Array is Sorted");
        else
            System.out.println("The Array is not sorted");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        CheckIfSorted(arr);
    }

}
