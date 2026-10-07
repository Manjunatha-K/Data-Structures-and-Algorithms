package com.learn.DataStructureAndAlgorithms.vacation.day06;

import com.learn.DataStructureAndAlgorithms.LinkedList.Node;
import com.learn.DataStructureAndAlgorithms.vacation.day02.PrintLinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

import static com.learn.DataStructureAndAlgorithms.vacation.day03.ArrayToLinkedList.converArray;

public class ElementInsertionAtKthPositionInLL {
    private static void InsertionAtKthPosition(Node head, int position, int element) {
        if (head == null && position == 1) {
            head.data = element;
            System.out.println("After inserting at the head : ");
            PrintLinkedList.print(head);
            return;
        } else if(position == 1){
            Node newHead = new Node(element,head);
            System.out.println("After inserting at the head : ");
            PrintLinkedList.print(newHead);
        }
        else {
            int counter = 0;
            Node temp = head;
            Node previous = null;
            while (temp != null) {
                counter++;
                if (counter == position) {
                    Node n = new Node(element);
                    previous.next = n;
                    n.next = temp;
                    System.out.println("After inserting element in a LL");
                    PrintLinkedList.print(head);
                    return;
                }
                previous = temp;
                temp = temp.next;
            }

            System.out.println("Position is greater than the length of the linked list");
            Node newNode = new Node(element);
            previous.next = newNode;
            System.out.println("After inserting element at the end of LL");
            PrintLinkedList.print(head);
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        Node head = converArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the position at which the element needs to be Inserted in linked list");
        int position = sc.nextInt();
        System.out.println("Enter the element that needs to be Inserted in linked list");
        int element = sc.nextInt();
        InsertionAtKthPosition(head, position, element);
    }


}
