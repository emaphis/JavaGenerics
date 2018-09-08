/*
 * Chapter 1 intro
 * Section 3 Foreach
 */
package ch01.sec03_foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class ForeachTest {

    /**
     * 1.3 Foreach example
     */
    public static void fe1a() {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n : ints) { s += n; }
        System.out.println("s = " + s);
    }

    // is equivalent
    public static void fe1b() {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) {
            int n = it.next();
            s += n;
        }
        System.out.println("s = " + s);
    }

    /**
     * 4.3 Apply foreach loop to an int array
     * pg 9
     */
    public static int sumArray(int[] a) {
        int s = 0;
        for (int n : a) { s += n; }
        return s;
    }

    /**
     * 4.3 Remove all of the negatives from a List of Double
     * Need to use the Iterator to use the remove member
     * @param v a list of double
     */
    public static void removeNegative(List<Double> v) {
        for (Iterator<Double> it = v.iterator(); it.hasNext(); ) {
            if (it.next() < 0.0) it.remove();
        }
    }

    public static void main(String[] args) {
        fe1a();
        fe1b();

        int[] a = {1, 2, 3 };
        int s = sumArray(a);
        System.out.println("s = " + s);

        List<Double> dList = new LinkedList<>(Arrays.asList(1.0, -2.3, 3.1, -4.0, 5.8));
        removeNegative(dList);
        System.out.println("double list = " + dList);
    }
}
