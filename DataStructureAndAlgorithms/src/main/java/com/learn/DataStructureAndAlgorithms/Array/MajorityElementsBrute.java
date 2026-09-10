package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsBrute {
    private static void findMajorityElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = arr.length / 3 + 1;
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count >= min)
                list.add(arr[i]);
        }
        System.out.println("majority elements are");
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 2, 2};
        findMajorityElements(arr);
    }


}
