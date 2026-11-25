package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Map;
import java.util.Stack;

public class MinStackOptimal {
    static Stack<Integer> st = new Stack<>();
    static int min = Integer.MAX_VALUE;

    public static void push(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
                min = arr[i];
            } else {
                int x = arr[i];
                if (x > min)
                    st.push(arr[i]);
                else {
                    int val = 2 * x - min;
                    st.push(val);
                    min = x;
                }
            }
            System.out.println("Entry inserted into stack");
            System.out.println("Value : " + arr[i] + " Min : " + min);
        }

    }


    public static void pop() {
        int x;
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            if (st.peek() >= min) {
                x = st.pop();
            } else {
                x = min;
                min = 2 * min - st.pop();
            }
        }
        System.out.println("popped out element is : " + x + " and Min is : " + min);
    }

    public static void top() {
        int x;
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            if (st.peek() >= min) {
                x = st.peek();
            } else {
                x = min;
            }
        }
        System.out.println("Top element is : " + x + " and Min is : " + min);
    }

    public static void getMin() {
        int x;
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            System.out.println("Min is : " + min);
        }

    }

    public static void size() {
        System.out.println("Size : " + st.size());
    }

    public static void main(String[] args) {
        int[] arr = {16, 12, 15, 10, 11};
        push(arr);
        getMin();
        top();
        pop();
        getMin();
        pop();
        top();
        size();
        pop();
        top();
        getMin();
        pop();
        size();
        top();
        pop();
        size();
        top();
        pop();
        top();
        size();
        pop();
        top();

      /*  pop();
        pop();
        top();
        getMin();
        pop();
        pop();
        pop();
        getMin();
        size();*/
    }
}
