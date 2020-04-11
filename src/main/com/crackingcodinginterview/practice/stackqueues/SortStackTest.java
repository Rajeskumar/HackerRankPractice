package main.com.crackingcodinginterview.practice.stackqueues;

public class SortStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(9);
//        stack.printStack();
        stack.push(-80);
        stack.push(99);
        stack.push(2);
        stack.push(3);
        stack.push(10);

        stack.printStack();

        SortStack sortStack = new SortStack();

        stack = sortStack.sort(stack);

        stack.printStack();
    }
}
