package com.learn.DataStructureAndAlgorithms.Array;

public class ReturnSubArrayWithMaxSumOptimal {
    private static int[] findMaximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                start = i+1;
            }

        }
        System.out.println("MaxSum is : " + maxSum);
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] res = findMaximumSum(arr);
        System.out.println("Sub-array with max sum is starting from i: " + res[0] + " and j : " + res[1]);
    }
}
