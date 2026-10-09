package com.learn.DataStructureAndAlgorithms.vacation.day14;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;

public class DetectLoopInDLL {

    private static void detectLoop(DNode head) {
        DNode slow = head;
        DNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println("Detected a loop ");
                return;
            }
        }
        System.out.println("No Loop detected in DLL");
    }
    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode n1 = new DNode(head, 20, null);
        DNode n2 = new DNode(n1, 30, null);
        DNode n3 = new DNode(n2, 40, null);
        DNode n4 = new DNode(n3, 50, null);
        DNode n5 = new DNode(n4, 60, null);
        DNode n6 = new DNode(n5, 70, null);
        DNode n7 = new DNode(n6, 80, null);
        DNode n8 = new DNode(n7, 90, null);
        DNode n9 = new DNode(n8, 100, null);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n4;

        detectLoop(head);

    }


}
