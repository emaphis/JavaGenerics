/*
 * Chapter 3 Comparison and Bounds
 * Section 7 Bridges
 */
package ch03.sec07;

import java.lang.reflect.Method;

/**
 * Utility functions.
 * @author emaphis
 */
public class IntegersTest {
    public static void printMethods(Object obj) {
        for (Method m : obj.getClass().getMethods())
            if (m.getName().equals("compareTo"))
                System.out.println(m.toGenericString());
    }

    public static void main(String[] args) {
        Integer1 int1 = new Integer1(1);
        Integer2 int2 = new Integer2(2);
        printMethods(int1);
        System.out.println();
        printMethods(int2);
    }
}
