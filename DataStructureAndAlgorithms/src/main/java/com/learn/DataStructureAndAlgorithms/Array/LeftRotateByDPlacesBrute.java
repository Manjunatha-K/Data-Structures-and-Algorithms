package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByDPlacesBrute {
    private static void LeftRotateByDPlace(int[] arr, int d) {
        d = d% arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        for (int j = d; j < arr.length; j++)
            arr[j-d] = arr[j];
        for(int k = arr.length-d;k<arr.length;k++)
            arr[k] = temp[k-(arr.length-d)];
        System.out.println("Array after rotating by d : "+d+" places is ");
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
        System.out.println("Enter the digits by how many places the array should be rotated");
        int d = sc.nextInt();
        LeftRotateByDPlace(arr, d);
    }


}
