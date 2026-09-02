package com.learn.DataStructureAndAlgorithms.Array;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1,};
        FindMaximumConsecutiveOnes(arr);
    }

    private static void FindMaximumConsecutiveOnes(int[] arr) {
        int counter = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                counter = Math.max(counter, count);
            } else {
                count = 0;
            }
        }
        System.out.println("Maximum consecutive ones are : " + counter);
    }
}
