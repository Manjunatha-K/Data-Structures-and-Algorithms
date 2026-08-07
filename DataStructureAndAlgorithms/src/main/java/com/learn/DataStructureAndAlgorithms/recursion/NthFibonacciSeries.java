package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class NthFibonacciSeries {
    private static int findfibonaccie(int n) {
        if(n<=1)
            return n;
        return findfibonaccie(n-1)+ findfibonaccie(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the nth fibonacci series");
        int n = sc.nextInt();
        System.out.println(findfibonaccie(n));

    }


}
