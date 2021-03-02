import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FakeBinaryTest {

    // My test cases
    @Test
    public void testNegativeInputReturnsExpectedResult() {
       assertEquals("-11", FakeBinary.fakeBin("-56"));
       assertEquals("-01", FakeBinary.fakeBin("-06"));
       assertEquals("-10", FakeBinary.fakeBin("-72"));
    }

    @Test
    public void testPositiveInputReturnsExpectedResult() {
        assertEquals("11", FakeBinary.fakeBin("56"));
        assertEquals("01", FakeBinary.fakeBin("06"));
        assertEquals("10", FakeBinary.fakeBin("72"));
    }

    @Test
    public void testZeroInputReturnsExpectedResult() {
        assertEquals("0", FakeBinary.fakeBin("0"));
        assertEquals("0000", FakeBinary.fakeBin("0000"));
    }

}