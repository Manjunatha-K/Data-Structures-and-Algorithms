package com.learn.DataStructureAndAlgorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumBetter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 4, 5, 9};
        int target = 10;
        findTwoSum(arr, target);
    }

    private static void findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (map.containsKey(remaining)) {
                System.out.println("Two fields present at index : " + map.get(remaining) + " and : " + i + " is : " + target);
                return;
            }
            map.put(arr[i], i);
        }

        System.out.println("NO TWO SUM");
    }
}
