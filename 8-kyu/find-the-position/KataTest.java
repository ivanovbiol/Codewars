import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {

    // Tests provided by codewars.com
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }

    // My test cases
    @Test
    public void testCapitalLettersInputReturnsResult() {
        assertEquals("Position of alphabet: 1", Kata.position('A'));
        assertEquals("Position of alphabet: 26", Kata.position('Z'));
        assertEquals("Position of alphabet: 5", Kata.position('E'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalLettersInputThrowsException() {
        Kata.position('.');
        Kata.position('!');
        Kata.position('%');
        Kata.position('_');
    }
}