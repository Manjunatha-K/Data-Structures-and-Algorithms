
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class SumOfSubarrayRanges {

    private static long findSumOfSubarrayRanges(int[] arr) {

        long sumOfMinimums = findSumOfSubarrayMinimums(arr);

        long sumOfMaximums = findSumOfSubarrayMaximums(arr);

        return sumOfMaximums - sumOfMinimums;
    }


    private static long findSumOfSubarrayMinimums(int[] arr) {

        int n = arr.length;
        int[] previousSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            previousSmaller[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nextSmaller[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long total = 0;

        for (int i = 0; i < n; i++) {
            long leftCount = i - previousSmaller[i];
            long rightCount = nextSmaller[i] - i;
            total += (long) arr[i] * leftCount * rightCount;
        }

        return total;
    }


    private static long findSumOfSubarrayMaximums(int[] arr) {

        int n = arr.length;
        int[] previousGreater = new int[n];
        int[] nextGreater = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            previousGreater[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            nextGreater[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long total = 0;

        for (int i = 0; i < n; i++) {

            long leftCount = i - previousGreater[i];
            long rightCount = nextGreater[i] - i;
            total += (long) arr[i] * leftCount * rightCount;
        }

        return total;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println("Sum of Subarray Ranges: " + findSumOfSubarrayRanges(arr)
        );
    }
}
