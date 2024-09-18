package com.StackAndQueues;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack=new CustomStack();
//        stack.push(12);
//        stack.push(24);
//        stack.push(75);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        CircularQueue queue=new CircularQueue();
        queue.insert(12);
        queue.insert(34);
        queue.insert(98);
        queue.insert(76);
        queue.insert(48);
        queue.display();
        queue.display2();
//        System.out.println(queue.remove()+" removed");
//        queue.insert(10);
//        queue.insert(93);
//        queue.display();

    }
}
