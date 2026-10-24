package com.learn.DataStructureAndAlgorithms.vacation.day02;

import com.learn.DataStructureAndAlgorithms.LinkedList.Node;

public class PrintLinkedList {

    public static void print(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
