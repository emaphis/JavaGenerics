/*
 * Chapter 2 Subtyping
 * Section
 *  1 Suptypes
 *  2 Wildcards with extends
 *  3 Wildcards with super
 */
package ch02.sec02_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Wildcard examples
 * @author emaphis
 */
public class WildcardsTest {

    /**
     * 4.2 pg 16
     * Type error: incompatible types.
     */
    static void typeError1() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        //List<Number> nums = ints;  // compile time error.
        //nums.add(3.14);
        System.out.println("nums = " + ints);
    }

    /**
     * 4.2 pg 16
     * Type error: incompatible types.
     */
    static void typeError2() {
        List<Number> nums = new ArrayList<>();
        nums.add(2.78);
        nums.add(2);
        //List<Integer> ints = nums;  // compile time error.
        //ints.add(4);
        System.out.println("nums = " + nums);
    }

    /**
     * 4.2 pg 17
     *  "? extends E" allows puts of subtypes
     */
    public static void extendsTest() {
        // public boolean addAll(Collection<? extends E> c);
        List<Number> nums = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 3.14);
        nums.addAll(ints); // put
        nums.addAll(dbls); // put
        System.out.println("nums: " + nums);
    }

    /**
     * Copy one list to another list
     * 2.3 pg 18 - Wild cards with super
     * @param <T> type of Lists
     * @param dst destination list
     * @param src source list
     */
    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    public static void testCopy() {
        List<Object> objs = Arrays.asList(2, 3.14, "four");
        List<Integer> ints = Arrays.asList(5, 6);
        WildcardsTest.copy(objs, ints);
        System.out.println("objs: " + objs);
    }

    public static void main(String[] args) {
        extendsTest();
        testCopy();
    }
}
