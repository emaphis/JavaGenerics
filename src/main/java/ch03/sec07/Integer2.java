/*
 * Chapter 3 Comparison and Bounds
 * Section 7 Bridges
 */
package ch03.sec07;

interface Comparable2<T> {
    public int compareTo(T o);
}

/**
 *
 * @author emaphis
 */
public class Integer2 implements Comparable2<Integer2> {
    private final int value;

    public Integer2(int value) { this.value = value; }

    @Override
    public int compareTo(Integer2 i) {
        return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
    }
}
