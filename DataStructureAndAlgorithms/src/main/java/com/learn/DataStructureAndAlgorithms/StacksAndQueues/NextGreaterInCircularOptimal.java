
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterInCircularOptimal {

    public static void findNextGreaterElements(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }
            st.push(arr[i % n]);
        }

        Arrays.stream(nge).forEach(System.out::println);
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 7, 9, 1, 5, 6, 7, 8, 0};

        findNextGreaterElements(arr);
    }
}
