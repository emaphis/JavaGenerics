/*
 * Chapter 3 Comparison and Bounds
 * Section 3 A Fruity example
 */
package ch03.sec01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class FruityTest {

    // Permitting comparison of apples with oranges
    static void TestFruit1() {
        Apple1 a1 = new Apple1(1);
        Apple1 a2 = new Apple1(2);
        Orange1 o3 = new Orange1(3);
        Orange1 o4 = new Orange1(4);

        List<Apple1> apples = Arrays.asList(a1,a2);
        System.out.println("max apples: " + Collections.max(apples).equals(a2));

        List<Orange1> oranges = Arrays.asList(o3,o4);
        System.out.println("max oranges: " + Collections.max(oranges).equals(o4));

        List<Fruit1> mixed = Arrays.<Fruit1>asList(a1,o3);
        System.out.println("max fruits: " + Collections.max(mixed).equals(o3)); // Ok
    }

    // Prohibiting comparison of apples with oranges
    static void TestFruit2() {
        Apple2 a1 = new Apple2(1);
        Apple2 a2 = new Apple2(2);
        Orange2 o3 = new Orange2(3);
        Orange2 o4 = new Orange2(4);

        List<Apple2> apples = Arrays.asList(a1,a2);
        System.out.println("max apples: " + Collections.max(apples).equals(a2));

        List<Orange2> oranges = Arrays.asList(o3,o4);
        System.out.println("max oranges: " + Collections.max(oranges).equals(o4));

        List<Fruit2> mixed = Arrays.<Fruit2>asList(a1,o3);
      //  System.out.println("max fruits: " + Collections.max(mixed).equals(o3)); // Ok
    }

    public static void main(String[] args) {
        TestFruit1();
        TestFruit2();
    }
}
