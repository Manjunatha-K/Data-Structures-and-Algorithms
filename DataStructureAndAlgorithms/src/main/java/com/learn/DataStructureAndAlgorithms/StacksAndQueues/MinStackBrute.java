package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import ch.qos.logback.core.joran.sanity.Pair;

import java.util.Map;
import java.util.Stack;

public class MinStackBrute {
    static Stack<Map.Entry<Integer, Integer>> st = new Stack<>();
    static int min = Integer.MAX_VALUE;

    public static void push(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                st.push(Map.entry(arr[i], arr[i]));
                min = arr[i];
            } else {
                st.push(Map.entry(arr[i], Math.min(arr[i], min)));
                min = Math.min(arr[i], min);
            }
            System.out.println("Entry inserted into stack");
            System.out.println("Value : " + arr[i] + " Min : " + min);
        }

    }


    public static void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            Map.Entry<Integer, Integer> entry = st.pop();
            System.out.println("Popped out entry : Value : " + entry.getKey() + " Min : " + entry.getValue());
        }
    }

    public static void top() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            Map.Entry<Integer, Integer> entry = st.peek();
            System.out.println("Top entry : Value : " + entry.getKey() + " Min : " + entry.getValue());
        }
    }

    public static void getMin() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            Map.Entry<Integer, Integer> entry = st.peek();
            System.out.println("Min Value : " + entry.getValue());
        }
    }

    public static void size() {
        System.out.println("Size : " + st.size());
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7, 9, 1, 5, 6, 78, 0};
        push(arr);
        pop();
        pop();
        top();
        getMin();
        pop();
        pop();
        pop();
        getMin();
        size();
    }
}
