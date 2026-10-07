package com.learn.DataStructureAndAlgorithms.vacation.day01;
import com.learn.DataStructureAndAlgorithms.LinkedList.Node;
import com.learn.DataStructureAndAlgorithms.vacation.day02.PrintLinkedList;

public class LinkedListImpl {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);
        Node temp4 = new Node(5);
        Node temp5 = new Node(6);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;

        PrintLinkedList.print(head);
    }
}
