package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindLeadersInAnArray {

    private static void findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                result.add(arr[i]);
        }
        System.out.println("Leaders are");
        result.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 13, 14, 0, 6};
        findLeaders(arr);
    }


}
