package com.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation linkedlist=new Implementation();
        linkedlist.insertFirst(12);
        linkedlist.insertFirst(24);
        linkedlist.insertFirst(34);
        linkedlist.insertFirst(19);
        linkedlist.insertLast(90);
        linkedlist.insert(10,4);
        linkedlist.displayList();
        System.out.println(linkedlist.deleteFirst());
        linkedlist.displayList();
        System.out.println(linkedlist.deleteLast());
        linkedlist.displayList();
        System.out.println(linkedlist.delete(3));
        linkedlist.displayList();
    }
}
