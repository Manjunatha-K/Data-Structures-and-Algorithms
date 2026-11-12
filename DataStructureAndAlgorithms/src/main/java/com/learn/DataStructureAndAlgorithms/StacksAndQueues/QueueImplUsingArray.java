package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Scanner;

public class QueueImplUsingArray {
    int[] arr = new int[10];
    int start = -1;
    int end = -1;
    int currentSize = 0;

    private int size() {
        return currentSize;
    }

    private void top() {
        if (currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Top element is : "+arr[start]);
    }

    private void pop() {
        if (currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }else{
            int data = arr[start];
            start= (start+1)%arr.length;
            System.out.println("Popped element is : "+ data);
            currentSize--;
            System.out.println("current size : "+ currentSize);
        }
    }

    private void push(int data) {
        if (currentSize >= arr.length) {
            System.out.println("Queue is full");
            return;
        }
        if (currentSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % arr.length;
        }
        this.arr[end] = data;
        currentSize++;
        System.out.println("pushed element : "+data);
        System.out.println("current size : "+ currentSize);
    }

    public static void main(String[] args) {
        QueueImplUsingArray queue = new QueueImplUsingArray();
        queue.push(10);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);
        queue.top();
        queue.pop();
        System.out.println("queue size : "+queue.size());
        queue.pop();
        queue.pop();
        System.out.println("queue size : "+queue.size());
        queue.top();
        System.out.println("queue size : "+queue.size());
        queue.push(15);
        queue.push(16);
        queue.push(17);
        queue.pop();
        queue.top();
        System.out.println("queue size : "+queue.size());
    }


}
