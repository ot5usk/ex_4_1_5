package org.ot5usk.utils.creators.string_creator;

public enum AuthorNameLengthLimits {
    MIN(1),
    AVERAGE(25),
    MAX(50);

    private final int length;

    AuthorNameLengthLimits(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}