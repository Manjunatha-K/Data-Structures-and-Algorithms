package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class ReverseANumber {
    private static int reverse(int n){
        int result =0;
        while(n!=0){
            result = result*10+(n%10);
            n = n/10;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n = sc.nextInt();
        int reversedNumber = reverse(n);
        System.out.println("Reversed number is : "+reversedNumber);
    }
}
