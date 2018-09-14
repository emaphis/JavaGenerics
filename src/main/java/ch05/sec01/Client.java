/*
 * Chapter 5 Evolution
 * Section 1 Legacy library with legacy client
 */
package ch05.sec01;

/**
 * Use the Stack implementation
 * Legacy library with legacy client
 * 5.1 pg 61
 * @author emaphis
 */
public class Client {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        for (int i = 0; i<4; i++) {
            stack.push(new Integer(i));
        }
        System.out.println("stack: " + stack.toString());
        int top = ((Integer)stack.pop()).intValue();
        System.out.println("top==3: " + (top == 3));
        Stack reverse = Stacks.reverse(stack);
        System.out.println("stack empty? " + stack.empty());
        System.out.println("reverse: " + reverse.toString());
    }
}
