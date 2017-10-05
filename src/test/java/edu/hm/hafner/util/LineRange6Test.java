package edu.hm.hafner.util;

/** Tests a bug in class {@link LineRange} */
public class LineRange6Test extends LineRangeTest {
    @Override
    protected LineRange createLineRange(final int line) {
        return new LineRange6(line);
    }

    @Override
    protected LineRange createLineRange(final int from, final int to) {
        return new LineRange6(from, to);
    }
}
