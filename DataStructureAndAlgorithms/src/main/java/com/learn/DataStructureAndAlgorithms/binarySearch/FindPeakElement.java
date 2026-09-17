package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindPeakElement {
    private static int findPeak(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[n - 1] > arr[n - 2])
            return arr[n - 1];
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return arr[mid];
            else if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else if (arr[mid] > arr[mid + 1])
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1};
        int peakElement = findPeak(arr);
        if (peakElement == -1) {
            System.out.println("No PEAK Element");
        } else {
            System.out.println("Peak element is : " + peakElement);
        }
    }

}
