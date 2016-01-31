// create a MinStack which supports the standard stack operations and an additional operation
// min() which returns the smallest number in the Stack

import java.util.Stack;

public class MinStack { 
    
    private Stack<Integer> stack;
    private Stack<Integer> minimums;
   
    public MinStack() {
        stack = new Stack<>();
        minimums = new Stack<>();
    }


    public int min() {
        if (minimums.isEmpty())
            throw new IllegalStateException();            
        return minimums.peek();
    }

    public void push(int value) {
        stack.push(value);
        if (minimums.isEmpty() ||  value <= minimums.peek())
            minimums.push(value);           
    }

    public int pop() {    
        if (stack.peek() == minimums.peek())
            minimums.pop();
        return stack.pop();
               
    }

}

