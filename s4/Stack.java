package com.zf;

/**
 * @author Henry
 * @date 2019/11/2
 */
public class Stack {
    long stackArray[];
    int size;
    int top;
    public Stack(int size) {
        this.size = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public long pop(){
        return stackArray[top--];
    }

    public void push(long value){
        stackArray[++top] = value;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public long peek() {
        return stackArray[top];
    }


}
