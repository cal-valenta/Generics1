package com.valenta;

public class Hand<T extends Candy> {
    private T contents;
    private String name;
    public Hand (String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void add(T thing){
        if(contents == null) {
            contents = thing;
            System.out.println("Item added.");
        } else{
            System.out.println("The hand is full.");
        }
    }

    public T remove(){
        if(contents == null){
            System.out.println("The hand is empty.");
            return null;
        } else{
            T thing = contents;
            contents = null;
            System.out.println("Item removed.");
            return thing;
        }
    }
}
