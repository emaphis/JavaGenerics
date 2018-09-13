/*
 * Chapter 4 Declarations
 * Section 1 Constructors
 */
package ch04.sec01;

/**
 * Test the Pair class
 * @author emaphis
 */
public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("one",2);
        System.out.println("first=" + pair.getFirst() + ",second=" + pair.getSecond());

        Pair<String, Integer> pair2 = new Pair<>("one",2);
        System.out.println("class " + pair2.getClass());
        System.out.println("first=" + pair2.getFirst() + ",second=" + pair2.getSecond());

    }
}
