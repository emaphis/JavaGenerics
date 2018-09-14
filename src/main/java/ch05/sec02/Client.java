/*
 * Chapter 5 Evolution
 * Section 2 Generic library with generic client
 */
package ch05.sec02;

/**
 * Use the Stack implementation
 * Generic library with generic client
 * 5.2 pg 63
 * @author emaphis
 */
public class Client {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i<4; i++) {
            stack.push(i);
        }
        System.out.println("stack: " + stack.toString());
        int top = stack.pop();
        System.out.println("top==3: " + (top == 3));
        Stack<Integer> reverse = Stacks.reverse(stack);
        System.out.println("stack empty? " + stack.empty());
        System.out.println("reverse: " + reverse.toString());
    }
}
