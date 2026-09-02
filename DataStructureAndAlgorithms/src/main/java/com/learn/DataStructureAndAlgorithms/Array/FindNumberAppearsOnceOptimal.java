package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;

public class FindNumberAppearsOnceOptimal {
    private static void findUniqueNumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = arr[i] ^ xor;
        }
        System.out.println("The Unique element is : " + xor);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4, 5, 6, 6};
        findUniqueNumber(arr);
    }


}
