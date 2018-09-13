/*
 * Chapter 3 Comparison and Bounds
 * Section 7 Bridges
 */
package ch03.sec07;

interface Comparable1 {
    public int compareTo(Object o);
}

/**
 *
 * @author emaphis
 */
public class Integer1 implements Comparable1 {
    private final int value;

    public Integer1(int value) { this.value = value; }

//    @Override
    public int compareTo(Integer1 i) {
        return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
    }

    @Override
    public int compareTo(Object o) {
        return compareTo((Integer)o);
    }
  
}
