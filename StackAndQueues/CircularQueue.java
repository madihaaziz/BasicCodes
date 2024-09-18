package com.StackAndQueues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data=new int[size];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==data.length;
    }

    public boolean insert(int item){
        if(isFull())
            return false;
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int removed=data[front++];
        front=front% data.length;
        size--;
        return removed;
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Nothing to diplay");
        }
        for(int i=front;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    public void display2() throws Exception {
        if(isEmpty()){
            throw new Exception("Nothing to diplay");
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i=i% data.length;
        }while(i!=end);
        System.out.println("END");
    }

    public int front()throws Exception {
        if(isEmpty()){
            throw new Exception("Nothing to diplay");
        }
        return data[front];
    }
}
