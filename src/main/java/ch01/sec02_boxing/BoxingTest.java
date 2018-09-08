/*
 * Chapter 1 Intro
 * Section 2 Boxing and unboxing
 */
package ch01.sec02_boxing;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class BoxingTest {

    /**
     * Example pg 8
     * @param ints list of integers
     * @return sum of integers
     */
    public static int sum(List<Integer> ints) { // Must be Object type
        int s = 0;
        for (int n : ints) { s += n; }
        return s;
    }

    // inefficient - needless unboxing
    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) { s += n; }
        return s;
    }

    /**
     *
     */
    public static void equalties() {
        List<Integer> bigs = Arrays.asList(100,200,300);
        System.out.println(sumInteger(bigs) == sum(bigs));
        System.out.println(sumInteger(bigs) != sum(bigs)); // not recomended.

        List<Integer> smalls = Arrays.asList(1,2,3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls); // not recommended
    }
}
