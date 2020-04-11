package main.com.crackingcodinginterview.practice.stackqueues;

public class SetOfStacksTest {

    public static void main(String[] args) {
        SetOfStacks stacks = new SetOfStacks(3);

        stacks.push(3);
        stacks.push(4);
        stacks.push(6);
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        stacks.push(2);
        stacks.push(1);

        stacks.print();
        stacks.pop();
        stacks.print();

        System.out.println("Pop at idx :"+ stacks.popAtIndex(1));

        stacks.print();

        stacks.push(100);
        System.out.println("Pop at idx :"+ stacks.popAtIndex(1));
        System.out.println("Pop at idx :"+ stacks.popAtIndex(1));
        stacks.print();
        System.out.println("Pop at idx :"+ stacks.popAtIndex(1));
    }
}
