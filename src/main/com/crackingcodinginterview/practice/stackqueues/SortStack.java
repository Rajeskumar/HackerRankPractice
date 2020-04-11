package main.com.crackingcodinginterview.practice.stackqueues;

public class SortStack {

    public MyStack sort (MyStack inputStack) {
        MyStack tempStack = new MyStack();
        boolean isInputStackIteration = true;
        int swappedCount = 0;
        int stackLength = inputStack.length;
        int minVar = Integer.MAX_VALUE;

        while(true){
            swappedCount = 0;
            int tempVar = inputStack.pop();
            while(!inputStack.isEmpty()){
                if(isInputStackIteration){
                    if(tempVar > inputStack.peek()){
                        tempStack.push(tempVar);
                        tempVar=inputStack.pop();
                        swappedCount++;
                    }else{
                        tempStack.push(inputStack.pop());
                    }
                }else{
                    if(tempVar < inputStack.peek()){
                        tempStack.push(tempVar);
                        tempVar=inputStack.pop();
                        swappedCount++;
                    }else{
                        tempStack.push(inputStack.pop());
                    }
                }
            }
            tempStack.push(tempVar);
            isInputStackIteration = !isInputStackIteration;
            inputStack = tempStack;
            tempStack = new MyStack();
            if(minVar > inputStack.peek()){
                minVar = inputStack.peek();
            }

            if((swappedCount+1) == stackLength && (minVar == inputStack.peek())){
                return inputStack;
            }
        }
    }
}
