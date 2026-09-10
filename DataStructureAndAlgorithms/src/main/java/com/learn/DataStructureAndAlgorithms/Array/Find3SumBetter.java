package com.learn.DataStructureAndAlgorithms.Array;

import java.util.*;

public class Find3SumBetter {
    private static void findThreeSum(int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = i + 1; j < arr.length - 1; j++) {
                int third = -(arr[i] + arr[j]);
                if (temp.contains(third)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(third);
                    Collections.sort(list);
                    ans.add(list);
                }
                temp.add(arr[j]);
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
