/*
 * Chapter 3 Comparison and Bounds
 * Section 4 Comparator
 */
package ch03.sec04;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/*
interface Comparator<T> {
    public int compare(T o1, T o2);
    public boolean equals(Object obj);
}
*/

/**
 *
 * @author emaphis
 */
public class ComparatorTest {

    /**
     * Shorter string is less than a longer string
     * 3.4 pg 57
     */
    static Comparator<String> sizeOrder =
        (String s1, String s2) ->
                s1.length() < s2.length() ? -1 :
                s1.length() > s2.length() ? 1 :
                s1.compareTo(s2);

    public static void testSizeOrder() {
        System.out.println("two to three: " + ("two".compareTo("three") > 0));
        System.out.println("two to three sizeorder: " +
                (sizeOrder.compare("two", "three") < 0) );
    }

    // Java libraries always provide a choice between Comparable and Comparator
    // 3.4 pg 40
    public static <T> T max (Collection<? extends T> coll,
                             Comparator<? super T> cmp) {
        T candidate = coll.iterator().next();
        for (T elt : coll) {
            if (cmp.compare(candidate, elt) < 0) { candidate = elt; }
        }
        return candidate;
    }

    public static <T extends Comparable<? super T>>
                             T max (Collection<? extends T> coll) {
        return max(coll, Comparators.<T>naturalOrder());
    }

    // 4.3 pg 41
    public static <T> Comparator<T> reverseOrder (final Comparator<T> cmp) {
        return (T o1, T o2) -> cmp.compare(o2,o1);
    }

    // min 4.3 pg 41
    public static <T> T min (Collection<? extends T> coll,
                             Comparator<? super T> cmp) {
        return max(coll, reverseOrder(cmp));
    }

    public static <T extends Comparable<? super T>>
                             T min (Collection<? extends T> coll) {
        return max(coll, Comparators.<T>reverseOrder());
    }

    public static void testMaxMin () {
        Collection<String> strings = Arrays.asList("from", "aaa", "to", "zzz");
        System.out.println("max: " + max(strings).equals("zzz"));
        System.out.println("min: " + min(strings).equals("aaa"));
        System.out.println("max so: " + max(strings, sizeOrder).equals("from"));
        System.out.println("min so: " + min(strings, sizeOrder).equals("to"));
    }

    public static void main(String[] args) {
        testSizeOrder();
        testMaxMin();
    }
}
