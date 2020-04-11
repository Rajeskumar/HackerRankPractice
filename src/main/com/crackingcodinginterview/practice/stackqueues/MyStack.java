package main.com.crackingcodinginterview.practice.stackqueues;

public class MyStack {

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int value) {
            data = value;
        }
    }

    ListNode top;
    int length;

    MyStack() {
        ListNode top = null;
        length = 0;
    }

    void push(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
        length++;
    }


    int pop() {
        if (top == null) return 0;
        int poppedValue = top.data;
        top = top.next;
        length--;
        return poppedValue;
    }

    int peek(){
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
