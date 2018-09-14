/*
 * Chapter 5 Evolution
 * Section 1 Legacy library with legacy client
 */
package ch05.sec01;

/**
 * Stack algorithm implementations
 * Legacy library with legacy client
 * 5.1 pg 61
 * @author emaphis
 */
class Stacks {
    public static Stack reverse(Stack in) {
        Stack out = new ArrayStack();
        while (!in.empty()) {
            Object elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
