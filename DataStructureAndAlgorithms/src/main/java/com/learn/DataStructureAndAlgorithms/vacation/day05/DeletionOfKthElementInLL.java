package com.learn.DataStructureAndAlgorithms.vacation.day05;

import com.learn.DataStructureAndAlgorithms.LinkedList.Node;
import com.learn.DataStructureAndAlgorithms.vacation.day02.PrintLinkedList;

import java.util.Scanner;

import static com.learn.DataStructureAndAlgorithms.vacation.day03.ArrayToLinkedList.converArray;

public class DeletionOfKthElementInLL {

    private static void deleteKthElement(Node head, int position) {
        if (head == null) {
            System.out.println("L:inked List is empty");
            return;
        } else if (position == 1) {
            System.out.println("Head Element will be deleted from the linked list : ");
            head = head.next;
            System.out.println("After deleting the element, the linked list is ");
            PrintLinkedList.print(head);
            return;
        } else {
            Node temp = head;
            Node previous = null;
            int counter =0;
            while (temp != null) {
                counter++;
                if (counter == position) {
                    System.out.println(position+" is within in the list and will be deleted");
                    previous.next = temp.next;
                    System.out.println("After deleting the element, the linked list is ");
                    PrintLinkedList.print(head);
                    return;
                }
                previous = temp;
                temp = temp.next;
            }
            System.out.println("position is greater than linked list");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = converArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the Position in a linked list that needs to be deleted");
        int position = sc.nextInt();
        deleteKthElement(head, position);
    }


}
