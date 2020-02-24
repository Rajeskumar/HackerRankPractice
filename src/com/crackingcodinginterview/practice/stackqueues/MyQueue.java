package com.crackingcodinginterview.practice.stackqueues;

public class MyQueue {

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int value) {
            data = value;
        }
    }

    ListNode first;
    ListNode last;

    public MyQueue() {
        first = null;
        last = null;
    }

    void enqueue(int value) {
        ListNode newNode = new ListNode(value);
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }


    int dequeue() {
        if (first == null) return 0;
        int enqueuedValue = first.data;
        first = first.next;
        return enqueuedValue;
    }

    int first(){
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

    void printQueue(){
        ListNode printNode = first;
        if (printNode == null) System.out.println("Queue is Emtpy.");
        while (printNode != null){
            System.out.print(printNode.data+"->");
            printNode = printNode.next;
        }
        System.out.println();
    }
}
