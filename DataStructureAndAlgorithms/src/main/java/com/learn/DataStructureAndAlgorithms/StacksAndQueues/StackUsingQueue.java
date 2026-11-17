package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

// This implementation is good for Updating queue and not for polling the queue
public class StackUsingQueue {

    Queue queue = new LinkedList();
    int size = 10;

    public void push(int x) {
        if (queue.size() == size) {
            System.out.println("Stack is FULL");
            return;
        } else {
            queue.add(x);
            System.out.println("Adding element : " + x + " into the queue and the current size is : " + queue.size());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is EMPTY");
            return -1;
        }
        Queue q2 = new LinkedList();
        while (queue.size() > 1) {
            q2.add(queue.poll());
        }
        Integer temp = (Integer) queue.poll();
        queue.addAll(q2);
        System.out.println("Polled element : " + temp + " from the queue and currentsize is : " + queue.size());
        return temp;
    }

    public int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is EMPTY");
            return -1;
        }
        Queue q2 = new LinkedList();
        while (queue.size() > 1) {
            q2.add(queue.poll());
        }
        Integer temp = (Integer) queue.poll();
        queue.addAll(q2);
        queue.add(temp);
        System.out.println("Peeked element : " + temp + " from the queue and currentsize is : " + queue.size());
        return temp;
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.top();
        stack.pop();
        System.out.println("Stack size : " + stack.size());
        stack.pop();
        stack.pop();
        System.out.println("Stack size : " + stack.size());
        stack.top();
        System.out.println("Stack size : " + stack.size());
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.pop();
        stack.top();
        System.out.println("Stack size : " + stack.size());
    }
}
