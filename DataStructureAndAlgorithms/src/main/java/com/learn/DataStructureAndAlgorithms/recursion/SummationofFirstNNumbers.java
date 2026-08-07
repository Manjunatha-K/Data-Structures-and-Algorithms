package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class SummationofFirstNNumbers {
    private static int findSum(int sum, int n) {
        if(n <0)
            return sum;
        return findSum(sum+n,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to find the summation");
        int n = sc.nextInt();
        int sum = findSum(0,n);
        System.out.println("Sum is : "+sum);
    }


}
