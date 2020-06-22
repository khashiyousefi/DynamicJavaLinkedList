package com.SixLink;

import java.util.Arrays;
import java.util.NoSuchElementException;

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
    private int size;

    public void addLast(int item){
        Node node = new Node(item);

        if (first == null)
            last = first = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        Node node = new Node(item);

        if (first == null){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void removeFirst(){

        if (first == null){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast(){
        if (first == null){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;
            return;
        }
        Node current = first;
        while(current != null){
            if (current.next == last){
                last = current;
                last.next = null;
            }
            current = current.next;
        }
        size--;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        Node current = first;
        while(current != null){
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int indexOf(int item){
        Node current = first;
        int index = 0;
        while (current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

}
