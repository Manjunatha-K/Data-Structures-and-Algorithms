package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsBetter {
    private static void findMajorityElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int min = arr.length / 3 + 1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 1) + 1);
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > min)
                result.add(set.getKey());
        }
        System.out.println("majority elements are");
        result.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 2, 2};
        findMajorityElements(arr);
    }


}
