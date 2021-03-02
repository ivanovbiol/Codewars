import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrassHopperTest {

    // Tests provided by codewars.com
    @Test
    public void testMethodReturnsA() {
        assertEquals('A', GrassHopper.getGrade(95, 90, 93));
        assertEquals('A', GrassHopper.getGrade(100, 85, 96));
        assertEquals('A', GrassHopper.getGrade(92, 93, 94));
        assertEquals('A', GrassHopper.getGrade(100, 100, 100));
    }

    @Test
    public void testMethodReturnsB() {
        assertEquals('B', GrassHopper.getGrade(70, 70, 100));
        assertEquals('B', GrassHopper.getGrade(82, 85, 87));
        assertEquals('B', GrassHopper.getGrade(84, 79, 85));
    }

    @Test
    public void testMethodReturnsC() {
        assertEquals('C', GrassHopper.getGrade(70, 70, 70));
        assertEquals('C', GrassHopper.getGrade(75, 70, 79));
        assertEquals('C', GrassHopper.getGrade(60, 82, 76));
    }

    @Test
    public void testMethodReturnsD() {
        assertEquals('D', GrassHopper.getGrade(65, 70, 59));
        assertEquals('D', GrassHopper.getGrade(66, 62, 68));
        assertEquals('D', GrassHopper.getGrade(58, 62, 70));
    }

    @Test
    public void testMethodReturnsF() {
        assertEquals('F', GrassHopper.getGrade(44, 55, 52));
        assertEquals('F', GrassHopper.getGrade(48, 55, 52));
        assertEquals('F', GrassHopper.getGrade(58, 59, 60));
        assertEquals('F', GrassHopper.getGrade(0, 0, 0));
    }

    // My test cases
    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputContainsNegativeNumbers() {
        GrassHopper.getGrade(55, -1, 63);
        GrassHopper.getGrade(55, -57, -61);
        GrassHopper.getGrade(-3, -42, 23);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputContainsGreaterThanHundredNumbers() {
        GrassHopper.getGrade(49, 101, 63);
        GrassHopper.getGrade(55, 120, 197);
        GrassHopper.getGrade(1364, 1024, 23);
    }
}