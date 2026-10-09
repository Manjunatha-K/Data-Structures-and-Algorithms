package com.learn.DataStructureAndAlgorithms.vacation.day11;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day08.DLLTraversal;

public class ArrayToDLL {
    public static DNode convertArrayToDLL(int[] arr) {
        DNode head = new DNode(arr[0]);
        DNode temp = head;
        for(int i =1;i<arr.length;i++){
            DNode newNode = new DNode(temp,arr[i],null);
            temp.next = newNode;
            temp = temp.next;
        }
        System.out.println("After converting array to DLL");
        DLLTraversal.forwardTraveral(head);
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        DNode head = convertArrayToDLL(arr);
    }


}
