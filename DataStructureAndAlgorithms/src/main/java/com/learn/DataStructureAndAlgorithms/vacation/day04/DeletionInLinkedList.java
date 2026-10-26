package com.learn.DataStructureAndAlgorithms.vacation.day04;

import com.learn.DataStructureAndAlgorithms.LinkedList.Node;
import com.learn.DataStructureAndAlgorithms.vacation.day02.PrintLinkedList;
import com.learn.DataStructureAndAlgorithms.vacation.day03.ArrayToLinkedList;

import java.util.Scanner;

import static com.learn.DataStructureAndAlgorithms.vacation.day03.ArrayToLinkedList.converArray;

public class DeletionInLinkedList {

    private static void deleteElement(Node head, int element) {
        if (head == null) {
            System.out.println("L:inked List is empty");
            return;
        } else if (element == head.data) {
            System.out.println("Element is present at the head of a linked list : " + element);
            head = head.next;
            System.out.println("After deleting the element, the linked list is ");
            PrintLinkedList.print(head);
            return;
        } else {
            Node temp = head;
            Node previous = null;
            while (temp != null) {
                if (temp.data == element) {
                    System.out.println("Element is present in the list and will be deleted");
                    previous.next = temp.next;
                    System.out.println("After deleting the element, the linked list is ");
                    PrintLinkedList.print(head);
                    return;
                }
                previous = temp;
                temp = temp.next;
            }
            System.out.println("Element is not present in the linked list");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = converArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the element that needs to be deleted");
        int element = sc.nextInt();
        deleteElement(head, element);
    }


}
