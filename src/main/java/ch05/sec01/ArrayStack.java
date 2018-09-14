/*
 * Chapter 5 Evolution
 * Section 1 Legacy library with legacy client
 */
package ch05.sec01;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayStack implementation
 * Legacy library with legacy client
 * 5.1 pg 61
 * @author emaphis
 */
public class ArrayStack implements Stack {
    private List list;
    public ArrayStack() { list = new ArrayList(); }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public void push(Object elt) {
        list.add(elt);
    }

    @Override
    public Object pop() {
        Object elt = list.remove(list.size() - 1);
        return elt;
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }
}
