/*
 * Chapter 3 Comparison and Bounds
 * Section 5 Enum type
 */
package ch03.sec05;

/**
 *
 * @author emaphis
 * @param <E>
 */
public abstract class Enum<E extends Enum<E>> implements Comparable<E> {
    private final String name;
    private final int ordinal;

    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public final String name() { return name; }
    public final int ordinal() { return ordinal; }
    @Override public String toString() { return name; }
    @Override
    public final int compareTo(E o) {
        return ordinal - o.ordinal();
    }
}
