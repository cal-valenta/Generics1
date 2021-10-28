package com.valenta;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Candy almondJoy = new AlmondJoy();
        Candy skittles = new Skittles();
        Hand<Candy> leftHand = new Hand<>("Left");
        Hand<Candy> rightHand = new Hand<>("Right");
        add(almondJoy, leftHand);
        add(skittles, rightHand);
        //leftHand.add(almondJoy);
        //rightHand.add(skittles);
        Candy leftHandCandy = (AlmondJoy)leftHand.remove();
        leftHandCandy.eat();
        Candy rightHandCandy = (Skittles)rightHand.remove();
        rightHandCandy.eat();

        // construct stack from char array
        Character[] letters = {'C', 'A', 'T'};
        String[] strings = {"Hey", "Hello", "Hi"};
        Integer[] integers = {1, 2, 3};
        Stack<Character> stack = new Stack<>(letters);
        stack.push('R');
        stack.showStack();
        Object obj = stack.pop();
        System.out.println(obj);
        stack.push('R');
        stack.showStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showStack();
    }

    public static <T extends Candy>void add(T item, Hand<T> hand) {
        System.out.println("Adding " + item.getClass().getSimpleName() + " to the " + hand.getName().toLowerCase() + " hand.");
        hand.add(item);
    }


}
