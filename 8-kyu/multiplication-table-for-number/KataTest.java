import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {

    @Test
    public void testTaskRetunrsCorrectResultWithFiveInput() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb
                    .append(i)
                    .append(" * ")
                    .append(5)
                    .append(" = ")
                    .append(i * 5)
                    .append(System.lineSeparator());
        }

        String expected = sb.toString().trim();
        assertEquals(expected, Kata.multiTable(5));
    }

    @Test
    public void testTaskRetunrsCorrectResultWithOneInput() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb
                    .append(i)
                    .append(" * ")
                    .append(1)
                    .append(" = ")
                    .append(i)
                    .append(System.lineSeparator());
        }

        String expected = sb.toString().trim();

        assertEquals(expected, Kata.multiTable(1));
    }

    // My test cases
    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputIsInvalid() {
        assertEquals(Kata.INVALID_NUMBER_INPUT, Kata.multiTable(0));
        assertEquals(Kata.INVALID_NUMBER_INPUT, Kata.multiTable(-10));
        assertEquals(Kata.INVALID_NUMBER_INPUT, Kata.multiTable(11));
        assertEquals(Kata.INVALID_NUMBER_INPUT, Kata.multiTable(111));
    }
}