package com.learn.DataStructureAndAlgorithms.vacation.day12;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day11.ArrayToDLL;

public class FindMiddleElement {
    public static void findMiddleElement(DNode head) {
        DNode slow = head;
        DNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element is : " + slow.data);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        findMiddleElement(ArrayToDLL.convertArrayToDLL(arr));
    }


}
