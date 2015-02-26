import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreaterGameTest {

    protected GreaterGame solution;

    @Before
    public void setUp() {
        solution = new GreaterGame();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] hand = new int[]{4, 2};
        int[] sothe = new int[]{-1, -1};

        double expected = 1.5;
        double actual = solution.calc(hand, sothe);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] hand = new int[]{4, 2};
        int[] sothe = new int[]{1, 3};

        double expected = 2.0;
        double actual = solution.calc(hand, sothe);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] hand = new int[]{2};
        int[] sothe = new int[]{-1};

        double expected = 1.0;
        double actual = solution.calc(hand, sothe);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] hand = new int[]{1, 3, 5, 7};
        int[] sothe = new int[]{8, -1, 4, -1};

        double expected = 2.5;
        double actual = solution.calc(hand, sothe);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] hand = new int[]{6, 12, 17, 14, 20, 8, 16, 7, 2, 15};
        int[] sothe = new int[]{-1, -1, 4, -1, 11, 3, 13, -1, -1, 18};

        double expected = 8.0;
        double actual = solution.calc(hand, sothe);

        assertEquals(expected, actual);
    }

}
