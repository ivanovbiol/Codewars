import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CockroachTest {

    // Tests provided by codewars.com
    @Test
    public void basicTests() throws Exception {
        assertEquals(30, Cockroach.cockroachSpeed(1.08));
        assertEquals(30, Cockroach.cockroachSpeed(1.09));
        assertEquals(0, Cockroach.cockroachSpeed(0));
    }

    // My test cases
    @Test
    public void testTaskReturnsProperResultWithValidInput() {
        assertEquals(147, Cockroach.cockroachSpeed(5.32));
        assertEquals(1522, Cockroach.cockroachSpeed(54.8));
        assertEquals(293552, Cockroach.cockroachSpeed(10567.881));
    }

    @Test(expected = NumberFormatException.class)
    public void testInputCanNotBeNegative() {
        Cockroach.cockroachSpeed(-1.0);
        Cockroach.cockroachSpeed(-52.6);
    }

    @Test
    public void testIntegerWillNotOverflow() {
        assertEquals(2147483647, Cockroach.cockroachSpeed(Double.MAX_VALUE));
    }
}