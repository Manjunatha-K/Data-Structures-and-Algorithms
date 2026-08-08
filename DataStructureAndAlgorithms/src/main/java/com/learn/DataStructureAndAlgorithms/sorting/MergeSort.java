package com.learn.DataStructureAndAlgorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    private static void sort(int[] arr, int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        mergeSort(arr,low,mid,high);
    }

    private static void mergeSort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]) {
                temp.add(right);
                right++;
            }else{
                temp.add(left);
                left++;
            }
        }

        while(left<=mid){
            temp.add(left);
            left++;
        }
        while(right<=high){
            temp.add(right);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        System.out.println("After array is sorted");
        for (int i = 0; i < high+1; i++) {
            System.out.println(arr[i]);
        }
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
        sort(arr,0, size-1);
    }
}
