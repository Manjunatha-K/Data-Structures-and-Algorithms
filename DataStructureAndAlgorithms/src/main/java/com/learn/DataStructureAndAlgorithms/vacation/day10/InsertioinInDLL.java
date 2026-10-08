package com.learn.DataStructureAndAlgorithms.vacation.day10;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day08.DLLTraversal;

import java.util.Scanner;

public class InsertioinInDLL {
    public static void insertIntoDLL(DNode head, int position, int element) {
        if (position == 1) {
            System.out.println("Head Node Insertion from a single element in DLL");
            DNode newHead = new DNode(head, element, head.next);
            head.previous = newHead;
            DLLTraversal.forwardTraveral(head);
            return;
        } else {
            DNode temp = head;
            int counter = 0;
            DNode previous = head;
            while (temp != null) {
                counter++;
                if (counter == position) {
                    System.out.println("Element : " + insertNode(previous, temp, element) + " will be Inserted");
                    System.out.println("After Inserting the element");
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

    private static int insertNode(DNode previous, DNode temp, int element) {
        DNode newNode = new DNode(temp.previous, element, temp);
        temp.previous = newNode;
        previous.next = newNode;
        return element;
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
        System.out.println("Enter the value that needs to be inserted");
        int element = sc.nextInt();
        insertIntoDLL(head, position, element);

    }
}
