package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOptimal {
    private static void findLongestSequenece(int[] arr) {
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }
        for (Integer ele : set) {

            if (!set.contains(ele - 1)) {
                int count = 1;
                int x = ele;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(count, longest);
            }

        }
        System.out.println("Longest sequence is : " + longest);
    }

    public static void main(String[] args) {
        int[] arr = {104, 2, 4, 5, 101, 100, 102, 3, 103};
        findLongestSequenece(arr);
    }


}
