package edu.hm.hafner.util;

/** Tests a bug in class {@link LineRange} */
public class LineRange15Test extends LineRangeTest {
    @Override
    protected LineRange createLineRange(final int line) {
        return new LineRange15(line);
    }

    @Override
    protected LineRange createLineRange(final int from, final int to) {
        return new LineRange15(from, to);
    }
}
