package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Scanner;

public class FindMissingNumberBrute {
    private static void FindMissingNumber(int[] arr, int n) {

        for (int j = 1; j <= n; j++) {
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Missing number is : " + j);
                return;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        FindMissingNumber(arr, n);
    }


}
