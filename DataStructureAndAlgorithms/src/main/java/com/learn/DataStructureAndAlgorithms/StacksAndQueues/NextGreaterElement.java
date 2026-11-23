
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    private static int[] findNextGreater(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextGreater(arr);
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Next Greater: " + Arrays.toString(result));
    }
}
