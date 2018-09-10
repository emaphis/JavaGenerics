/*
 * Chapter 2 Subtyping
 * Section
 *  1 Suptypes
 *  2 Wildcards with extends
 *  3 Wildcards with super
 *  4 The Get and Put Principle
 */
package ch02.sec02_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

    /**
     * Gets from the nums collection so use "? extends E"
     * 2.4 pg 20.
     * @param nums collection to "gets" from
     * @return sum.
     */
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) s += num.doubleValue();
        return s;
    }

    public static void testSum() {
        List<Integer> ints = Arrays.asList(1,2,3);
        System.out.println("ints: " + sum(ints));

        List<Double> doubles = Arrays.asList(2.78,3.14);
        System.out.println("doubles: " + sum(doubles));

        List<Number> nums = Arrays.<Number>asList(1,2,2.78,3.14);
        System.out.println("nums: " + sum(nums));
    }

    /**
     * Add a series of incremented numbers to a collection
     * puts values into a collection so us "? super E".
     * 4.2 pg 20
     * @param ints collection to add a series of numbers
     * @param n number of numbers to add
     */
    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }

    public static void testCount() {
        List<Integer> ints = new ArrayList<>();
        count(ints, 5);
        System.out.println("ints: " + ints);

        List<Number> nums = new ArrayList<>();
        count(nums, 5); nums.add(5.0);
        System.out.println("nums: " + nums);

        List<Object> objs = new ArrayList<>();
        count(objs, 5); objs.add("five");
        System.out.println("objs: " + objs);
    }

    /**
     * don't use wildcard when you puts and gets from same Collection
     * nums must be a collection of number
     * 4.2 pp 20,21
     * @param nums
     * @param n
     * @return sum of count
     */
    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    public static void testSumCount() {
        List<Number> nums = new ArrayList<>();
        double sum = sumCount(nums, 5);
        System.out.println("sum of count: " + sum);
    }

    public static void main(String[] args) {
        extendsTest();
        testCopy();
        testSum();
        testCount();
        testSumCount();
    }
}
