/*
 * Chapter 5 Evolution
 * Section 1 Legacy library with legacy client
 */
package ch05.sec01;

/**
 * Stack interface
 * Legacy library with legacy client
 * 5.1 pg 61
 * @author emaphis
 */
interface Stack {
    public boolean empty();
    public void push(Object elt);
    public Object pop();
}
