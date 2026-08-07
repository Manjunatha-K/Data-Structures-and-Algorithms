package com.learn.DataStructureAndAlgorithms.recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    private static int findFactorial(int factorial, int n) {
        if(n<1)
            return factorial;
        return findFactorial(factorial*n, --n);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int n = sc.nextInt();
       int factorial = findFactorial(1,n);
        System.out.println("factorial is : "+factorial);
    }


}
