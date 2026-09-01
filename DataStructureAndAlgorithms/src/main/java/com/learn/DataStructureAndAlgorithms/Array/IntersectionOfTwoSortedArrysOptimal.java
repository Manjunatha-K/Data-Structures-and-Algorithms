package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrysOptimal {
    private static void findIntersection(int[] arr1, int[] arr2) {

        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println("Intersection of two sorted arrays is : ");
        ans.stream().forEach(System.out::println);
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4, 5, 7, 9};
        int[] arr2 = {2, 4, 4, 6, 7, 8};

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 7, 7};
        int[] arr4 = {1, 4, 5, 6, 7, 7, 7, 7, 7, 8};
        System.out.println("find Intersection between arr1 :  arr2");
        findIntersection(arr1, arr2);
        System.out.println("find Intersection between arr1 :  arr3");
        findIntersection(arr1, arr3);
        System.out.println("find Intersection between arr1 :  arr4");
        findIntersection(arr1, arr4);
        System.out.println("find Intersection between arr2 :  arr3");
        findIntersection(arr2, arr3);
        System.out.println("find Intersection between arr2 :  arr4");
        findIntersection(arr2, arr4);
        System.out.println("find Intersection between arr3 :  arr4");
        findIntersection(arr3, arr4);
    }
}
