package com.crackingcodinginterview.practice.stackqueues;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(2);
        System.out.println("First Element now :"+queue.first());
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
