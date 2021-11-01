package com.valenta;

public class Stack<T> implements PushPop<T> {
    private int top_of_stack; // The index of the top-most element.
    private T[] stack; // this array holds the stack

    // Construct a stack with initial values
    public Stack(T[] arr) {
        stack = (T[])new Object[arr.length];
        for(int i = 0; i < arr.length; i++){
            push(arr[i]);
        }
    }

    // Push characters onto the stack
    public void push(T obj) {
        if(top_of_stack == stack.length) {
            System.out.println("Cannot add " + obj + ". Stack is full.");
            return;
        }
        System.out.println("Added " + obj + " to the stack.");
        stack[top_of_stack] = obj;
        top_of_stack++;
    }

    // Pop a character from the stack
    public T pop() {
        if(top_of_stack == 0) {
            System.out.println("Nothing to remove. Stack is empty");
            return null;
        }
        System.out.println("Removed: " + stack[--top_of_stack]);
        return stack[top_of_stack];
    }

    // Show contents of the stack
    public void showStack() {
        System.out.println("\n*** Show Stack ***");
        if(top_of_stack == 0) {
            System.out.println("Stack is empty");
        } else {
            for(int i = top_of_stack - 1; i >= 0; i--) {
                System.out.print(stack[i]);
                if(i == top_of_stack - 1) {
                    System.out.print(", Top of stack");
                }
                if(i == 0) {
                    System.out.print(", Bottom of stack");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static <T> void swap(int first, int second){

        temp = (T[]new Object [])
        stack[first] = stack[second];
        stack[second] = temp;
    }
}
