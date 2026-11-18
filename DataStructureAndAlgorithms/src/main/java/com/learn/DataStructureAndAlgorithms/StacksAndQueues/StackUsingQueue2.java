package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

// This implementation is good for polling queue and not for updating the queue
public class StackUsingQueue2 {

    Queue queue = new LinkedList();
    int size = 10;

    public void push(int x) {
        Queue q2 = new LinkedList();
        if (queue.size() == size) {
            System.out.println("Stack is FULL");
            return;
        } else {
            q2.addAll(queue);
            queue.clear();
            queue.add(x);
            queue.addAll(q2);
            System.out.println("Adding element : " + x + " into the queue and the current size is : " + queue.size());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is EMPTY");
            return -1;
        }
        Integer temp = (Integer) queue.poll();
        System.out.println("Polled element : " + temp + " from the queue and currentsize is : " + queue.size());
        return temp;
    }

    public int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is EMPTY");
            return -1;
        }

        Integer temp = (Integer) queue.peek();
        System.out.println("Peeked element : " + temp + " from the queue and currentsize is : " + queue.size());
        return temp;
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingQueue2 stack = new StackUsingQueue2();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.top();
        stack.pop();
        System.out.println("Stack size : " + stack.size());
        stack.pop();
        stack.pop();
        stack.push(21);
        stack.push(22);
        System.out.println("Stack size : " + stack.size());
        stack.top();
        System.out.println("Stack size : " + stack.size());

        stack.pop();
        stack.top();
        System.out.println("Stack size : " + stack.size());
    }
}
