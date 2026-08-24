package com.learn.DataStructureAndAlgorithms.sorting;

import java.util.Scanner;

public class SelectionSort {

    private static void sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println("After array is sorted");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array to be sorted");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }
        sort(arr, size);
    }
}
