package com.learn.DataStructureAndAlgorithms.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    private static Boolean findArmstrongNumber(int num) {
        int result = 0;
        int temp = num;
        int pow = countDigits(num);
        while (temp != 0) {
            int digit = temp % 10;
            result = result + findPow(digit, pow);
            temp = temp/10;
        }
        if (result == num) {
            return true;
        } else
            return false;
    }

    private static int findPow(int number, int power) {
        int result = 1;
        while (power != 0) {
            result = result * number;
            power--;
        }
        System.out.println("power of a number : "+number +" is "+result);
        return result;
    }

    private static int countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            digits++;
            num = num / 10;
        }
        System.out.println("power is : "+digits);
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if the number is ARMSTRONG NUMBER or NOT");
        int num = sc.nextInt();
        Boolean isArmstrong = findArmstrongNumber(num);
        if (isArmstrong)
            System.out.println("The number entered : " + num + " is ARMSTRONG NUMBER");
        else
            System.out.println("The number entered : " + num + " is NOT an ARMSTRONG NUMBER");
    }
}
