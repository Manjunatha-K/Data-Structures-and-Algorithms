package com.learn.DataStructureAndAlgorithms.Array;

public class FindNumberAppearsOnceBrute {
    private static void findUniqueNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println("Unique number is : " + arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2, 3,3, 4, 4, 5, 5, 6};
        findUniqueNumber(arr);
    }


}
