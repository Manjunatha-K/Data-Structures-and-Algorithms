package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

class Node {
    int data;
    Node next;

    Node() {

    }
    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
