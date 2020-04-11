package main.com.crackingcodinginterview.practice.stackqueues;

public class MyQueueWithStackTest {

    public static void main(String[] args) {
        MyQueueWithStack queue = new MyQueueWithStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("Dequeue Elem :"+queue.dequeue());
        queue.print();
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Dequeue Elem :"+queue.dequeue());
        queue.print();
        System.out.println("Dequeue Elem :"+queue.dequeue());
        queue.print();
        System.out.println("Dequeue Elem :"+queue.dequeue());
        queue.print();
        System.out.println("Dequeue Elem :"+queue.dequeue());
        queue.print();
    }
}
