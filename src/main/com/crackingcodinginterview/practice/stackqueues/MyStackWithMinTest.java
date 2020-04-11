package main.com.crackingcodinginterview.practice.stackqueues;

public class MyStackWithMinTest {

    private static void testMinStackProblem(){
        MyStackWithMin stack = new MyStackWithMin();
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
