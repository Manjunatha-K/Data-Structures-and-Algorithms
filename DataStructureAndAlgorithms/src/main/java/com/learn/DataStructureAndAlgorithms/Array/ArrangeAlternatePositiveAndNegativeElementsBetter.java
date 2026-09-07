package com.learn.DataStructureAndAlgorithms.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrangeAlternatePositiveAndNegativeElementsBetter {
    private static void arrange(int[] pos, int[] neg) {
        List<Integer> list = new ArrayList<>();
        int minSize = Math.min(pos.length, neg.length);
        int[] temp;
        if (pos.length > neg.length) {
            minSize = neg.length;
            temp = pos;
        } else if (pos.length < neg.length) {
            minSize = pos.length;
            temp = neg;
        } else {
            minSize = pos.length;
            temp = neg;
        }
        for (int i = 0; i < minSize; i++) {
            list.add(pos[i]);
            list.add(neg[i]);
        }
        for (int i = minSize; i < temp.length; i++) {
            list.add(temp[i]);

        }
        System.out.println("After arranging");
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int pos[] = {1, 2, 3, 4, 5};
        int neg[] = {-1, -2, -3};
        arrange(pos, neg);
    }


}
