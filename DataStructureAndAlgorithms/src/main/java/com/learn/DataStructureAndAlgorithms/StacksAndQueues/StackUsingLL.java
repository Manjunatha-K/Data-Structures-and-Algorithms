package com.learn.DataStructureAndAlgorithms.StacksAndQueues;




public class StackUsingLL {
    int currentSize = 0;
    Node top;
    int maxSize = 10;

    public void push(int data) {
        Node temp = new Node(data);
        if (currentSize == maxSize) {
            System.out.println("Stack is full");
            return;
        } else {
            temp.next = top;
            top = temp;
            currentSize++;
            System.out.println("Inserted element : " + data + " into stack and the stack size is : " + currentSize);
        }
    }

    public int pop() {
        int data;
        if (currentSize == 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            data = top.data;
            top = top.next;
            currentSize--;
            System.out.println("Deleted element : " + data + " from the stack & current size is : " + currentSize);
        }
        return data;
    }

    public int top() {
        if (currentSize == 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("Top element is : " + top.data);
            return top.data;
        }
    }

    public int size() {
        System.out.println("Current size is : " + currentSize);
        return currentSize;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
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
