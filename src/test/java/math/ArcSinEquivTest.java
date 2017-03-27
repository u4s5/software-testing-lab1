package math;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ArcSinEquivTest {

    private final static double delta = 1e-2;

    @Test
    public void region1Test() {
        assertEquals("Testing x = -0.9", Functions.arcsin(-0.9), -1.12, delta);
        assertEquals("Testing x = -0.65", Functions.arcsin(-0.65), -0.71, delta);
    }

    @Test
    public void region2Test() {
        assertEquals("Testing x = -0.4", Functions.arcsin(-0.4), -0.41, delta);
        assertEquals("Testing x = -0.19", Functions.arcsin(-0.19), -0.19, delta);
    }

    @Test
    public void region3Test() {
        assertEquals("Testing x = 0.23", Functions.arcsin(0.23), 0.23, delta);
        assertEquals("Testing x = 0.45", Functions.arcsin(0.45), 0.47, delta);
    }

    @Test
    public void region4Test() {
        assertEquals("Testing x = 0.67", Functions.arcsin(0.67), 0.73, delta);
        assertEquals("Testing x = 0.91", Functions.arcsin(0.91), 1.14, delta);
    }

}
