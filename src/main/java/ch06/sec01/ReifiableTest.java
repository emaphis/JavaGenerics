/*
 * Chapter 6 Riefiable
 * Section 1
 */
package ch06.sec01;

import java.util.List;
import java.util.Collection;

/**
 *
 * @author emaphis
 */
public class ReifiableTest {

    public static <T> List<T> asList(Collection<T> c) throws IllegalArgumentException {
        if (c instanceof List<?>) {
            return (List<T>)c;
        } else
            throw new IllegalArgumentException("Argument not a list");
    }
}
