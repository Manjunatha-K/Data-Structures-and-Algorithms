package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

public class StackImplUsingArray {
    int[] arr = new int[10];
    int top = -1;
    int currentSize = 0;

    private int size() {
        return currentSize;
    }

    private void top() {
        if (currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Top element is : " + arr[top]);
    }

    private void pop() {
        if (currentSize == 0) {
            System.out.println("Stack is empty");
            return;
        } else {
            int data = arr[top];
            top--;
            System.out.println("Popped element is : " + data);
            currentSize--;
            System.out.println("current size : " + currentSize);
        }
    }

    private void push(int data) {
        if (currentSize >= arr.length) {
            System.out.println("Stack is full");
            return;
        }
        if (currentSize == 0) {
            top = 0;
        } else {
            top = top++;
        }
        this.arr[top] = data;
        currentSize++;
        System.out.println("pushed element : " + data);
        System.out.println("current size : " + currentSize);
    }

    public static void main(String[] args) {
        StackImplUsingArray stack = new StackImplUsingArray();
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
