package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class Palindrom {

    private static void task(int n){
        int temp = n;
        int palindrome = 0;

        while(temp!=0){
            palindrome = palindrome*10 +(temp%10);
            temp = temp/10;
        }
        if(palindrome == n)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome");
        int n = sc.nextInt();
        task(n);
    }

}
