package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ArcSinUndefinedTest {

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
                {-1000, Double.NaN, "Testing x = -1000", "Negative Test"},
                {-Double.MAX_VALUE, Double.NaN, "Testing x = -MaxValue", "Negative Test"},

                {10000, Double.NaN, "Testing x = 10000", "Positive Test"},
                {Double.MAX_VALUE, Double.NaN, "Testing x = MaxValue", "Positive Test"}
        });
    }

    @Test
    public void testCase() {
        assertEquals(failMsg, expectedResult, Functions.arcsin(arg), 0);
    }

}
