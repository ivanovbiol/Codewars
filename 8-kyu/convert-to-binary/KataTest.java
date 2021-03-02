import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {

    // Test provided by codewars.com
    @Test
    public void testToBinary() {
        assertEquals(1, Kata.toBinary(1));
        assertEquals(10, Kata.toBinary(2));
        assertEquals(11, Kata.toBinary(3));
        assertEquals(101, Kata.toBinary(5));
    }

    // My test cases
    @Test(expected = NumberFormatException.class)
    public void testNegativeInputThrowsException() {
        Kata.toBinary(-1);
        Kata.toBinary(-1024);
    }

    @Test(expected = NumberFormatException.class)
    public void testIntegerMaxValueInputThrowsException() {
        Kata.toBinary(1024);
        Kata.toBinary(Integer.MAX_VALUE);
    }

    @Test
    public void testZeroInputReturnsZero() {
        assertEquals(0, Kata.toBinary(0));

    }

    @Test
    public void testValidInputReturnsResult() {
        assertEquals(1111111111, Kata.toBinary(1023));

    }
}