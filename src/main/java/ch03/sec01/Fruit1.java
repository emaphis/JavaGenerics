/*
 * Chapter 3 Comparison and Bounds
 * Section 3 A fruity test
 */
package ch03.sec01;

/**
 * Permitting comparison of apples with oranges
 * @author emaphis
 */
abstract public class Fruit1 implements Comparable<Fruit1> {
    protected String name;
    protected int size;

    protected Fruit1(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Fruit1) {
            Fruit1 that = (Fruit1)o;
            return this.name.equals(that.name) && this.size == that.size;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*29 + size;
    }

    @Override
    public int compareTo(Fruit1 that) {
        return this.size < that.size ? -1 :
               (this.size == that.size ? 0 : 1);
    }
}

class Apple1 extends Fruit1 {
    public Apple1(int size) { super("Apple1", size); }
}

class Orange1 extends Fruit1 {
    public Orange1(int size) { super("Orange1", size); }
}
