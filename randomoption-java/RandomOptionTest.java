import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomOptionTest {

    protected RandomOption solution;

    @Before
    public void setUp() {
        solution = new RandomOption();
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
        int keyCount = 5;
        int[] badLane1 = new int[]{0};
        int[] badLane2 = new int[]{3};

        double expected = 0.6;
        double actual = solution.getProbability(keyCount, badLane1, badLane2);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int keyCount = 5;
        int[] badLane1 = new int[]{0, 1, 2};
        int[] badLane2 = new int[]{1, 2, 0};

        double expected = 0.1;
        double actual = solution.getProbability(keyCount, badLane1, badLane2);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int keyCount = 5;
        int[] badLane1 = new int[]{2, 2, 2, 2};
        int[] badLane2 = new int[]{0, 1, 3, 4};

        double expected = 0.0;
        double actual = solution.getProbability(keyCount, badLane1, badLane2);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int keyCount = 7;
        int[] badLane1 = new int[]{0, 1, 2};
        int[] badLane2 = new int[]{6, 5, 4};

        double expected = 0.3904761904761904;
        double actual = solution.getProbability(keyCount, badLane1, badLane2);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int keyCount = 7;
        int[] badLane1 = new int[]{3, 5, 1, 0, 2, 6, 4};
        int[] badLane2 = new int[]{0, 2, 4, 6, 1, 5, 3};

        double expected = 0.09166666666666667;
        double actual = solution.getProbability(keyCount, badLane1, badLane2);

        assertEquals(expected, actual);
    }

}
