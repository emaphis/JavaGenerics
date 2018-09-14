/*
 * Chapter 5 Evolution
 * Section 1 Evolving a library using minimal changes
 */
package ch05.sec03;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayStack implementation
 * Evolving a library using minimal changes
 * 5.3 pg 67
 * @author emaphis
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {
    private List list;
    public ArrayStack() { list = new ArrayList(); }

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
        Object elt = list.remove(list.size() - 1);
        return (E)elt;
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }
}
