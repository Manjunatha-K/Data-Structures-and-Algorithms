package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoveZerosToEndOptimal {
    private static void moveZerosToEnd(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                index = i;
                break;
            }
        if (index < 0) {
            System.out.println("No zeros in the Array");
            return;
        }

        for (int j = index + 1; j < arr.length; j++)
            if (arr[j] != 0 && arr[index] == 0) {
                swap(arr, j, index);
                index++;
            }

        System.out.println("Array after removing zeros to end");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int j, int index) {
        int temp = arr[j];
        arr[j] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an Array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        moveZerosToEnd(arr);
    }
}
