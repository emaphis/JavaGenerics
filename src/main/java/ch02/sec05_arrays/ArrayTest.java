/*
 * Chapter 2 Wildcards
 * Section 5 Arrays.
 */
package ch02.sec05_arrays;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class ArrayTest {
    public static void ex1() {
        Integer[] ints = new Integer[] {1,2,3};
        Number[] nums = ints;  // covarient
        nums[2] = 3.4;   // array store exception
        System.out.println("nums: " + Arrays.toString(nums));
    }

    public static void ex2() {
        List<Integer> ints = Arrays.asList(1,2,3);
      //  List<Number> nums = ints;  // compile time error
      //  nums.set(2, 3.14);
    }

    public static void ex3() {
        List<Integer> ints = Arrays.asList(1,2,3);
        List<? extends Number> nums = ints;
       // nums.set(2, 3.14); // compile time error

    }

    public static void main(String[] args) {
        try {
            ex1();
        } catch (ArrayStoreException e){
            System.err.println(e.toString());
        }
    }
}
