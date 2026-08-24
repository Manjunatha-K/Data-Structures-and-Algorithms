package com.learn.DataStructureAndAlgorithms.sorting;

import java.util.Scanner;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex = findPartitionIndex(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }

    }

    private static int findPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i =low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array to be sorted");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0, size-1);
        System.out.println("After array is sorted");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
