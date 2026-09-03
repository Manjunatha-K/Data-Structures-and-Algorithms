package com.learn.DataStructureAndAlgorithms.Array;

public class MajorityElementInArrayBrute {
    private static void findMajorityElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter > arr.length / 2) {
                System.out.println("Majority element is : " + arr[i]);
                return;
            }
        }
        System.out.println("NO MAJORITY ELEMENT");
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 1, 1, 0, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 2, 1};
        findMajorityElement(arr);
    }


}
