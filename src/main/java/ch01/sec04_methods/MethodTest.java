/*
 * Chapter 1 Intro
 * Section 4 Generic Methods and Varargs
 */
package ch01.sec04_methods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class MethodTest {
    public static void main(String[] args) {
        //int[] arry = new int[] {1,2,3};
        List<Integer> lst = Lists.toList2(1,2,3);
        System.out.println("list: " + lst);

        List<Integer> ints = new ArrayList<>();
        Lists.addAll(ints, 1, 2);
        Lists.addAll(ints, new Integer[] {3, 4 });
        System.out.println("ints: " + ints);

    }
}
