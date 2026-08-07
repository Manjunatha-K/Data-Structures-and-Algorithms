package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class Divisors {
    private static void printAllDivisors(int num){
        for(int i =1;i*i <= num;i++){
            if(num%i == 0){
                System.out.println("The Divisor is : "+ i);
                if(num/i != i)
                    System.out.println("The divisor is : "+(num/i));
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print all the divisors");
        int num = sc.nextInt();
        printAllDivisors(num);
    }
}
