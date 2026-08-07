package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class GCD {
    private static void findGCD(int num1, int num2) {
        int min = Math.min(num1, num2);
        for (int i = min; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD is : " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number to find the GCD");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number to find the GCD");
        int num2 = sc.nextInt();
        findGCD(num1, num2);
    }
}
