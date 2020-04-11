package main.com.crackingcodinginterview.practice.stackqueues;

public class MyQueueWithStack {

    MyStack enqueueStack;
    MyStack dequeueStack;

    public MyQueueWithStack(){
        this.enqueueStack = new MyStack();
        this.dequeueStack = new MyStack();
    }

    public void enqueue(int elem) {
        enqueueStack.push(elem);
    }

    public int dequeue(){
        if(dequeueStack.length == 0){
            while(enqueueStack.length > 0){
                int elem = enqueueStack.pop();
                dequeueStack.push(elem);
            }
        }
        return dequeueStack.pop();
    }

    public void print(){
        System.out.println("Queue is : ");
        if(dequeueStack.length > 0) dequeueStack.printStack();
        if(enqueueStack.length > 0) enqueueStack.printStack();
    }

}

