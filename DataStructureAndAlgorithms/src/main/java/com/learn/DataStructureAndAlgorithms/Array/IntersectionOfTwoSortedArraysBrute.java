package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArraysBrute {

    private static void findIntersection(int[] arr1, int[] arr2) {
        int[] hashArray = new int[arr2.length];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && hashArray[j] == 0) {
                    ans.add(arr1[i]);
                    hashArray[j]++;
                    break;
                }else if(arr1[i]<arr2[j]){
                    break;
                }
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

