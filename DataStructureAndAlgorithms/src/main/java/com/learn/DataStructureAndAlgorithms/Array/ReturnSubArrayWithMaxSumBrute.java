package com.learn.DataStructureAndAlgorithms.Array;

public class ReturnSubArrayWithMaxSumBrute {
    private static int[] findMaximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += arr[k];
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("MaxSum is : "+ maxSum);
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] res = findMaximumSum(arr);
        System.out.println("Sub-array with max sum is starting from i: "+res[0]+" and j : "+res[1]);
    }
}
