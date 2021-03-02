import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockTest {

    // Tests provided by codewars.com
    @Test
    public void testDefault() {
        assertEquals(61000, Clock.Past(0, 1, 1));
    }

    // My test cases
    @Test(expected = NumberFormatException.class)
    public void testInvalidHour() {
        Clock.Past(24, 1, 1);
        Clock.Past(52, 1, 1);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidMinutes() {
        Clock.Past(9, 60, 1);
        Clock.Past(9, 91, 1);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidSeconds() {
        Clock.Past(9, 52, 60);
        Clock.Past(9, 52, 72);
    }

    @Test
    public void testIntegerCanNotOverflowWithMaximumValues() {
        assertEquals(86399000, Clock.Past(23, 59, 59));
    }
}