/*
 * Chapter 2 Wildcards
 * Section 7 Wildcard Capture
 */
package ch02.sec07;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Test Wildcard capture
 * @author emaphis
 */
public class WildcardCaptureTest {

    public static <T> void reverse1(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size()-i-1));
        }
    }

    // wont compile
    public static <T> void reverse2(List<?> list) {
        List<Object> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
           // list.set(i, tmp.get(list.size()-i-1)); // imcompatible types
        }
    }

    public static void reverse3(List<?> list) { rev(list); }
    private static <T> void rev(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size()-i-1));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        reverse1(list);
        System.out.println("list: " + list);

        List<String> list3 = Arrays.asList("A", "B", "C", "D");
        reverse3(list3);
        System.out.println("list3: " + list3);
    }
}
