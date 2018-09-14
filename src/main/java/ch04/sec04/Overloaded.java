/*
 * Chapter 4 Declarations
 * Section 4 Erasure
 */
package ch04.sec04;

import java.util.List;

/**
 *
 * @author emaphis
 */
public class Overloaded {
    public static int sum(List<Integer> ints) {
        int sum = 0;
        for (int i : ints) sum += i;
        return sum;
    }

    public static String sum2(List<String> strings) {
        StringBuffer sum = new StringBuffer();
        for (String s : strings) sum.append(s);
        return sum.toString();
    }
}
