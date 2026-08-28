package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoveZerosToEndBrute {
    private static void moveZerosToEnd(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }
        for (int j = 0; j < temp.size(); j++) {
            arr[j] = temp.get(j);
        }
        for (int k = temp.size(); k < arr.length; k++) {
            arr[k] = 0;
        }
        System.out.println("Array after removing zeros to end");
        Arrays.stream(arr).forEach(System.out::println);
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
