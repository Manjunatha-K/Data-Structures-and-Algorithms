package com.learn.DataStructureAndAlgorithms.vacation.day03;

import com.learn.DataStructureAndAlgorithms.LinkedList.Node;
import com.learn.DataStructureAndAlgorithms.vacation.day02.PrintLinkedList;

public class ArrayToLinkedList {

    public static Node converArray(int[] arr) {
        if(arr.length ==0)
            return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i =1;i<arr.length;i++){
            Node n = new Node(arr[i]);
            temp.next = n;
            temp = temp.next;
        }
        System.out.println("After converting Array to List : ");
        PrintLinkedList.print(head);

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       Node head = converArray(arr);
    }
}
