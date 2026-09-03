package com.learn.DataStructureAndAlgorithms.Array;

public class TwoSumBrute {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 4, 5, 9};
        int target = 19;
        findTwoSum(arr, target);
    }

    private static void findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Two fields present at index : " + i + " and :" + j + " is : " + target);
                    return;
                }
            }
        }
        System.out.println("NO TWO SUM");
    }
}
