import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointSystemTest {

    protected PointSystem solution;

    @Before
    public void setUp() {
        solution = new PointSystem();
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
        int pointsToWin = 2;
        int pointsToWinBy = 1;
        int skill = 40;

        double expected = 0.352;
        double actual = solution.oddsOfWinning(pointsToWin, pointsToWinBy, skill);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int pointsToWin = 4;
        int pointsToWinBy = 5;
        int skill = 50;

        double expected = 0.4999999999999998;
        double actual = solution.oddsOfWinning(pointsToWin, pointsToWinBy, skill);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int pointsToWin = 3;
        int pointsToWinBy = 3;
        int skill = 25;

        double expected = 0.035714285714285705;
        double actual = solution.oddsOfWinning(pointsToWin, pointsToWinBy, skill);

        assertEquals(expected, actual);
    }

}
