package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Scanner;

public class FindMissingNumberOptimal {
    private static void FindMissingNumber(int[] arr, int n) {
       int sum = n*(n+1)/2;
       int arrSum =0;
       for(int i =0;i<arr.length;i++){
           arrSum+=arr[i];
       }
        System.out.println("Missing number is : "+ (sum - arrSum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3,4,  5};
        int n = 5;

        FindMissingNumber(arr, n);
    }


}
