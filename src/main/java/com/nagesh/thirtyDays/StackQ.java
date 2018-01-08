package com.nagesh.thirtyDays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nageshkumar
 * since  03/12/17.
 */
public class StackQ {
    // Write your code here.
    private List<Character> stack;
    private List<Character> queue;

    public StackQ(){
        stack = new ArrayList();
        queue = new ArrayList();
    }

    void pushCharacter(char ch) {
        stack.add(ch);
    }

    void enqueueCharacter(char ch){
        queue.add(ch);
    }

    char popCharacter(){
        char pop_ch= stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return pop_ch;
    }

    char dequeueCharacter() {
        char dequeue_ch= queue.get(0);
        queue.remove(0);
        return dequeue_ch;
    }

    /*All tests pass with using stack instead of Q as well
    char dequeueCharacter() {
        char dequeue_ch= stack.get(0);
        stack.remove(0);
        return dequeue_ch;
    }*/
}