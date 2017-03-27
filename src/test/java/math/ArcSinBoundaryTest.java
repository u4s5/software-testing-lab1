package math;

import org.junit.Test;
import org.junit.runners.Parameterized.*;

import static org.junit.Assert.assertEquals;

public class ArcSinBoundaryTest {

    private final static double delta = 1e-2;

    @Parameter
    public double arg;
    @Parameter(1)
    public double expectedResult;
    @Parameter(2)
    public String failMsg;
    @Parameter(3)
    public String testName;

    @Test
    public void endPointsTesting() {
        assertEquals("Testing x=1", Functions.arcsin(1), 1.57, delta);
        assertEquals("Testing x=1-delta", Functions.arcsin(1 - delta), 1.43, delta);
        assertEquals("Testing x=1+delta", Functions.arcsin(1 + delta), Double.NaN, delta);

        assertEquals("Testing x=-1", Functions.arcsin(-1), -1.57, delta);
        assertEquals("Testing x=-1-delta", Functions.arcsin(-1 - delta), Double.NaN, delta);
        assertEquals("Testing x=-1+delta", Functions.arcsin(-1 + delta), -1.43, delta);
    }

    @Test
    public void nullPointTesting() {
        assertEquals("Testing x=0", Functions.arcsin(0), 0, delta);
        assertEquals("Testing x=0-delta", Functions.arcsin(0 - delta), -0.01, delta);
        assertEquals("Testing x=0+delta", Functions.arcsin(0 + delta), 0.01, delta);
    }

    @Test
    public void middlePointsTesting() {
        assertEquals("Testing x=0.6", Functions.arcsin(0.6), 0.64, delta);
        assertEquals("Testing x=0.6-delta", Functions.arcsin(0.6 - delta), 0.63, delta);
        assertEquals("Testing x=0.6+delta", Functions.arcsin(0.6 + delta), 0.66, delta);

        assertEquals("Testing x=-0.6", Functions.arcsin(-0.6), -0.64, delta);
        assertEquals("Testing x=-0.6-delta", Functions.arcsin(-0.6 - delta), -0.66, delta);
        assertEquals("Testing x=-0.6+delta", Functions.arcsin(-0.6 + delta), -0.63, delta);
    }

}
