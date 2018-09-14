/*
 * Chapter 5 Evolution
 * Section 2 Generic library with generic client
 */
package ch05.sec02;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayStack implementation
 * Generic library with generic client
 * 5.2 pg 63
 * @author emaphis
 */
class ArrayStack<E> implements Stack<E> {
    private List<E> list;
    public ArrayStack() { list = new ArrayList<>(); }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public void push(E elt) {
        list.add(elt);
    }

    @Override
    public E pop() {
        E elt = list.remove(list.size() - 1);
        return elt;
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }
}
