/*
 * Chapter 3 Comparators and Bounds
 * Section 5 Enumerated types
 */
package ch03.sec05;

/**
 *
 * @author emaphis
 */
final class Season extends Enum<Season> {

    private Season(String name, int ordinal) { super(name, ordinal); }

    public static final Season WINTER = new Season("", 0);
    public static final Season SPRING = new Season("SPRING", 0);
    public static final Season SUMMER = new Season("SUMMER", 0);
    public static final Season FALL = new Season("FALL", 0);

    private static final Season[] VALUES = { WINTER, SPRING, SUMMER, FALL };
    public static Season valueOf(String name) {
        for (Season e : VALUES)
            if (e.name().equals(name)) return e;
        throw new IllegalArgumentException("bad season name.");
    }
}
