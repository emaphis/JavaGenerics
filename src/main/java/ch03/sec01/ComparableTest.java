/*
 * Chapter 3 Comparison and Bounds
 * Section 1 Comparable interface
 * Section 2 Maximum of a Collection
 */
package ch03.sec01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
interface Comparable<T> {
    public int compareTo(T o);
}
*/

/**
 * Test Comparable concepts
 * @author emaphis
 */
public class ComparableTest {
    // 3.1 pg 31
    static void ex1() {
        Integer int0 = 0;
        Integer int1 = 1;
        System.out.println("Integer.compareTo (<0): " + int0.compareTo(int1));

        String str0 = "zero";
        String str1 = "one";
        System.out.println("String.comparTo (>0):" + str0.compareTo(str1));
    }

    // x.equals(y) if and only if x.compareTo(y) == 0
    // sgn(x.compareTo(y)) == -sgn(y.compareTo(x))
    // if x.compareTo(y) < 0 and y.compareTo(z) < 0 then x.compareTo(z) < 0
    // if x.compareTo(y) == 0 then sgn(x.compareTo(z)) == sgn(y.compareTo(z))
    // x.equals(y) if and only if x.compareTo(y) == 0
    // x.compareTo(x) == 0


    //public static <T extends Comparable<T>> T max(Collection<T> coll) { // less general
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        T candidate = coll.iterator().next();
        for (T elt : coll) {
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }

    public static void testMax() {
        List<Integer> ints = Arrays.asList(0,1,2);
        System.out.println("max ints is 2: " + (max(ints) == 2));

        List<String> strs = Arrays.asList("zero", "one", "two");
        System.out.println("max strs is zero: " + (max(strs).equals("zero")));
    }



    public static void main(String[] args) {
        ex1();
        testMax();
    }
}
