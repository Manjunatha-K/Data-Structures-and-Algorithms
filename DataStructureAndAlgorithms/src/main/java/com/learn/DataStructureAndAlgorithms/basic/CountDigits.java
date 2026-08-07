package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class CountDigits {

    private static int findNumOfDigits(int n){
        int counter=0;
        while(n>0){
            counter++;
            n = n/10;
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digits");
        int n = sc.nextInt();
        int count = findNumOfDigits(n);
        System.out.println("Number of digits in a number : "+n +" is : "+count);
    }
}
