package com.crackingcodinginterview.practice.stackqueues;

public class MyStack {

    private static class ListNode {
        int data;
        ListNode next;
        int nextMinValue;

        ListNode(int value, int minValue) {
            data = value;
            nextMinValue = minValue;
        }
    }

    ListNode top;
    int minValue;
    int length;

    MyStack() {
        ListNode top = null;
        this.minValue = Integer.MAX_VALUE;
        length = 0;
    }

    void push(int value) {
        ListNode newNode = new ListNode(value, minValue);
        if (minValue > value) {
            minValue = value;
        }
        newNode.next = top;
        top = newNode;
        length++;
    }


    int pop() {
        if (top == null) return 0;
        int poppedValue = top.data;
        minValue = top.nextMinValue;
        top = top.next;
        length--;
        return poppedValue;
    }

    int getMinValue() {
        return minValue;
    }

    int top(){
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    void printStack(){
        ListNode printNode = top;
        if (printNode == null) System.out.println("Stack is Emtpy.");
        while (printNode != null){
            System.out.print(printNode.data+"->");
            printNode = printNode.next;
        }
        System.out.println();
    }
}
