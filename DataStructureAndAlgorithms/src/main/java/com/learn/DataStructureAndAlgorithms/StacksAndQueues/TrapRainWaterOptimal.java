package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

public class TrapRainWaterOptimal {
    private static void findTotalCapacityOfWaterTank(int[] arr) {
        int total = 0;
        int leftMax = 0, rightMax = 0;
        int l = 0;
        int r = arr.length-1;

        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] > leftMax)
                    leftMax = arr[l];
                else {
                    total += leftMax - arr[l];
                }
                l++;
            } else {
                if (arr[r] > rightMax)
                    rightMax = arr[r];
                else {
                    total += rightMax - arr[r];
                }
                r--;
            }
        }
        System.out.println("Total capacity of rain water is : " + total);
    }

    private static int[] findRightMax(int[] arr, int[] rightMax) {
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        return rightMax;
    }

    private static int[] findLeftMax(int[] arr, int[] leftMax) {
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        return leftMax;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        findTotalCapacityOfWaterTank(arr);
    }


}
