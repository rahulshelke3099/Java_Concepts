package org.java.basics;

public enum Enum_with_values {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4);

    private final int i;

    Enum_with_values(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}

