package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindHowManyTimesArrayRotated {
    private static void findHowManyTimeArrayIsRotated(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                if(min>=arr[low]){
                    min = arr[low];
                    index = low+1;
                }
                low = mid + 1;
            } else {
                if(min>=arr[mid]){
                    min = arr[mid];
                    index = mid+1;
                }
                high = mid - 1;
            }
        }
        System.out.println("minimum is : " + min);
        System.out.println("The number of times the array is rotated is : "+ index);
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        findHowManyTimeArrayIsRotated(arr);
    }
}
