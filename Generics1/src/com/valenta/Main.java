package com.valenta;

public class Main {

    public static void main(String[] args) {
        // construct stack from char array
        char[] letters = {'C', 'A', 'T'};
        Stack stack = new Stack(letters);
        stack.push('R');
        stack.showStack();
        char ch = stack.pop();
        System.out.println(ch);
        stack.push('R');
        stack.showStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showStack();
    }
}
