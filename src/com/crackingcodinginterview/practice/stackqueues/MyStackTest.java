package com.crackingcodinginterview.practice.stackqueues;

public class MyStackTest {

    private static void testMinStackProblem(){
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
//        stack.printStack();
        stack.push(4);
        stack.push(2);
        stack.push(10);
        stack.push(1);
        stack.printStack();
        System.out.println("Min Value in Stack : "+stack.getMinValue());
        stack.pop();
        stack.printStack();
        System.out.println("Min Value in Stack : "+stack.getMinValue());
        stack.pop();
        stack.printStack();
        System.out.println("Min Value in Stack : "+stack.getMinValue());
        stack.pop();
        stack.printStack();
        System.out.println("Min Value in Stack : "+stack.getMinValue());
        stack.pop();
        stack.printStack();
        System.out.println("Min Value in Stack : "+stack.getMinValue());
    }

    public static void main(String[] args) {

        testMinStackProblem();
    }
}
