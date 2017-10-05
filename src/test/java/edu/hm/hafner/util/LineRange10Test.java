package edu.hm.hafner.util;

/** * Tests the class {@link LineRange}. * * @author Ullrich Hafner */
public class LineRange10Test extends LineRangeTest {
    @Override
    protected LineRange createLineRange(final int line) {
        return new LineRange10(line);
    }

    @Override
    protected LineRange createLineRange(final int from, final int to) {
        return new LineRange10(from, to);
    }
}
