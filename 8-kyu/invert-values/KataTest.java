import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import org.junit.Test;

public class KataTest {

    // Tests provided by codewars.com
    @Test
    public void testSomething() {
        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[] {-1,2,-3,4,-5};
        expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[] {0};
        expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
    }

    // My test cases
    @Test(expected = NullPointerException.class)
    public void testTaskThrowsExceptionIfInputIsEmpty() {
        assertNull(Kata.INVALID_NULL_INPUT, Kata.invert(null));
    }
}