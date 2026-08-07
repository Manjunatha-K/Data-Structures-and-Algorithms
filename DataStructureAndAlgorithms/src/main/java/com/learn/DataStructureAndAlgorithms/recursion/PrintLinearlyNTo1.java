package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class PrintLinearlyNTo1 {

    private static void printNto1(int n) {
        if(n<1)
            return;
        System.out.println(n);
        printNto1(--n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        printNto1(n);
    }

}
