package com.learn.DataStructureAndAlgorithms.binarySearch;

public class MedianOf2SortedArraysOptimal {
    private static void findMedian(int[] a1, int[] a2) {
        int m = a1.length;
        int n = a2.length;

        if (m > n) {
            findMedian(a2, a1);
            return;
        }
        int leftSize = (n + m + 1) / 2;
        int low = 0;
        int high = m;
        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = leftSize - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : a1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : a2[cut2 - 1];
            int r1 = cut1 == m ? Integer.MAX_VALUE : a1[cut1];
            int r2 = cut2 == n ? Integer.MAX_VALUE : a2[cut2];
            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 1) {
                    System.out.println("Median is : " + Math.max(l1, l2));
                    return;
                } else {
                    System.out.println("Median is : " + ((double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0));
                    return;
                }
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 7, 10, 12};
        int[] a2 = {2, 3, 5, 6};
        findMedian(a1, a2);
    }
}
