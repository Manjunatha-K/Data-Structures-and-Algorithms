package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class PrintLinearlyFrom1ToN {
    private static void printLinearly(int counter, int n) {
        if (counter > n)
            return;
        System.out.println(counter);
        printLinearly(++counter, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = sc.nextInt();
        printLinearly(1, n);
    }
}
