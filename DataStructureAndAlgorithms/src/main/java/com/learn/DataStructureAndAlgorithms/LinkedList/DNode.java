package com.learn.DataStructureAndAlgorithms.LinkedList;

public class DNode {
    public DNode previous;
    public int data;
    public DNode next;

    public DNode() {

    }

    public DNode(int data) {
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public DNode(DNode previous, int data, DNode next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

}
