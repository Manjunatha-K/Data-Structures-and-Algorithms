package com.learn.DataStructureAndAlgorithms.vacation.day17;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day11.ArrayToDLL;

import java.util.Stack;

public class Palindrom {
    private static void isPalindrom(DNode head) {
        Stack<DNode> st = new Stack<>();
        DNode temp = head;
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            if (st.pop().data != temp.data) {
                System.out.println("Not a palindrom");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Palindrom");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6, 4, 3, 2, 1};
        isPalindrom(ArrayToDLL.convertArrayToDLL(arr));
    }


}
