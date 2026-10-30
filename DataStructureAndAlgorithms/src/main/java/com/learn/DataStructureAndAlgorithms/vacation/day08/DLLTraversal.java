package com.learn.DataStructureAndAlgorithms.vacation.day08;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;

public class DLLTraversal {

    public static void forwardTraveral(DNode head) {
        DNode temp = head;
        System.out.println("Forward Traversal");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void backwardTraveral(DNode head) {
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("Backward Traversal");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }
}
