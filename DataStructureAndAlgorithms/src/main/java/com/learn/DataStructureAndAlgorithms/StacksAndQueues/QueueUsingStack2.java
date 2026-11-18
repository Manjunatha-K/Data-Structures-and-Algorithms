
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

// Queue using two Stacks - Push Intensive Approach
public class QueueUsingStack2 {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    int size = 10;

    public void push(int x) {
        if (size() >= size) {
            System.out.println("Queue is FULL");
            return;
        }

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        System.out.println("Inserted element: " + x + " | Queue size: " + size()
        );
    }

    public int pop() {

        if (st1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = st1.pop();
        System.out.println("Popped element: " + temp + " | Current size: " + size()
        );

        return temp;
    }

    public int top() {
        if (st1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = st1.peek();
        System.out.println("Front element: " + temp + " | Current size: " + size()
        );

        return temp;
    }

    public int size() {
        return st1.size() + st2.size();
    }

    public static void main(String[] args) {

        QueueUsingStack2 queue = new QueueUsingStack2();

        queue.push(10);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);

        queue.top();

        queue.pop();

        System.out.println("Queue size: " + queue.size());

        queue.pop();
        queue.pop();

        System.out.println("Queue size: " + queue.size());

        queue.top();

        System.out.println("Queue size: " + queue.size());

        queue.push(15);
        queue.push(16);
        queue.push(17);
        queue.push(18);

        queue.pop();
        queue.top();

        System.out.println("Queue size: " + queue.size());
    }
}
