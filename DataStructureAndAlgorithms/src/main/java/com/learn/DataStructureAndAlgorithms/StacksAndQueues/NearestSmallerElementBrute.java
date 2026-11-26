package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Arrays;
import java.util.stream.Stream;

public class NearestSmallerElementBrute {
    private static void findNearestSmallerElement(int[] arr) {

        int[] nse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nse[i] = -1;
            for (int j = i-1; j >=0; j--) {
                if (arr[j] < arr[i]) {
                    nse[i] = arr[j];
                    break;
                }
            }
        }
        System.out.println("Nearest smaller elements are ");
        Arrays.stream(nse).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 9, 10, 2, 4, 1, 0, 11};
        findNearestSmallerElement(arr);
    }


}
