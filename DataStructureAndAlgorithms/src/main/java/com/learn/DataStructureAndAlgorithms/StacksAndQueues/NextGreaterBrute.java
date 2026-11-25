package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Arrays;

public class NextGreaterBrute {

    public static void findNextGreaterElements(int[] arr) {
        int[] nge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nge[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break;
                }
            }

        }
        Arrays.stream(nge).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7, 9, 1, 5, 6, 7, 8, 0};
        findNextGreaterElements(arr);
    }
}
