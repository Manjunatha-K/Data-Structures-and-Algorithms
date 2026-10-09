package com.learn.DataStructureAndAlgorithms.vacation.day16;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;

public class FindLoopLength {
    private static int findLengthOfALoop(DNode head) {
        DNode slow = head;
        DNode fast = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = fast.next;
                count = 1;
                while (slow != fast) {
                    fast = fast.next;
                    count++;
                }
                System.out.println("Length of the loop is : " + count);
                return count;
            }
        }
        System.out.println("No Loop detected in DLL");
        return -1;
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

        int length = findLengthOfALoop(head);
        System.out.println("In main() : Length is : "+ length);
    }

}
