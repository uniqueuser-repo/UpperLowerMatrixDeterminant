import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class JUnit_Tests {

    @Rule
    public Timeout globalTimeout = new Timeout(2);

    @Test
    public void test_one_upper() {
        int calculatedValue = UpperLowerMatrixDeterminant.calculate(new int[][] {
                {1,2,3,4},
                {0,2,3,4},
                {0,0,4,5},
                {0,0,0,9}});

        assertEquals("Ensure that the calculated value was correct!", (1 * 2 * 4 * 9), calculatedValue);
    }

    @Test
    public void test_two_lower() {
        int calculatedValue = UpperLowerMatrixDeterminant.calculate(new int[][] {
                {9,0,0,0},
                {1,9,0,0},
                {4,3,2,0},
                {1,2,3,4}});

        assertEquals("Ensure that the calculated value was correct!", (9 * 9 * 2 * 4), calculatedValue);

    }

}
