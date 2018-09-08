/*
 * Chapter 1 Intro
 * Sec 1.1 Generics
 */
package ch01.sec01_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * GenericsTest - Some example code.
 * @author emaphis
 */
public class GenericsTest {
    /**
     * With generics
     * pp 3
     */
    public static void ex01a() {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n : ints) { s += n; }
        assert s == 6;
        System.out.println("s = " + s);
    }

    /**
     * Without generics 1.4 and under.
     * pp 3,4
     */
    public static void ex01b() {
        List ints = Arrays.asList(new Integer[] {
            new Integer(1), new Integer(3), new Integer(3)
        } );
        int s = 0;
        for (Iterator it = ints.iterator(); it.hasNext(); ) {
            int n = ((Integer)it.next()).intValue();
            s += n;
            assert s == 6;
            System.out.println("s = " + s);
        }
    }

    /**
     * 1.1 Generics example p 4
     */
    public static void ex02a() {
        List<String> words = new ArrayList<>();
        words.add("Hell0,");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        System.out.println(s);
    }

    /**
     * 1.1 Generics example before generics p.5
     * Casting needed to recover String type.
     */
    public static void ex02b() {
        List words = new ArrayList();
        words.add("Hello, ");
        words.add("world!");
        String s = ((String) words.get(0)) + ((String)words.get(1));
        System.out.println(s);
    }

    public static void main(String[] args) {
        ex01a();
        ex01b();
        ex02a();
        ex02b();
    }
}
