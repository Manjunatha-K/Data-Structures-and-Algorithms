package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 4, 5, 9};
        int target = 16;
        findTwoSum(arr, target);
    }

    private static void findTwoSum(int[] arr, int target) {

        arr = Arrays.stream(arr).sorted().toArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                System.out.println("Two fields present  : " + arr[left] + " and : " + arr[right] + " is : " + target);
                return;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println("NO TWO SUM");
    }
}
