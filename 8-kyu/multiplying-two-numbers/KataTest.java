import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {

    // Tests provided by codewars.com
    @Test
    public void sampleTest() {
        assertEquals(4, Kata.multiply(2, 2));
        assertEquals(10, Kata.multiply(5, 2));
        assertEquals(100, Kata.multiply(100, 1));
        assertEquals(0, Kata.multiply(0, 1000));
    }

    // My test cases
    @Test
    public void testTaskReturnsNegativeNumberIfOneNumberIsNegative() {
        assertEquals(-6, Kata.multiply(-3, 2));
        assertEquals(-473, Kata.multiply(11, -43));
    }

    @Test
    public void testTaskReturnsPositiveNumberIfBothNumbersAreNegative() {
        assertEquals(120, Kata.multiply(-30, -4));
    }
}
