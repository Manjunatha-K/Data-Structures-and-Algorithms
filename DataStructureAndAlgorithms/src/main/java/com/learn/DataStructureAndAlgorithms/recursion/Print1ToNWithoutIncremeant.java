package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class Print1ToNWithoutIncremeant {
    private static void print1ToN(int i,int n) {
        if(i<0)
            return;
        print1ToN(i-1,n);
        System.out.println(i);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        print1ToN(n,n);
    }


}
