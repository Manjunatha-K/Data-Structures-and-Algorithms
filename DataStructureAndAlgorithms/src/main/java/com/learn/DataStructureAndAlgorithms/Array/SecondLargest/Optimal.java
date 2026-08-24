package com.learn.DataStructureAndAlgorithms.Array.SecondLargest;

import java.util.Scanner;

public class Optimal {
    private static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }

        System.out.println("Second Largest Element is : " + secondLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        findSecondLargest(arr);
    }
}
