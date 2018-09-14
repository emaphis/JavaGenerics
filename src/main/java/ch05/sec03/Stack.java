/*
 * Chapter 5 Evolution
 * Section 3 Evolving a library using minimal changes
 */
package ch05.sec03;

/**
 * Stack interface
 * Evolving a library using minimal changes
 * 5.3 pg 67
 * @author emaphis
 */
interface Stack<E> {
    public boolean empty();
    public void push(E elt);
    public E pop();
}
