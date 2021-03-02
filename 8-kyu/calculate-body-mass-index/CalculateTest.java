import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {

    // Test provided by codewars.com
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

    // My test cases
    @Test(expected = NumberFormatException.class)
    public void testNegativeInputThrowsException() {
        Calculate.bmi(-88.4, 1.80);
        Calculate.bmi(62.5, -1.73);
        Calculate.bmi(-101.8, -1.94);
    }

    @Test(expected = NumberFormatException.class)
    public void testZeroInputThrowsException() {
        Calculate.bmi(0.0, 1.80);
        Calculate.bmi(62.5, 0.0);
        Calculate.bmi(0, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidWeightInputThrowsException() {
        Calculate.bmi(350.1, 1.80);
        Calculate.bmi(351.0, 1.80);
        Calculate.bmi(457.0, 1.80);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidHeightInputThrowsException() {
        Calculate.bmi(62.1, 2.301);
        Calculate.bmi(84.5, 2.31);
        Calculate.bmi(92.9, 2.52);
    }

    @Test
    public void testValidInputReturnsProperResult() {
        assertEquals(Calculate.UNDERWEIGHT_INDEX, Calculate.bmi(62, 1.9));
        assertEquals(Calculate.NORMAL_INDEX, Calculate.bmi(72, 1.73));
        assertEquals(Calculate.NORMAL_INDEX, Calculate.bmi(125, 2.30));
        assertEquals(Calculate.OVERWEIGHT_INDEX, Calculate.bmi(92, 1.84));
        assertEquals(Calculate.OBESE_INDEX, Calculate.bmi(121, 1.89));
        assertEquals(Calculate.OBESE_INDEX, Calculate.bmi(350, 1.95));
        assertEquals(Calculate.OBESE_INDEX, Calculate.bmi(350, 2.30));
    }
}