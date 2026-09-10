package com.learn.DataStructureAndAlgorithms.Array;

import java.util.*;

public class Find3SumBrute {
    private static void findThreeSum(int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        ans.add(list);
                    }
                }
            }
        }
        System.out.println("Triplets are : ");
        ans.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] arr2 = {1, 0, 2, -1, 0, 1, 2, -2, 1, -1, 0, 0};
        findThreeSum(arr);
        findThreeSum(arr2);
    }
}
