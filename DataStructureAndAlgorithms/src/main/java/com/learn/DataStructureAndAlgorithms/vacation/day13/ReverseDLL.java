package com.learn.DataStructureAndAlgorithms.vacation.day13;

import com.learn.DataStructureAndAlgorithms.LinkedList.DNode;
import com.learn.DataStructureAndAlgorithms.vacation.day08.DLLTraversal;
import com.learn.DataStructureAndAlgorithms.vacation.day11.ArrayToDLL;

public class ReverseDLL {
    private static void reverseDLL(DNode head) {
        DNode temp = head;
        while (temp != null) {
            temp = swap(temp);
        }

        System.out.println("After Reversing DLL");
        DLLTraversal.forwardTraveral(temp);
        DLLTraversal.forwardTraveral(head);
    }

    private static DNode swap(DNode temp) {

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        reverseDLL(ArrayToDLL.convertArrayToDLL(arr));
    }


}
