package edu.hm.hafner.util;

import java.util.Iterator;

/**
 * {@link LineRange} with a bug.
 *
 * @author Ullrich Hafner
 */
public class LineRange1 extends LineRange {
    private int[] values;

    public LineRange1(final int line) {
        super(line);
    }

    public LineRange1(final int from, final int to) {
        super(from, to);

        values = super.values();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public int[] values() {
        return values;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean intersects(final LineRange other) {
        return super.intersects(other);
    }

    @Override
    public boolean contains(final int value) {
        return super.contains(value);
    }

    @Override
    public boolean contains(final LineRange lineRange) {
        return super.contains(lineRange);
    }

    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}
