package com.learn.DataStructureAndAlgorithms.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class MajorityElementInArrayBetter {
    private static void findMajorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        AtomicReference<Boolean> majorityExist = new AtomicReference<>(false);
        map.entrySet().stream().forEach(entry -> {
            if (entry.getValue() > arr.length / 2) {
                System.out.println("Majority element is : " + entry.getKey());
                majorityExist.set(true);
            }
        });
        if (!majorityExist.get())
            System.out.println("NO MAJORITY ELEMENT");
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 1, 1, 0, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 2, 1};
        findMajorityElement(arr);
    }


}
