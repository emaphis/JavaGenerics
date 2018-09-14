/*
 * Chapter 5 Evolution
 * Section 2 Generic library with generic client
 */
package ch05.sec02;

/**
 * Stack algorithm implementations
 * Generic library with generic client
 * 5.2 pg 63
 * @author emaphis
 */
class Stacks {
    public static <T> Stack reverse(Stack<T> in) {
        Stack<T> out = new ArrayStack<>();
        while (!in.empty()) {
            T elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
