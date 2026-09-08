package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindLeadersInAnArrayOptimal {

    private static void findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Integer max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                result.add(arr[i]);
                max = Math.max(max, arr[i]);
            }
        }
        System.out.println("Leaders are");
        result.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 13, 14, 0, 6};
        findLeaders(arr);
    }


}
