package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindNthRoot {
    private static int findNthRoot(int target, int n) {
        int low = 1, high = target;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int root = findRoot(mid, n, target);
            if (root == 0)
                return mid;
            else if (root == 1)
                high = mid - 1;
            else if (root == -1)
                low = mid + 1;
        }
        return -1;
    }

    private static int findRoot(int mid, int n, int target) {
        int pow = findPower(mid, n);
        if (pow == target)
            return 0;
        else if (pow > target)
            return 1;
        else
            return -1;
    }

    private static int findPower(int mid, int n) {
        int ans = 1;
        while (n > 0) {
            ans = ans * mid;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3, target = 125;
        int root = findNthRoot(target, n);
        System.out.println(root);
    }
}
