package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;

public class FindNumberAppearsOnceBetter {
    private static void findUniqueNumber(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] hashArray = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]]++;
        }
        for (int j = 0; j < max + 1; j++)
            if (hashArray[j] == 1) {
                System.out.println("The unique element is : " + j);
                return;
            }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4, 5, 6, 6};
        findUniqueNumber(arr);
    }


}
