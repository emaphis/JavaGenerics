/*
 * Chapter 1 Intro
 * Section 4 Generic Methods and varargs
 */
package ch01.sec04_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Some generic list functions
 * 4.2 pp 11
 * @author emaphis
 */
public class Lists {
    /**
     * Convert an array to a List of the same type
     * 1.4 pg 11
     * @param <T> type of array
     * @param arr array to convert to List
     * @return converted List;
     */
    public static <T> List<T> toList2(T... arr) {
        List<T> list = new ArrayList<>();
        for (T elt : arr) list.add(elt);
        return list;
    }

    /**
     *
     *  1.4 pg 11
     * @param <T>
     * @param list
     * @param arr
     */
    public static <T> void addAll(List<T> list, T... arr) {
        for (T elt : arr) list.add(elt);
    }
}
