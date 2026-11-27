
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class SumOfSubarrayMinimums {

    private static int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] previousSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                previousSmaller[i] = -1;
            } else {
                previousSmaller[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nextSmaller[i] = n;
            } else {
                nextSmaller[i] = st.peek();
            }
            st.push(i);
        }

        long total = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < n; i++) {

            long leftCount = i - previousSmaller[i];
            long rightCount = nextSmaller[i] - i;

            long contribution = (long) arr[i] * leftCount * rightCount;
            total = (total + contribution) % mod;
        }
        return (int) total;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};
        System.out.println("Sum of Subarray Minimums: " + sumSubarrayMins(arr)
        );
    }
}
