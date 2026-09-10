package com.learn.DataStructureAndAlgorithms.Array;

import java.util.*;

public class Find3SumOptimal {
    private static void findThreeSum(int[] arr) {

        Set<List<Integer>> ans = new HashSet<>();
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                }
            }
        }
        System.out.println("Triplets are : ");
        ans.stream().forEach(System.out::println);
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] arr2 = {1, 0, 2, -1, 0, 1, 2, -2, 1, -1, 0, 0};
        findThreeSum(arr);
        findThreeSum(arr2);
    }
}
