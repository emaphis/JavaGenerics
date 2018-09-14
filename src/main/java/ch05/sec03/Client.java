/*
 * Chapter 5 Evolution
 * Section 3 Evolving a library using minimal changes
 */
package ch05.sec03;


/**
 * Use the Stack implementation
 * Evolving a library using minimal changes
 * 5.3 pg 67
 * @author emaphis
 */
public class Client {
    public static void main(String[] args) {
        Stack stack = new ArrayStack<>();
        for (int i = 0; i<4; i++) {
            stack.push(i);
        }
        System.out.println("stack: " + stack.toString());
        int top = (int)stack.pop();
        System.out.println("top==3: " + (top == 3));
        Stack<Integer> reverse = Stacks.reverse(stack);
        System.out.println("stack empty? " + stack.empty());
        System.out.println("reverse: " + reverse.toString());
    }
}
