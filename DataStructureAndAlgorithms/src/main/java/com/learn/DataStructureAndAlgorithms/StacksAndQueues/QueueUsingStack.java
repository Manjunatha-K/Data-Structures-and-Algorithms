package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

//push() intensive
public class QueueUsingStack {
    Stack<Integer> st1 = new Stack<>();
    int size = 10;
    Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        if (st1.size()+st2.size() == size) {
            System.out.println("Size is FULL");
            return;
        } else {
            st1.push(x);
            System.out.println("Pushed element : " + x + " into the queue and the queue size is : " + (st1.size() + st2.size()));
        }
    }

    public int pop() {
        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        int temp = st2.peek();
        System.out.println("Popped element : " + st2.pop() + " current size is " + (st1.size() + st2.size()));
        return temp;
    }

    public int top() {
        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        System.out.println("Start element : " + st2.peek() + " current size is " + (st1.size() + st2.size()));
        return st2.peek();
    }

    public int size() {
        return st1.size() + st2.size();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(10);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);
        queue.top();
        queue.pop();
        System.out.println("queue size : " + queue.size());
        queue.pop();
        queue.pop();
        System.out.println("queue size : " + queue.size());
        queue.top();
        System.out.println("queue size : " + queue.size());
        queue.push(15);
        queue.push(16);
        queue.push(17);
        queue.push(18);
        queue.pop();
        queue.top();
        System.out.println("queue size : " + queue.size());
    }
}
