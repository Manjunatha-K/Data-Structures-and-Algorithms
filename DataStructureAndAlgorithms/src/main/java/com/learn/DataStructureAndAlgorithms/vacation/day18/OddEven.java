package com.learn.DataStructureAndAlgorithms.vacation.day18;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day08.DLLTraversal;
import com.learn.DataStructureAndAlgorithms.vacation.day11.ArrayToDLL;

public class OddEven {
    private static void divideOddEven(DNode head) {
        if (head == null || head.next == null) {
            return;
        }

        DNode oddHead = head;
        DNode evenHead = head.next;

        DNode odd = oddHead;
        DNode even = evenHead;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd.next.previous = odd;
            odd = odd.next;

            even.next = odd.next;
            if (even.next != null) {
                even.next.previous = even;
            }
            even = even.next;
        }

        odd.next = evenHead;
        evenHead.previous = odd;

        DLLTraversal.forwardTraveral(oddHead);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        divideOddEven(ArrayToDLL.convertArrayToDLL(arr));
    }

}
