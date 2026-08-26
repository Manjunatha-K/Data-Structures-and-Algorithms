package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByOne {
    public static void LeftRotateByOnePlace(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = temp;
        System.out.println("After Rotating the Array by One place");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        LeftRotateByOnePlace(arr);
    }
}
