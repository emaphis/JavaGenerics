/*
 * Chapter 4 Declarations
 * Section 2 Static Members
 */
package ch04.sec02;

/**
 * Represents a cell
 * - 4.2 pg 52
 * @author emaphis
 * @param <T> type held by the cell
 */
public class Cell<T> {
    private final int id;
    private final T value;

    private static int count = 0;
    private static synchronized int nextId() { return count++; }

    public Cell(T value) {
        this.value = value;
        this.id = nextId();
    }

    public T getValue() { return value; }
    public int getId() { return id; }
    public static synchronized int getCount() { return count; }
}
