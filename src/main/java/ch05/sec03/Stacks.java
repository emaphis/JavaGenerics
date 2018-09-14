/*
 * Chapter 5 Evolution
 * Section 3 Evolving a library using minimal changes
 */
package ch05.sec03;

/**
 * Stack algorithm implementations
 * Evolving a library using minimal changes
 * 5.3 pg 67
 * @author emaphis
 */
class Stacks {
    public static <T> Stack<T> reverse(Stack<T> in) {
        Stack out = new ArrayStack();
        while (!in.empty()) {
            Object elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
