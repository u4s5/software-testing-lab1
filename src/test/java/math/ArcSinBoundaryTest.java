package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
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

    @Parameters(name = "{index}) {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1.57, "Testing x=1", "End Points Testing"},
                {1 - delta, 1.43, "Testing x=1-delta", "End Points Testing"},
                {1 + delta, Double.NaN, "Testing x=1+delta", "End Points Testing"},

                {-1, -1.57, "Testing x=-1", "End Points Testing"},
                {-1 - delta, Double.NaN, "Testing x=-1-delta", "End Points Testing"},
                {-1 + delta, -1.43, "Testing x=-1+delta", "End Points Testing"},


                {0, 0, "Testing x=0", "Null Point Testing"},
                {0 - delta, -0.01, "Testing x=0-delta", "Null Point Testing"},
                {0 + delta, 0.01, "Testing x=0+delta", "Null Point Testing"},


                {0.6, 0.64, "Testing x=0.6", "Middle Points Testing"},
                {0.6 - delta, 0.63, "Testing x=0.6-delta", "Middle Points Testing"},
                {0.6 + delta, 0.66, "Testing x=0.6+delta", "Middle Points Testing"},

                {-0.6, -0.64, "Testing x=-0.6", "Middle Points Testing"},
                {-0.6 - delta, -0.66, "Testing x=-0.6-delta", "Middle Points Testing"},
                {-0.6 + delta, -0.63, "Testing x=-0.6+delta", "Middle Points Testing"},
        });
    }

    @Test
    public void testCase() {
        assertEquals(failMsg, expectedResult, Functions.arcsin(arg), delta);
    }

}
