package com.SixLink;

public class Node {
    private int value;
    private Node next;

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setNode(Node next) {
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
}
