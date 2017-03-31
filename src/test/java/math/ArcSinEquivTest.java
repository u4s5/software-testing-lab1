package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ArcSinEquivTest {

    private final static double delta = 1e-2;

    @Parameterized.Parameter
    public double arg;
    @Parameterized.Parameter(1)
    public double expectedResult;
    @Parameterized.Parameter(2)
    public String failMsg;
    @Parameterized.Parameter(3)
    public String testName;

    @Parameterized.Parameters(name = "{index}) {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-0.9, -1.12, "Testing x = -0.9", "Region 1 test"},
                {-0.65, -0.71, "Testing x = -0.65", "Region 1 test"},

                {-0.4, -0.41, "Testing x = -0.4", "Region 2 test"},
                {-0.19, -0.19, "Testing x = -0.19", "Region 2 test"},

                {0.23, 0.23, "Testing x = 0.23", "Region 3 test"},
                {0.45, 0.47, "Testing x = 0.45", "Region 3 test"},

                {0.67, 0.73, "Testing x = 0.67", "Region 4 test"},
                {0.91, 1.14, "Testing x = 0.91", "Region 4 test"}
        });
    }

    @Test
    public void testCase() {
        assertEquals(failMsg, expectedResult, Functions.arcsin(arg), delta);
    }

}
