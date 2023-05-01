package com.bridgelabz;

import java.util.LinkedList;

public class Stack <T>{
    //creates Linked list Object
    LinkedList<T> linkedList;
    public Stack() {
        this.linkedList = new LinkedList<>();
    }
    public void push(T key) {
        linkedList.push(key);
    }
    public void print() {
      // return linkedList.print();
    }

    public T pop() {
        return linkedList.pop();
    }

    public T peek(){
        return linkedList.peek();
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }
}
