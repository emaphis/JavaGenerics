/*
 * Chapter 3 Comparison and Bounds
 * Section 3 A fruity test
 */
package ch03.sec01;

/**
 * Prohibiting comparison of apples with oranges
 * @author emaphis
 */
abstract public class Fruit2 {
    protected String name;
    protected int size;

    protected Fruit2(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Fruit2) {
            Fruit2 that = (Fruit2)o;
            return this.name.equals(that.name) && this.size == that.size;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*29 + size;
    }

    protected int compareTo(Fruit2 that) {
        return this.size < that.size ? -1 :
               (this.size == that.size ? 0 : 1);
    }
}

class Apple2 extends Fruit2 implements Comparable<Apple2> {
    public Apple2(int size) { super("Apple2", size); }

    @Override
    public int compareTo(Apple2 a) {
        return super.compareTo(a);
    }
}

class Orange2 extends Fruit2 implements Comparable<Orange2> {
    public Orange2(int size) { super("Orange2", size); }

    @Override
    public int compareTo(Orange2 o) {
        return super.compareTo(o);
    }
}
