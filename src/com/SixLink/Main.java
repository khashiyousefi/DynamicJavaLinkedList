package com.SixLink;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addFirst(2);
//        list.addLast(40);
//        System.out.println(list.indexOf(2));
//        System.out.println(list.contains(20));
//        list.removeLast();
//        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));


    }
}
