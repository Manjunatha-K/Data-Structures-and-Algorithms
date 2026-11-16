package com.learn.DataStructureAndAlgorithms.StacksAndQueues;


import org.springframework.web.servlet.tags.EditorAwareTag;

public class QueueUsingLL {
    Node start, end;
    int currentSize =0;
    int maxSize = 10;

    public void push(int data){
        if(currentSize == maxSize){
            System.out.println("Queue is full");
            return;
        }else if(currentSize ==0){
            start = end = new Node(data);
            currentSize++;
        }else{
            end.next = new Node(data);
            end = end.next;
            currentSize++;
        }
        System.out.println("Inserted element : "+data+" into the queue and current size is : "+ currentSize);
    }

    public int pop(){
        int temp;
        if(currentSize ==0){
            System.out.println("Queue is empty");
            return -1;
        }else{
            temp = start.data;
            start = start.next;
            currentSize--;
        }
        System.out.println("Deleted element : "+ temp+" and current size is : "+ currentSize);
        return temp;
    }

    public int top(){
        int temp;
        if(currentSize ==0){
            System.out.println("Queue is empty");
            return -1;
        }else{
            temp = start.data;
        }
        System.out.println("Top element : "+ temp+" and current size is : "+ currentSize);
        return temp;
    }

    public int size(){
        return currentSize;
    }
    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
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
