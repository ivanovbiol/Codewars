import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SchoolTest {

    // Tests provided by codewars.com
    @Test
    public void simpleTest() {
        assertEquals(2, School.getAverage(new int[]{2, 2, 2, 2}));
        assertEquals(3, School.getAverage(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, School.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }

    // My test cases
    @Test(expected = NullPointerException.class)
    public void testTaskThrowsExceptionIfInputIsNull() {
        School.getAverage(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputArrayIsEmpty() {
        School.getAverage(new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputArrayContainsZero() {
        School.getAverage(new int[]{1, 5, 4, 0, 3});
        School.getAverage(new int[]{0, 0, 0, 0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputArrayContainsNegativeNumbers() {
        School.getAverage(new int[]{1, 5, 4, -4, 3});
        School.getAverage(new int[]{-1, -5, -6});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTaskThrowsExceptionIfInputArrayContainsInvalidNumbers() {
        School.getAverage(new int[]{1, 5, 4, 7, 3});
    }
}