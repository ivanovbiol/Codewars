import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AsciiTest {

    // Tests provided by codewars.com
    @Test
    public void testChar() {
        assertEquals('7', Ascii.getChar(55));
        assertEquals('8', Ascii.getChar(56));
        assertEquals('9', Ascii.getChar(57));
        assertEquals(':', Ascii.getChar(58));
        assertEquals(';', Ascii.getChar(59));
        assertEquals('<', Ascii.getChar(60));
        assertEquals('=', Ascii.getChar(61));
        assertEquals('>', Ascii.getChar(62));
        assertEquals('?', Ascii.getChar(63));
        assertEquals('@', Ascii.getChar(64));
        assertEquals('A', Ascii.getChar(65));
    }

    // My test cases
    @Test
    public void testValidInputShouldReturnProperResult() {
        for (int i = 0; i < 128; i++) {
            assertEquals((char) i, Ascii.getChar(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputShouldThrowException() {
        Ascii.getChar(-1);
        Ascii.getChar(-52);
        Ascii.getChar(-1024);
        Ascii.getChar(128);
        Ascii.getChar(305);
        Ascii.getChar(1024);
    }
}