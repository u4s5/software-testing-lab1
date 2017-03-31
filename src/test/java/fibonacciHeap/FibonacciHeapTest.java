package fibonacciHeap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciHeapTest {

    private FibonacciHeap fb;
    private StringBuilder log;

    @Before
    public void init() {
        fb = new FibonacciHeap();
        log = new StringBuilder();

        fb.add(1, log);
        fb.add(-5, log);
        fb.add(4, log);

        fb.extractMin(log);
        fb.extractMin(log);
    }

    @Test
    public void testFibonacciHeap() {
        assertEquals("Testing log", log.toString(), "012013401356NKLM89AABFKLMGJDDE1256NOPL13KLM89ADE12");
    }

}
