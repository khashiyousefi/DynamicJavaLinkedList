package com.SixLink;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    


    public void addLast(int item){
        Node node = new Node(item);

        if (first == null)
            last = first = node;
        else{
            last.next = node;
            last = node;
        }


    }
    public void addFirst(){

    }
    public void deleteFirst(){

    }
    public void deleteLast(){

    }
    public void contains(){

    }
    public void indexOf(){

    }

}
