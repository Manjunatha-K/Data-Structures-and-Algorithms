package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveBuplicatesBrute {
    private static void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("After removing duplicates");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5,5,6};
        System.out.println("The array with duplicates");
        Arrays.stream(arr).forEach(System.out::println);
        removeDuplicates(arr);
    }

}
