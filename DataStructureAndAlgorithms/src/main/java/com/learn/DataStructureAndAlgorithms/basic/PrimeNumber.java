package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class PrimeNumber {

    private static void findPrime(int num){
        int count =0;
        for(int i =1;i<=num;i++){
            if(num%i ==0)
                count++;
        }
        if(count==2)
            System.out.println("Number is : "+num+" is a PRIME NUMBER");
        else
            System.out.println("Number is : "+num+" is NOT a PRIME NUMBER");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's a PRIME number or not");
        int num = sc.nextInt();
        findPrime(num);
    }
}
