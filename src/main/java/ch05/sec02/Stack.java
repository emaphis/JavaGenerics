/*
 * Chapter 5 Evolution
 * Section 2 Generic library with generic client
 */
package ch05.sec02;

/**
 * Stack interface
 * Generic library with generic client
 * 5.2 pg 63
 * @author emaphis
 */
interface Stack<E> {
    public boolean empty();
    public void push(E elt);
    public E pop();
}
