package com.learn.DataStructureAndAlgorithms.binarySearch;

import java.util.Arrays;

public class LeastCapacityOfAShip {
    private static void findShipCapacity(int[] arr, int days) {
        int low = Arrays.stream(arr).max().getAsInt();
        int n = arr.length;
        int ans = -1;
        int high = n*(n+1)/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(findShipingDays(arr,days,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("Ship capacity should be : "+ ans);
    }

    private static boolean findShipingDays(int[] arr, int days, int mid) {
        int load =0;
        int day =1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]+load<=mid){
                load+=arr[i];
            }else{
                load = arr[i];
                day++;
            }
        }
        if(days>= day)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        findShipCapacity(arr,days);
    }
}
