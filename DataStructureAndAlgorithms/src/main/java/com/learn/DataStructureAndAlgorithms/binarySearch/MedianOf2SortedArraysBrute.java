package com.learn.DataStructureAndAlgorithms.binarySearch;

public class MedianOf2SortedArraysBrute {
    public static void findMedian(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        int previous = 0;
        int current = 0;

        int middle = (n + m) / 2;

        for (int count = 0; count <= middle; count++) {
            previous = current;
            if (i < n && j < m) {
                if (nums1[i] <= nums2[j]) {
                    current = nums1[i];
                    i++;
                } else {
                    current = nums2[j];
                    j++;
                }
            } else if (i < n) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
        }
        if ((n + m) % 2 == 1) {
            System.out.println("Median is : "+ current);
        } else {
            System.out.println("Median is : "+ ((double)previous + current) / 2.0);
        }
    }

public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 7, 10, 12};
        int[] a2 = {2, 3, 5, 6};
        findMedian(a1, a2);
    }
}
