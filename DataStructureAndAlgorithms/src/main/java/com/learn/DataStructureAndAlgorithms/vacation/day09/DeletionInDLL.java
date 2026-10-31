package com.learn.DataStructureAndAlgorithms.vacation.day09;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day08.DLLTraversal;

import java.util.Scanner;

public class DeletionInDLL {
    public static void deleteFromDLL(DNode head, int position) {
        if (head != null && head.next == null && position == 1) {
            System.out.println("Head Node deletion from a single element in DLL");
            head = null;
            return;
        } else if (position == 1) {
            System.out.println("Deleting the head node : " + head.data);
            head = head.next;
            head.previous = null;
            DLLTraversal.forwardTraveral(head);
        } else {
            DNode temp = head;
            int counter = 0;
            DNode previous = head;
            while (temp != null) {
                counter++;
                if (counter == position) {
                    System.out.println("Element : " + deleteNode(previous, temp) + " will be deleted");
                    System.out.println("After deleting the element");
                    DLLTraversal.forwardTraveral(head);
                    return;
                }
                previous = temp;
                temp = temp.next;
            }
            System.out.println("Position is greater than the size of the linked list");
            return;
        }
    }

    private static int deleteNode(DNode previous, DNode temp) {
        DNode next = temp.next;
        previous.next = next;
        next.previous = previous;
        temp.previous = null;
        temp.next = null;
        return temp.data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DNode head = new DNode(10);
        DNode n1 = new DNode(head, 20, null);
        DNode n2 = new DNode(n1, 30, null);
        DNode n3 = new DNode(n2, 40, null);
        DNode n4 = new DNode(n3, 50, null);
        DNode n5 = new DNode(n4, 60, null);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println("Enter the position at which the element should be deleted from DLL");
        int position = sc.nextInt();
        deleteFromDLL(head, position);

    }
}
