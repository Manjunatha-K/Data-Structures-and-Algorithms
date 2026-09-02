package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Scanner;

public class FindMissingNumberBetter {
    private static void FindMissingNumber(int[] arr, int n) {
        int[] hashArray = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]]++;
        }
        for (int j = 1; j < n + 1; j++) {
            if (hashArray[j] == 0) {
                System.out.println("Missing number is : " + j);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5};
        int n = 5;

        FindMissingNumber(arr, n);
    }


}
