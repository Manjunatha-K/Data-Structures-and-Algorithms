package com.learn.DataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class PrintNameNTiimes {
    private static void printName(String name, int n) {
        if(n>0){
            System.out.println(name);
            printName(name, --n);
        }
        return;
    }
    public static void main(String[] atgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be printed");
        String name = sc.next();
        System.out.println("Enter the Number of times you want your name to be printed");
        int n = sc.nextInt();
        printName(name,n);
    }


}
