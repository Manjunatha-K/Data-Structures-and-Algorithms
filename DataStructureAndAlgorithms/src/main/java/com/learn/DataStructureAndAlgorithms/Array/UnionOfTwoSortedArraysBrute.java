package com.learn.DataStructureAndAlgorithms.Array;

import java.util.*;
import java.util.stream.Collectors;

public class UnionOfTwoSortedArraysBrute {
    private static void findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            set1.add(arr1[i]);
        for (int j = 0; j < arr2.length; j++)
            set1.add(arr2[j]);
        set1.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

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
