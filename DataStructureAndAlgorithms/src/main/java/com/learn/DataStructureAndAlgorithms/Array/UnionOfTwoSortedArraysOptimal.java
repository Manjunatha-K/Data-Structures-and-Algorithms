package com.learn.DataStructureAndAlgorithms.Array;

import java.util.*;
import java.util.stream.Collectors;

public class UnionOfTwoSortedArraysOptimal {
    private static void findUnion(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (!result.contains(arr1[i]))
                    result.add(arr1[i]);
                i++;
            } else if (arr1[i] >= arr2[j]) {
                if (!result.contains(arr2[j]))
                    result.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            if (!result.contains(arr1[i]))
                result.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (!result.contains(arr2[j]))
                result.add(arr2[j]);
            j++;
        }
        result.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] arr4 = {4, 5, 6, 7};
        System.out.println("find union between arr1 :  arr2");
        findUnion(arr1, arr2);
        System.out.println("find union between arr1 :  arr3");
        findUnion(arr1, arr3);
        System.out.println("find union between arr1 :  arr4");
        findUnion(arr1, arr4);
        System.out.println("find union between arr2 :  arr3");
        findUnion(arr2, arr3);
        System.out.println("find union between arr2 :  arr4");
        findUnion(arr2, arr4);
        System.out.println("find union between arr3 :  arr4");
        findUnion(arr3, arr4);

    }
}
