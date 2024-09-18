package com.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation list=new Implementation();
        list.insertFirst(12);
        list.insertFirst(25);
        list.insertLast(45);
        list.display();
        list.insert(25,67);
        list.display();
    }
}
