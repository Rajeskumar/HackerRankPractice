package com.crackingcodinginterview.practice.stackqueues;

import java.util.ArrayList;

public class SetOfStacks {

    int stackCapacity;
    int currentStackIndex;
    ArrayList<MyStack> setOfStacks = new ArrayList<>();

    public SetOfStacks(int value){
        stackCapacity = value;
        currentStackIndex = 0;
        setOfStacks.add(new MyStack());
    }

    public void push(int value){
        if(setOfStacks.get(currentStackIndex).length < stackCapacity){
            setOfStacks.get(currentStackIndex).push(value);
        }else{
            MyStack stack = new MyStack();
            stack.push(value);
            setOfStacks.add(stack);
            currentStackIndex++;
        }
    }

    public int pop(){
        MyStack stack = setOfStacks.get(currentStackIndex);
        if(stack.length > 0){
            return stack.pop();
        }else{
            currentStackIndex--;
            return setOfStacks.get(currentStackIndex).pop();
        }
    }

    public int popAtIndex(int idx){
        MyStack stack = setOfStacks.get(idx);
        if(stack.length>0){
            return stack.pop();
        }
        return 0;
    }

    public void print(){
        System.out.println("No of Stacks :"+(currentStackIndex+1));
        for(int i= currentStackIndex; i>-1; i--){
            MyStack stack = setOfStacks.get(i);
            stack.printStack();
        }
    }
}
