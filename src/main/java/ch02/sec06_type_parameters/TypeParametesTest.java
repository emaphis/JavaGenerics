/*
 * Chapter 2 Wildcards
 * Sec 6  Wildcards vs Type Parameters
 */
package ch02.sec06_type_parameters;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class TypeParametesTest {

    /**
     * Wildcards vs parameters
     * 2.5 pg 25
     * boolean contains(Object 0);  //no generics
     * boolean containsAll(Collection(?) c);
     */
    public static void ex1() {
        Object obj = "one";
        List<Object> objs = Arrays.<Object>asList("one", 2, 3.14, 4);
        List<Integer> ints = Arrays.asList(2,4);
        System.out.println("objs: " + objs.contains(obj));
        System.out.println("ojbs: " + objs.containsAll(ints));
        System.out.println("ints: " + !ints.contains(obj));
        System.out.println("ints: " + !ints.containsAll(objs));
    }

    /**
     * This contains succeeds
     * 2.6 pg 43
     */
    public static void ex2() {
        Object obj = 1;
        List<Object> objs = Arrays.<Object>asList(1, 3);
        List<Integer> ints= Arrays.asList(1,2,3,4);
        System.out.println("ints: " + ints.contains(obj)); // succeeds
        System.out.println("ints: " + ints.containsAll(objs));
    }


    public static void main(String[] args) {
        ex1();
        ex2();
    }
}
