package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindSqruUsingBS {
    private static void findSqrt(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (ans == 0)
            System.out.println("No SQUARE ROOT");
        else
            System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 99;
        findSqrt(n);
    }


}
