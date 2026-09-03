package com.learn.DataStructureAndAlgorithms.Array;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElementInArrayOptimal {
    private static void findMajorityElement(int[] arr) {
        int counter = 0;
        int element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (counter == 0) {
                element = arr[i];
                counter++;
            } else if (arr[i] == element)
                counter++;
            else counter--;
        }
        AtomicInteger newCounter = new AtomicInteger();
        int finalElement = element;
        Arrays.stream(arr).forEach(i -> {
            if (i == finalElement) {
                newCounter.getAndIncrement();
            }
        });
        if (newCounter.get() > arr.length / 2) {
            System.out.println("Majority element is : " + element);
        } else {
            System.out.println("NO Majority Element");
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 1, 1, 0, 2, 2, 2, 0, 0, 1,  1, 2, 1};
        findMajorityElement(arr);
    }


}
