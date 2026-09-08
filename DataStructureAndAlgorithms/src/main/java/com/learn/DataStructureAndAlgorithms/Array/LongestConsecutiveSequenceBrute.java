package com.learn.DataStructureAndAlgorithms.Array;

public class LongestConsecutiveSequenceBrute {
    private static void findLongestSequenece(int[] arr) {
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int x = arr[i];
            while (true) {
                Boolean isfound = false;
                for (int j = 0; j < arr.length; j++) {
                    if (x+1 == arr[j]) {
                        count++;
                        x = x + 1;
                        isfound = true;
                        break;

                    }
                }
                if (!isfound)
                    break;
            }
            longest = Math.max(count, longest);
        }
        System.out.println("Longest sequence is : " + longest);
    }

    public static void main(String[] args) {
        int[] arr = {104, 2, 4, 5, 101, 100, 102, 3, 103};
        findLongestSequenece(arr);
    }


}
