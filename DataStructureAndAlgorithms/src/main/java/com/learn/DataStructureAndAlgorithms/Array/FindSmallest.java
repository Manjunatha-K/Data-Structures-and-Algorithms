package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallest {
    private static void findSmallestElement(int[] arr) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest)
                largest = arr[i];
        }
        System.out.println("Smallest element in an array is : " + largest);
    }

    private static void findSmallestUsingStreams(int[] arr) {
        int largest = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        System.out.println("Smallest using streams is : " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findSmallestElement(arr);
        findSmallestUsingStreams(arr);
    }
}
