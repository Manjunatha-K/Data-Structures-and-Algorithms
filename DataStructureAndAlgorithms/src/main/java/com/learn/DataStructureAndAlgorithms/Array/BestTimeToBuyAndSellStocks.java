package com.learn.DataStructureAndAlgorithms.Array;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4, 6, 3};
        int mini = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(cost, profit);
            mini = Math.min(arr[i], mini);
        }
        System.out.println("Maximum profit will be : " + profit);
    }
}
