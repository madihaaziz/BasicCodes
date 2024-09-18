package com.LinkedList.SinglyLinkedList;

public class Implementation {

    private Node head;
    private Node tail;
    private int size;
    public Implementation() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        size--;
        tail.next=null;
        return value;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index==size-1)
            return deleteLast();
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return value;
    }

    public Node get(int index){
        Node node=head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void displayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
//        System.out.println(size);
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value=value;
            this.next = next;
        }
    }
}
