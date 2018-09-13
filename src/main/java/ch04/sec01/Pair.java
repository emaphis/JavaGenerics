/*
 * Chapter 4 Declarations
 * Section 1 Constructors
 */
package ch04.sec01;

/**
 * Represents a pair of items
 * 4.1 pg 51
 * @author emaphis
 * @param <T> type first item
 * @param <U> type of second item
 */
public class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }
}
