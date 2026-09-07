package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindNextPermutation {
    private static void findNextPermutation(int[] arr) {

        int index = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Next Permutation is : ");
            reverse(arr, 0, arr.length - 1);
            Arrays.stream(arr).forEach(System.out::println);
            return;
        }
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }
        reverse(arr, index + 1, arr.length - 1);
        System.out.println("Next Permutation is : ");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        findNextPermutation(arr);
    }


}
