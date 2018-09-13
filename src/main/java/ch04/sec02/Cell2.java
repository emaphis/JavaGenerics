/*
 * Chapter 4 Declarations
 * Section 2 Static Members
 */
package ch04.sec02;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a cell
 * - 4.2 pg 53
 * @author emaphis
 * @param <T> type held by the cell
 */
public class Cell2<T> {
    private final T value;
    private static final List<Object> values = new ArrayList<>();

    public Cell2(T value) {
        this.value = value;
        values.add(value);
    }

    public T getValue() { return value; }
    public static List<Object> getValues() { return values; }
}
