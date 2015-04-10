import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaitingForBusTest {

    protected WaitingForBus solution;

    @Before
    public void setUp() {
        solution = new WaitingForBus();
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
        int[] time = new int[]{5, 100};
        int[] prob = new int[]{90, 10};
        int s = 5;

        double expected = 9.5;
        double actual = solution.whenWillBusArrive(time, prob, s);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] time = new int[]{5};
        int[] prob = new int[]{100};
        int s = 101;

        double expected = 4.0;
        double actual = solution.whenWillBusArrive(time, prob, s);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] time = new int[]{5, 10};
        int[] prob = new int[]{50, 50};
        int s = 88888;

        double expected = 3.666666666666667;
        double actual = solution.whenWillBusArrive(time, prob, s);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] time = new int[]{1, 2, 3, 4};
        int[] prob = new int[]{10, 20, 30, 40};
        int s = 1000;

        double expected = 1.166666666666667;
        double actual = solution.whenWillBusArrive(time, prob, s);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] time = new int[]{10, 100, 1000, 10000, 100000};
        int[] prob = new int[]{90, 4, 3, 2, 1};
        int s = 100000;

        double expected = 21148.147303578935;
        double actual = solution.whenWillBusArrive(time, prob, s);

        assertEquals(expected, actual);
    }

}
