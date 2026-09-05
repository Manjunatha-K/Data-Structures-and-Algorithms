package com.learn.DataStructureAndAlgorithms.Array;

public class MaximumSubArraySum {
    private static void findMaximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum  subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaximumSum(arr);
    }


}
