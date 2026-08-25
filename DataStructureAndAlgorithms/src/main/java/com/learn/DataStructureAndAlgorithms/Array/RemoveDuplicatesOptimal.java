package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesOptimal {
    private static void removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        System.out.println("After removing duplicates : optimal ");
        for (int k = 0; k <= i; k++)
            System.out.println(arr[k]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        System.out.println("The array with duplicates");
        Arrays.stream(arr).forEach(System.out::println);
        removeDuplicates(arr);
    }
}
