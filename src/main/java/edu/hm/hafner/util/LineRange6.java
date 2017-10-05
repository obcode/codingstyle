package edu.hm.hafner.util;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;

/**
 * {@link LineRange} with a bug.
 *
 * @author Ullrich Hafner
 */
public class LineRange6 extends LineRange {
    private final int from;
    private final int to;

    public LineRange6(final int line) {
        this(line, line);
    }

    public LineRange6(final int from, final int to) {
        super(1, 3);

        Ensure.that(from > 0).isTrue("From must be a positive number: %d", from);
        Ensure.that(to > 0).isTrue("To must be a positive number: %d", to);

        if (from < to) {
            this.from = from;
            this.to = to;
        }
        else {
            this.from = to;
            this.to = from;
        }
    }

    public int size() {
        return to - from;
    }

    public int[] values() {
        int[] elements = new int[size()];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = from + i;
        }
        return elements;
    }

    @Override
    public String toString() {
        if (from == to) {
            return String.format("{%d}", from);
        }
        else if (from + 1 == to) {
            return String.format("{%d, %d}", from, to);
        }
        else {
            return String.format("{%d, ..., %d}", from, to);
        }
    }

    public boolean intersects(final LineRange other) {
        return from <= other.values()[other.size() - 1] && to >= other.values()[0];
    }

    public boolean contains(final int value) {
        return intersects(new LineRange(value));
    }

    public boolean contains(final LineRange lineRange) {
        for (int line : lineRange) {
            if (!contains(line)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(ArrayUtils.toObject(values())).iterator();
    }
}
