package com.learn.DataStructureAndAlgorithms.binarySearch;

public class FindUniqueNumberInAnArray {
    private static void findUnique(int[] arr) {
        if(arr.length == 1){
            System.out.println("unique element is : "+ arr[0]);
            return;
        }
        if(arr[0] != arr[1]){
            System.out.println("unique element is : "+ arr[0]);
            return;
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            System.out.println("unique element is : "+ arr[arr.length-1]);
            return;
        }
        int low = 1;
        int high = arr.length-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]){
                System.out.println("unique element is : "+ arr[mid]);
                return;
            }
            if((mid%2== 0 && arr[mid] == arr[mid+1]) || (mid%2 == 1 && arr[mid]== arr[mid-1])){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println("No Unique element in the array");
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        findUnique(arr);
    }
}
