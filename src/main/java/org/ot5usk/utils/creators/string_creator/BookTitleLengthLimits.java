package org.ot5usk.utils.creators.string_creator;

public enum BookTitleLengthLimits {
    MIN(1),
    AVERAGE(50),
    MAX(100);

    private final int length;

    BookTitleLengthLimits(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}