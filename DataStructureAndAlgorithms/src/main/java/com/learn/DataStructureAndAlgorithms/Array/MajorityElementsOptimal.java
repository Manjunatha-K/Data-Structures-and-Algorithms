package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsOptimal {
    private static void findMajorityElements(int[] arr) {

        List<Integer> result = new ArrayList<>();

        int count1 = 0, count2 = 0, ele1 = 0, ele2 = 0;
        int min = arr.length / 3 + 1;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && ele2 != arr[i]) {
                count1++;
                ele1 = arr[i];
            } else if (count2 == 0 && ele1 != arr[i]) {
                count2++;
                ele2 = arr[i];
            } else if (ele1 == arr[i]) {
                count1++;
            } else if (ele2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (ele1 == arr[i])
                c1++;
            else if (ele2 == arr[i])
                c2++;
        }
        if (c1 >= min)
            result.add(ele1);
        if (c2 >= min)
            result.add(ele2);
        System.out.println("majority elements are");
        result.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 2, 2};
        findMajorityElements(arr);
    }


}
