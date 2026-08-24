package com.learn.DataStructureAndAlgorithms.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindLargest {
    private static void findLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("Largest element in an array is : " + largest);
    }

    private static void findLargestUsingStreams(int[] arr) {
        int largest = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        System.out.println("Largest using streams is : " + largest);
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
        findLargestElement(arr);
        findLargestUsingStreams(arr);
    }
}
