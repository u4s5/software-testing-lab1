package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArcSinUndefinedTest {

    @Test
    public void negativeTest() {
        assertEquals("Testing x = -1000", Functions.arcsin(-1000), Double.NaN, 0);
        assertEquals("Testing x = -MaxValue", Functions.arcsin(-Double.MAX_VALUE), Double.NaN, 0);
    }

    @Test
    public void positiveTest() {
        assertEquals("Testing x = 10000", Functions.arcsin(10000), Double.NaN, 0);
        assertEquals("Testing x = MaxValue", Functions.arcsin(Double.MAX_VALUE), Double.NaN, 0);
    }

}
