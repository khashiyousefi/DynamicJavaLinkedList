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

    public int getKthFromTheEnd(int kth){

        if (first == null){
            throw new IllegalStateException();
        }
        Node firstPointer = first;
        int result = -1;
        if (kth <= 0){
            return result;
        }
        Node secondPointer = first;
        for (int i = 1; i < kth; i++){
            secondPointer = secondPointer.next;
            if (secondPointer == null){
                return -1;
            }
        }
        while (secondPointer != null){
            if (secondPointer.next == null){
                result = firstPointer.value;
            } else {
                firstPointer = firstPointer.next;
            }
            secondPointer = secondPointer.next;
        }
        return result;
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
//    public void reverse(){
////        Node copyList = new Node(first.value);
//        Node end = last;
//
//        for (int i = 1; i < size;i++){
//            Node current = first;
//            while (current.value != end.value){
//                if (current.next.value == end.value){
//                    Node beforeCurrent = previous(current);
//                    last.next = current;
//                    last = current;
//                    current.next = null;
//                    if (beforeCurrent == null){
////                        current.next = null;
//                        current = end;
//                        first = end;
//                    }else{
//                        beforeCurrent.next = end;
//                        current = beforeCurrent;
//                    }
//                }
//                if (current != end){
//                current = current.next;
//                }
//            }
//        }
//
//    }
    public void reverse(){
        if (first == null) return;
        Node before = first;
        Node current = first.next;
        while (current != null){
            Node next = current.next;
            current.next = before;
            before = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = before;

    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    private Node previous(Node target){
        Node end = target;
        Node before = null;
        Node current = first;
        while (current != null){
            if (current.next == target) {
                before = current;
                break;
            }
            current = current.next;
        }
        return before;
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
