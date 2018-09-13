/*
 * Chapter 4 Declarations
 * Section 2 Static Members
 */
package ch04.sec02;

/**
 * Test the Cell class
 * @author emaphis
 */
public class CellTest {

    // 4.2 pg 53
    public static void testCell() {
        Cell<String> a = new Cell<>("one");
        Cell<Integer> b = new Cell<>(2);
        System.out.println("a_id=" + (a.getId() == 0) + ",b_id=" + (b.getId() == 1) +
                   ",cell_count:" + Cell.getCount());
    }

    // 4.2 pg 53
    public static void testCell2() {
        Cell2<String> a = new Cell2<>("one");
        Cell2<Integer> b = new Cell2<>(2);
        System.out.println("static values: " + Cell2.getValues().toString());
    }

    public static void main(String[] args) {
        testCell();
        testCell2();
    }
}
