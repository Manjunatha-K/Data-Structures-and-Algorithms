package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByDPlacesOptimal {
    private static void LeftRotateByDPlace(int[] arr, int d) {
        d = d % arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println("Array after rotating by d : " + d + " places using optimal soulition is ");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the digits by how many places the array should be rotated");
        int d = sc.nextInt();
        LeftRotateByDPlace(arr, d);
    }
}
