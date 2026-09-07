package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrangeAlternatePositiveAndNegativeElements {
    private static void arrange(int[] pos, int[] neg) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < pos.length; i++) {
            list.add(pos[i]);
            list.add(neg[i]);
        }
        System.out.println("After arranging");
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int pos[] = {1, 2, 3};
        int neg[] = {-1, -2, -3};
        arrange(pos, neg);
    }


}
